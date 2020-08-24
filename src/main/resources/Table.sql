/*Criacao de tabelas*/
create table if not exists filiais (cnpj varchar(20) primary key, razao_social varchar(30));
create table if not exists produtos (id int primary key auto_increment, descricao varchar(20), valor double);
create table if not exists estoque (id int primary key auto_increment, cnpj varchar(20));
create table if not exists item_pedido_estoque (id int primary key auto_increment, quantidade int);
create table if not exists pedido_estoque (id int primary key auto_increment, entrada tinyint); 	

/*Consultas*/
select * from filiais;

/*Definicao de chave estrangeira*/
alter table pedido_estoque add fk_estoque int;
alter table pedido_estoque add foreign key (fk_estoque) references estoque(id);
alter table item_pedido_estoque add foreign key (fk_produto) references produtos(id);

/*Insercao de valores*/
