## Curso Santander Coders Triha de Java

### Modulos

- [x] - Git e Versionamento
- [x] - Redes e Sistemas
- [x] - Instrodução a Java
- [x] - POO
- [x] - Banco de Dados
- [ ] - Desing Patters
- [ ] - Introdução a algoritmos
- [ ] - Design Patterns Java

## Boas praticas Java

### Ao declarar uma varivel

 - Conter apenas: letras, _, $ ou numero de 0 a 9

 - Uma boa pratica é começar a declaralas com apenas letras minusculas
 - Não é possivel declrar variaveis com palavras reservadas do Java

 - Valores Default sáo iniciados como 0, bolean como false e float e double como 0.0
 - Char é vazio e String vem como valor null

- É possivel colocarr _ para separar numeros exemplo = ```java int a = 23_45_879``` pois não atrapalha em nada na execução do codgio

 - garbage collector joga objetos não ultilizados no lixo quando não estão sendo ultilziados


## Banco de Dados

### Querys

```sql

-- Criando Tabelas

CREATE TABLE public.disciplinas (
	id_disciplina integer primary KEY,
	nome varchar NULL,
	ementa text NULL
);

select * from disciplinas


create table professore(
	id_professor integer,
	celular varchar(14),
	nome varchar(40),
	id_disciplina integer,
	primary key (id_professor),
	FOREIGN key (id_disciplina) references disciplinas (id_disciplina)
);

select * from professore

create table livro(
	name varchar(15),
	autor varchar(40),
	sinopse varchar(500)
);

select * from livro

-- Inserindo Dados

insert into disciplinas values
(2, 'matematica', 'algebra e geometria'),
(3, 'fisica', 'cinematica e dinamica');

-- Importanto csv

copy disciplinas (id_disciplina,nome,ementa) 
from 'C:\Users\Dell\Documents>disciplinas.csv' delimiter ',' csv header


-- Alterando valores com update e delete

update disciplinas set nome = 'Biologia'
where id_disciplina = 7

delete from disciplinas where id_disciplina = 8

```




