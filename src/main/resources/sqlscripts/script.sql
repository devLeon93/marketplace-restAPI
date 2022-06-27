select * from users;
select * from product;

/*Insert new user*/
insert into users(email, password, username) VALUES  ('leonidbars93@gmail.com','pass93','leo93');



insert into users(email, password, username) VALUES
    ('leonidbars93@gmail.com','pass93','leo93'),
                                                 ('olegbars63@gmail.com','pass63','oleg63'),
                                                 ('irinabars1970@mail.ru','pass70','irina70');

insert into product(description, price, title,user_id) VALUES ('Iphone 12 pro max',28500.89,'Apple',1);


insert into product(description, price, title,user_id)
VALUES ('Iphone 12 pro max',28500.89,'Apple',1),
       ('Macbook air m1 2020',29580.23,'Apple',3),
       ('Samsung Note 10',18700.60,'Samsung',1),
       ('ASUS TUF Gaming F15',35890.50,'Gaming Laptop',2),
       ('Corsair N19',7800.78,'PC Peripheral',1),
       ('Speed CUB 3x3',2345.70,'BrainPuzzle',3),
       ('Acoustic Guitar Aria',5600.89,'Musicals Instrument',2),
       ('PC Gaming Armor',45000.67,'PC',1),
       ('Apple Watch S4',7600.90,'Apple',3),
       ('ASUS ZENBOOK',18900.89,'ASUS',2),
       ('Iphone 8 ',8500.89,'Apple'),
       ('Macbook pro 2020',29580.23,'Apple'),
       ('Samsung S10',18432.60,'Samsung'),
       ('ASUS TUF ',35786.50,'Gaming Laptop'),
       ('Corsair Headphones',5676.78,'PC Peripheral'),
       ('Speed CUB 6x6',2317.70,'BrainPuzzle'),
       ('Acoustic Cahon',5660.89,'Musicals Instrument'),
       ('PC Gaming Blur-Ace',45067.67,'PC'),
       ('Apple Airpods gen2',4500.90,'Apple'),
       ('ASUS ZENBOOK-M9',18900.89,'ASUS'),
       ('Iphone 11 pro max',28500.89,'Apple'),
       ('Macbook air 2019',12580.23,'Apple'),
       ('Samsung N10',6700.60,'Samsung'),
       ('ASUS TUF K23',35890.50,'Gaming Laptop'),
       ('Corsair RAM',7800.78,'PC Peripheral'),
       ('Speed Circle',2345.70,'BrainPuzzle'),
       ('Acoustic Piano',3200.89,'Musicals Instrument'),
       ('PC Gaming MOVE',45000.67,'PC'),
       ('Apple Watch S7',10987.90,'Apple'),
       ('Apple IPen',987.90,'Apple');

drop table product;
drop table users;
