CREATE TABLE notifications (
                               id UUID PRIMARY KEY,
                               message VARCHAR(255),
                               user_id UUID,
                               send_date TIMESTAMP,
                               order_id UUID,
                               content TEXT
);

CREATE TABLE orders (
                        order_id UUID PRIMARY KEY,
                        description VARCHAR(255),
                        status VARCHAR(50)
);

CREATE TABLE users (
                       user_id UUID PRIMARY KEY,
                       name VARCHAR(255),
                       email VARCHAR(255),
                       telephone VARCHAR(50)
);
