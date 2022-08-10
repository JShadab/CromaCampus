CREATE TABLE IF NOT EXISTS users (
  username VARCHAR(50) NOT NULL,
  password VARCHAR(100) NOT NULL,
  enabled TINYINT NOT NULL DEFAULT 1,
  PRIMARY KEY (username)
);
  
CREATE TABLE IF NOT EXISTS authorities (
  username VARCHAR(50) NOT NULL,
  authority VARCHAR(50) NOT NULL,
  FOREIGN KEY (username) REFERENCES users(username)
);

/*
 * 
CREATE UNIQUE INDEX ix_auth_username
  on authorities (username,authority);

 */