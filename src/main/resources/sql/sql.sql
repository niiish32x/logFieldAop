use logasp;


DROP TABLE account,payment,customer;

CREATE TABLE customer (
                          id BIGINT AUTO_INCREMENT PRIMARY KEY,
                          customer_name VARCHAR(255),
                          phone_number VARCHAR(20),
                          email VARCHAR(255),
                          address VARCHAR(255),
                          registration_date DATE,
                          credit_level VARCHAR(20)
);


CREATE TABLE payment (
                         id BIGINT AUTO_INCREMENT PRIMARY KEY,
                         amount DECIMAL(10, 2),
                         payment_date DATE,
                         payment_method VARCHAR(50),
                         payment_status VARCHAR(20),
                         customer_id BIGINT,
                         FOREIGN KEY (customer_id) REFERENCES customer(id)
);

CREATE TABLE account (
                         id BIGINT AUTO_INCREMENT PRIMARY KEY,
                         customer_id BIGINT,
                         balance DECIMAL(10, 2),
                         accountType VARCHAR(50),
                         accountStatus VARCHAR(20),
                         FOREIGN KEY (customer_id) REFERENCES customer(id)
);
