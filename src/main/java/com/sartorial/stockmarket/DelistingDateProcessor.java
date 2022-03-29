package com.sartorial.stockmarket;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

public class DelistingDateProcessor implements ItemProcessor<Company, Company> {

    private static final Logger log = LoggerFactory.getLogger(DelistingDateProcessor.class);

    @Override
    public Company process(final Company company) throws Exception {
        final String symbol = company.getSymbol().toUpperCase();
        final String delistingDate = company.getDelistingDate();
        final Company companyStock;

        if (delistingDate == "null") { company.setDelistingDate("Delisting Date N/A"); }

        companyStock = new Company(
                    symbol, company.getName(), company.getExchange(),
                    company.getAssetType(), company.getIpoDate(), company.getDelistingDate(), company.getStatus());


        log.info("Checking for delisting date for " + symbol + "..." + companyStock.getDelistingDate());
        return companyStock;
    }
}
