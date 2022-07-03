create database if not exists kayak_sales;

use kayak_sales;

drop table if exists orders;
drop table if exists customers;
drop table if exists kayaks;


CREATE TABLE customers (
	id int(11) not null auto_increment,
	first_name varchar(20) not null,
	last_name varchar(20) not null,
	email varchar(40) not null,
	phone_number varchar(15) not null,
	primary key (id)
);

CREATE TABLE kayaks (
	id int (11) not null auto_increment,
    brand varchar(30) not null,
    kayak_name varchar(30) not null,
    price decimal(6, 2) not null,
    width int (3) not null,
    primary key (id)
);
CREATE TABLE orders (
	id int(11) not null auto_increment,
    customer_id int(11) not null,
    kayak_id int(11) not null,
    quantity int unsigned not null,
    order_total decimal(6, 2),
    primary key (id),
    foreign key (customer_id) references customers(id),
    foreign key (kayak_id) references kayaks(id)
);


INSERT INTO customers (first_name, last_name, email, phone_number) values ('Buzz', 'Lightyear', 'blightyear@yahoo.com', '5055557654');
INSERT INTO customers (first_name, last_name, email, phone_number) values ('Egwene', 'Alvere', 'ealvere@yahoo.com', '5055557651');
INSERT INTO customers (first_name, last_name, email, phone_number) values ('Bo', 'Peep', 'bpeep@yahoo.com', '5055557652');
INSERT INTO customers (first_name, last_name, email, phone_number) values ('Indiana', 'Jones', 'ijones@yahoo.com', '5055557653');
INSERT INTO customers (first_name, last_name, email, phone_number) values ('John', 'Cougar', 'jcougar@yahoo.com', '5055557655');
INSERT INTO customers (first_name, last_name, email, phone_number) values ('John', 'McClane', 'jmcclane@yahoo.com', '5055557656');
INSERT INTO customers (first_name, last_name, email, phone_number) values ('Steve', 'Erkle', 'serkle@yahoo.com', '5055557657');
INSERT INTO customers (first_name, last_name, email, phone_number) values ('Elaine', 'Trakand', 'etrakand@yahoo.com', '5055557658');
INSERT INTO customers (first_name, last_name, email, phone_number) values ('Rand', 'Althor', 'ralthor@yahoo.com', '5055557659');
INSERT INTO customers (first_name, last_name, email, phone_number) values ('Perrin', 'Aybara', 'paybara@yahoo.com', '5055557650');

INSERT INTO kayaks (brand, kayak_name, price, width) values ('Pelican', 'Maxim 100X', '399.99', '28');
INSERT INTO kayaks (brand, kayak_name, price, width) values ('Pelican', 'Prime 100', '394.10', '28');
INSERT INTO kayaks (brand, kayak_name, price, width) values ('Pelican', 'Sentinel 100X', '329.99', '30');
INSERT INTO kayaks (brand, kayak_name, price, width) values ('Pelican', 'Premium Argo 136XP', '874.95', '32');
INSERT INTO kayaks (brand, kayak_name, price, width) values ('Pelican', 'The Catch 120', '749.99', '34');
INSERT INTO kayaks (brand, kayak_name, price, width) values ('Pelican', 'The Catch 120 Hydryve', '829.99', '34');
INSERT INTO kayaks (brand, kayak_name, price, width) values ('Old Town', 'Topwater 120 PDL', '2499.99', '34');
INSERT INTO kayaks (brand, kayak_name, price, width) values ('Old Town', 'Sportsman I06', '999.99', '35');
INSERT INTO kayaks (brand, kayak_name, price, width) values ('Old Town', 'Sportsman I20', '1299.99', '35');
INSERT INTO kayaks (brand, kayak_name, price, width) values ('Old Town', 'Sportsman BigWater I32', '1699.99', '33');
INSERT INTO kayaks (brand, kayak_name, price, width) values ('Old Town', 'Sportsman AutoPilot I36', '4499.99', '32');
INSERT INTO kayaks (brand, kayak_name, price, width) values ('Old Town', 'Looksha T', '2499.99', '30');
INSERT INTO kayaks (brand, kayak_name, price, width) values ('Old Town', 'Loon I06', '1049.99', '31');
INSERT INTO kayaks (brand, kayak_name, price, width) values ('Dagger', 'Katana', '1479.99', '28');
INSERT INTO kayaks (brand, kayak_name, price, width) values ('Dagger', 'Axis', '1059.99', '29');
INSERT INTO kayaks (brand, kayak_name, price, width) values ('Dagger', 'Kaos', '959', '27');
INSERT INTO kayaks (brand, kayak_name, price, width) values ('Dagger', 'The Green Boat', '1289.99', '25');
INSERT INTO kayaks (brand, kayak_name, price, width) values ('Dagger', 'Torrent', '819.99', '31');
INSERT INTO kayaks (brand, kayak_name, price, width) values ('Dagger', 'Rewind', '1499.99', '26');
INSERT INTO kayaks (brand, kayak_name, price, width) values ('Dagger', 'Jitsu', '1369.99', '26');

Select * from customers;
Select * from kayaks;