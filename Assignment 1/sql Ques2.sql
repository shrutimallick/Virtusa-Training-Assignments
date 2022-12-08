CREATE TABLE product (
    id INT,
    NAME VARCHAR(10),
    price INT,
    location VARCHAR(10)
);


INSERT INTO product VALUES (1,'pen',5,'bbsr'),
			   (2,'eraser',2,'ctc'),
			   (3,'pencil',3,'puri');

SELECT * FROM product

CREATE TABLE manufacturer (
    id INT,
    company_name VARCHAR(10),
    product_id INT,
    address VARCHAR(10)
);
INSERT INTO manufacturer VALUES	(1,'tcs',5,'bbsr'),
				(2,'elxsi',9,'blr');

SELECT manufacturer.company_name,product.location FROM product INNER JOIN manufacturer ON product.id=manufacturer.id;
