create database if not exists compilerDatabase default character set utf8 collate utf8_spanish2_ci;

use compilerDatabase;

create table palabras_reservadas(
palabra varchar(10) primary key not null,
tipo varchar(10) not null,
descripcion varchar(50) not null);

create table simbolos(
simbolo varchar(2) primary key not null,
tipo varchar(10) not null,
descripcion varchar(50));

insert into palabras_reservadas values
('programa','simple','nombre del programa'),
('inicio','simple','inicio del programa'),
('fin','simple','fin del programa'),
('declarar','simple','declaracion de variables'),
('mostrar','simple','muestra por pantalla'),
('"$','compuesta','inicio de comentario'),
('$"','compuesta','fin de comentario'),
('inmatcomp','compuesta','inicia operacion matematica'),
('finmatcomp','compuesta','finaliza operacion matematica');

insert into simbolos values
('+','operador','suma'),
('-','operador','resta'),
('*','operador','multiplicacion'),
('/','operador','division'),
('^','operador','potencia'),
('(','separador','abre parentesis'),
(')','separador','cierra parentesis'),
('[','separador','abre corchetes'),
(']','separador','cierra corchetes'),
('{','separador','abre llave'),
('}','separador','cierra llave'),
('$','especial','usado en comentarios'),
('"','especial','usado en comentarios'),
('&','especial','usado en comentarios'),
('=','especial','igualdad'),
('#','especial','parada de control'),
('a','letra',null),
('b','letra',null),
('c','letra',null),
('d','letra',null),
('e','letra',null),
('f','letra',null),
('g','letra',null),
('h','letra',null),
('i','letra',null),
('j','letra',null),
('k','letra',null),
('l','letra',null),
('m','letra',null),
('n','letra',null),
('ñ','letra',null),
('o','letra',null),
('p','letra',null),
('q','letra',null),
('r','letra',null),
('s','letra',null),
('t','letra',null),
('u','letra',null),
('v','letra',null),
('w','letra',null),
('x','letra',null),
('y','letra',null),
('z','letra',null),
('0','numero',null),
('1','numero',null),
('2','numero',null),
('3','numero',null),
('4','numero',null),
('5','numero',null),
('6','numero',null),
('7','numero',null),
('8','numero',null),
('9','numero',null);


