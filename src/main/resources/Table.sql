/*Criacao de tabelas*/
create table if not exists filiais (cnpj varchar(20) primary key, razao_social varchar(30));
create table if not exists produtos (id int primary key auto_increment, descricao varchar(20), valor double);
create table if not exists estoque (id int primary key auto_increment, cnpj varchar(20));
create table if not exists item_pedido_estoque (id int primary key auto_increment, quantidade int);
create table if not exists pedido_estoque (id int primary key auto_increment, entrada tinyint); 	

/*Consultas*/
delete from produtos where descricao;
select * from estoques;

/*Retorna todos os produtos com quantidade maior ou igual a 100*/
select id, descricao, valor from produtos inner join item_pedido_estoque on fk_produto = produtos.id 
where item_pedido_estoque.quantidade >= 100;

/*Retorna todos os produtos que tem estoque para filial de codigo 60*/
select id, descricao, valor from produtos inner join item_pedido_estoque on fk_produto = produtos.id
inner join estoques on fk_estoque = estoques.id
inner join filiais on filiais.cnpj = estoques.fk_filial
where filiais.cnpj = 60;

/*Lista todos os campos para o domínio pedido_estoque e item_pedido_estoque filtrando apenas o produto de codigo 7993*/
select item_pedido_estoque.id, item_pedido_estoque.quantidade, item_pedido_estoque.fk_estoque, item_pedido_estoque.fk_produto,
	pedido_estoque.id, pedido_estoque.entrada, pedido_estoque.fk_estoque from item_pedido_estoque inner join pedido_estoque on item_pedido_estoque.fk_estoque = pedido_estoque.fk_estoque
    inner join produtos on produtos.id = item_pedido_estoque.fk_produto
    where produtos.id = 7993;

/*Definicao de chave estrangeira*/
alter table pedido_estoque add fk_estoque int;
alter table pedido_estoque add foreign key (fk_estoque) references estoque(id);
alter table item_pedido_estoque add foreign key (fk_produto) references produtos(id);


