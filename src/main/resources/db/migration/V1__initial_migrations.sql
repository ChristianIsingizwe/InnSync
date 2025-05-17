-- ############################################
-- Table: users
-- ############################################
CREATE TABLE IF NOT EXISTS users (
    id         SERIAL PRIMARY KEY,                  -- auto-incrementing user ID
    name       VARCHAR(100) NOT NULL,               -- user’s full name
    email      VARCHAR(255) NOT NULL UNIQUE,        -- must be unique
    password   VARCHAR(255) NOT NULL,               -- hashed password
    role       VARCHAR(50)  NOT NULL                -- e.g. 'guest', 'admin'
    );

-- ############################################
-- Table: hotels
-- ############################################
CREATE TABLE IF NOT EXISTS hotels (
    id         SERIAL PRIMARY KEY,                  -- auto-incrementing hotel ID
    name       VARCHAR(200) NOT NULL,               -- hotel name
    location   VARCHAR(255) NOT NULL                -- city, address, etc.
);

-- ############################################
-- Table: rooms
-- ############################################
CREATE TABLE IF NOT EXISTS rooms (
    id         SERIAL PRIMARY KEY,                  -- auto-incrementing room ID
    hotel_id   INTEGER NOT NULL REFERENCES hotels(id) ON DELETE CASCADE,
    room_number VARCHAR(20) NOT NULL,               -- e.g. '101A', 'Suite 5'
    type       VARCHAR(50)  NOT NULL,               -- e.g. 'single', 'double'
    rate       NUMERIC(10,2) NOT NULL               -- nightly rate
);

-- ############################################
-- Table: bookings
-- ############################################
CREATE TABLE IF NOT EXISTS bookings (
    id          SERIAL PRIMARY KEY,                 -- auto-incrementing booking ID
    user_id     INTEGER NOT NULL REFERENCES users(id) ON DELETE RESTRICT,
    room_id     INTEGER NOT NULL REFERENCES rooms(id) ON DELETE RESTRICT,
    check_in    DATE    NOT NULL,                   -- date of check-in
    check_out   DATE    NOT NULL,                   -- date of check-out
    status      VARCHAR(50) NOT NULL DEFAULT 'available'  -- e.g. 'booked', 'cancelled', 'completed'
);

-- ############################################
-- Table: billings
-- ############################################
CREATE TABLE IF NOT EXISTS billings (
    id           SERIAL PRIMARY KEY,                -- auto-incrementing billing ID
    booking_id   INTEGER NOT NULL REFERENCES bookings(id) ON DELETE CASCADE,
    amount       NUMERIC(12,2) NOT NULL,            -- total amount charged
    generated_at TIMESTAMP WITH TIME ZONE NOT NULL DEFAULT NOW()  -- timestamp
);
