DROP TABLE IF EXISTS user;

CREATE TABLE user
(
    id       INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(250) NOT NULL,
    state    TINYINT(1)   NOT NULL DEFAULT 0 COMMENT '0:未验证 1:已验证'
);

INSERT INTO user(username, state)
VALUES ('zeping1', 0),
       ('zeping2', 1),
       ('zeping3', 0),
       ('zeping4', 0),
       ('zeping5', 0);
