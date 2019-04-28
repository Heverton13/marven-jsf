CREATE TABLE FILMES (
 ID_FILME SERIAL,
 TITULO VARCHAR(55) NOT NULL,
 DATA_LANCAMENTO DATE NOT NULL,
 NOTA INTEGER NOT NULL,
 DESCRICAO VARCHAR(55) NOT NULL,
 QUANTIDADE INTEGER NOT NULL
);

insert into filmes (TITULO, DATA_LANCAMENTO, NOTA, DESCRICAO, QUANTIDADE) values ('Os vingadores - Ultimato','2019-04-26',5,'Filmes Melhor de todos os tempos',10);
insert into filmes (TITULO, DATA_LANCAMENTO, NOTA, DESCRICAO, QUANTIDADE) values ('Os vingadores - Guerra Infinita','2018-04-26',4,'Segundo Melhor de todos os tempos',30);
insert into filmes (TITULO, DATA_LANCAMENTO, NOTA, DESCRICAO, QUANTIDADE) values ('MIB - Homens de preto','2010-06-06',4,'Filme legal',50);



