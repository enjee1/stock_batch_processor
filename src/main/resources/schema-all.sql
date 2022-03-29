DROP TABLE stocks IF EXISTS;

CREATE TABLE stocks (
stock_id BIGINT NOT NULL PRIMARY KEY,
symbol VARCHAR(8),
stock_name VARCHAR(20),
exchange_name VARCHAR(10),
asset_type VARCHAR(10),
ipo_date DATE,
delisting_date DATE,
status VARCHAR(20)
);