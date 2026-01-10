-- =========================
-- 1. THÊM CỘT CHO AUTH
-- =========================

ALTER TABLE users
ADD COLUMN email VARCHAR(100) UNIQUE,
ADD COLUMN status VARCHAR(20) NOT NULL DEFAULT 'ACTIVE',
ADD COLUMN updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP;

-- =========================
-- 2. INDEX (LOGIN NHANH)
-- =========================

CREATE INDEX idx_users_username ON users(username);
CREATE INDEX idx_users_email ON users(email);

-- =========================
-- 3. USER MẪU ĐỂ TEST
-- password = 123456 (BCrypt)
-- =========================

INSERT INTO users (username, password, email)
VALUES (
    'user1',
    '$2a$10$7QXy7G6d3nQm6m8Z8xj7eOZ8wH6Z1JqZxK3Nn0F9pF9dY7WQY5W0y',
    'user1@minibank.local'
);
