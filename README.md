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

### Boas praticas em Java

<details>
  <summary>Boas praticas Java</summary>
  <ul>
    <li>Conter apenas: letras, _, $ ou numero de 0 a 9</li>
    <li>Uma boa prática é começar a declará-las com apenas letras minúsculas</li>
    <li>Não é possível declarar variáveis com palavras reservadas do Java</li>
    <li>Valores Default são iniciados como 0, boolean como false e float e double como 0.0</li>
    <li>Char é vazio e String vem como valor null</li>
    <li>É possível colocar _ para separar números, exemplo:
      ```java
      int a = 23_45_879;
      ```
      pois não atrapalha em nada na execução do código</li>
    <li>Garbage collector joga objetos não utilizados no lixo quando não estão sendo utilizados</li>
  </ul>
</details>

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

-- Criando index para deixar as tabelas mais rapidas

select * from disciplinas where nome = 'geografia'

create index idx_nome on disciplinas(nome)

```




