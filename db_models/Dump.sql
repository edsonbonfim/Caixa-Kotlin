drop database if exists banco;

create database banco;

use banco;

create table pessoa (
id_pessoa int primary key auto_increment,
nome varchar(255) not null, 
senha varchar(255) not null,
cpf varchar(11) not null
);

create table cliente (
id_cliente int primary key auto_increment,
id_pessoa int not null,
constraint fk_cliente_id_pessoa foreign key (id_pessoa) references pessoa(id_pessoa) on update cascade on delete cascade 
);

alter table pessoa change senha senha char(32) not null;

create table funcionario (
id_funcionario int primary key auto_increment,  
id_pessoa int not null, 
constraint fk_cliente_id_funcionario foreign key (id_pessoa) references pessoa(id_pessoa) on update cascade on delete cascade
);

create table contaBancaria (
id_conta int primary key auto_increment, 
nConta int not null,
nCartao int not null, 
saldo float,
tipo char not null,
id_cliente int not null, 
constraint fk_contaBancaria_id_cliente foreign key (id_cliente) references cliente(id_cliente) on delete cascade on update cascade 
);
