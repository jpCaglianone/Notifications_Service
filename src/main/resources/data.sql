-- Inserir dados em users
INSERT INTO users (user_id, name, email, telephone) VALUES
                                                        ('550e8400-e29b-41d4-a716-446655440000', 'John Doe', 'john.doe@example.com', '123-456-7890'),
                                                        ('550e8400-e29b-41d4-a716-446655440001', 'Jane Smith', 'jane.smith@example.com', '987-654-3210');

-- Inserir dados em orders
INSERT INTO orders (order_id, description, status) VALUES
                                                       ('550e8400-e29b-41d4-a716-446655440002', 'Order 1', 'Pending'),
                                                       ('550e8400-e29b-41d4-a716-446655440003', 'Order 2', 'Completed');

-- Inserir dados em notifications
INSERT INTO notifications (id, message, user_id, send_date, order_id, content) VALUES
                                                                                   ('550e8400-e29b-41d4-a716-446655440004', 'Notification 1', '550e8400-e29b-41d4-a716-446655440000', '2024-09-12T10:00:00', '550e8400-e29b-41d4-a716-446655440002', 'Content of notification 1'),
                                                                                   ('550e8400-e29b-41d4-a716-446655440005', 'Notification 2', '550e8400-e29b-41d4-a716-446655440001', '2024-09-12T11:00:00', '550e8400-e29b-41d4-a716-446655440003', 'Content of notification 2');
