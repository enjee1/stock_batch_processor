CREATE TABLE stocks (
stock_id SERIAL NOT NULL,
symbol VARCHAR(8),
stock_name VARCHAR(100),
exchange_name VARCHAR(10),
asset_type VARCHAR(10),
ipo_date VARCHAR,
delisting_date VARCHAR,
status VARCHAR(20)
);