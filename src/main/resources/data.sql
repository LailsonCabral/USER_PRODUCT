create table produto(
    id integer primary key auto_increment,
    nome varchar(50),
    preco double
);
create table users(
    id integer primary key auto_increment,
    nome varchar(20),
    cnpj varchar(20),
    produtos integer references produto(id)
);