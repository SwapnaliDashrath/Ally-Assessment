DROP TABLE IF EXISTS auctionitems;
 
CREATE TABLE auctionitems (
  actionitem_id VARCHAR(250),
  current_bid DOUBLE NOT NULL,
  reserve_price DOUBLE NOT NULL
  --career VARCHAR(250) DEFAULT NULL
);
 

INSERT INTO auctionitems (actionitem_id, current_bid, reserve_price) VALUES
  ('5678', 0.00, 1234.00),
  ('91011', 10.00, 1500.00),
  ('121314', 11.00, 1230.40);