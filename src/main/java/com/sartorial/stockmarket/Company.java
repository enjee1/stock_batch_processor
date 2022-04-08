package com.sartorial.stockmarket;

import javax.persistence.*;

@Entity
@Table(name="stocks")
public class Company {
    //TODO:Increment stock_id in table
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="stock_id")
    private int stockId;
    @Column(name="symbol")
    private String symbol;
    @Column(name="stock_name")
    private String name;
    @Column(name="exchange_name")
    private String exchange;
    @Column(name="asset_type")
    private String assetType;
    @Column(name="ipo_date")
    private String ipoDate;
    @Column(name="delisting_date")
    private String delistingDate;
    @Column(name="status")
    private String status;

    public Company() {

    }

    public Company(String symbol, String name, String exchange, String assetType, String ipoDate, String delistingDate, String status) {
        this.symbol = symbol;
        this.name = name;
        this.exchange = exchange;
        this.assetType = assetType;
        this.ipoDate = ipoDate;
        this.delistingDate = delistingDate;
        this.status = status;
    }

    public int getStockId() {
        return stockId;
    }

    public void setStockId(int stockId) {
        this.stockId = stockId;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExchange() {
        return exchange;
    }

    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    public String getAssetType() {
        return assetType;
    }

    public void setAssetType(String assetType) {
        this.assetType = assetType;
    }

    public String getIpoDate() {
        return ipoDate;
    }

    public void setIpoDate(String ipoDate) {
        this.ipoDate = ipoDate;
    }

    public String getDelistingDate() {
        return delistingDate;
    }

    public void setDelistingDate(String delistingDate) {
        this.delistingDate = delistingDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() { return "[" + name + "<><>" + symbol + "<><>" + ipoDate + "<><>" + status; }
}
