use logasp;


# DROP TABLE account,payment,customer;

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
                         paymentDate DATE,
                         paymentMethod VARCHAR(50),
                         paymentStatus VARCHAR(20),
                         customerId BIGINT,
                         FOREIGN KEY (customerId) REFERENCES customer(id)
);

CREATE TABLE account (
                         id BIGINT AUTO_INCREMENT PRIMARY KEY,
                         customerId BIGINT,
                         balance DECIMAL(10, 2),
                         accountType VARCHAR(50),
                         accountStatus VARCHAR(20),
                         FOREIGN KEY (customerId) REFERENCES customer(id)
);
