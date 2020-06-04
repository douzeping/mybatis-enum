DROP TABLE IF EXISTS user;

CREATE TABLE user
(
    id       INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(250) NOT NULL,
    state    TINYINT(1)   NOT NULL DEFAULT 0 COMMENT '0:未验证 1:已验证'
);