-- Run this script once against the existing lms database before starting
-- the backend after upgrading to phase 5.

ALTER TABLE users ADD COLUMN IF NOT EXISTS role VARCHAR(20);
UPDATE users SET role = 'USER' WHERE role IS NULL;
ALTER TABLE users ALTER COLUMN role SET DEFAULT 'USER';
ALTER TABLE users ALTER COLUMN role SET NOT NULL;

ALTER TABLE accounts ADD COLUMN IF NOT EXISTS active BOOLEAN;
UPDATE accounts SET active = TRUE WHERE active IS NULL;
ALTER TABLE accounts ALTER COLUMN active SET DEFAULT TRUE;
ALTER TABLE accounts ALTER COLUMN active SET NOT NULL;
