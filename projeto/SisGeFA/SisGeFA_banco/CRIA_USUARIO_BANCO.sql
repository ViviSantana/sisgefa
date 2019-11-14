CREATE USER 'admin'@'localhost' IDENTIFIED BY 'asd123';
GRANT ALL PRIVILEGES ON * . * TO 'admin'@'localhost';
FLUSH PRIVILEGES;