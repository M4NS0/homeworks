package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {

	private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3336/testebd";
	private static final String USER = "root";
	private static final String PASSWORD = "B4p7ist@";
	
	public static Connection getConnection() {
		try {
			Class.forName(DRIVER);
			return DriverManager.getConnection(URL, USER, PASSWORD);
		} catch (Exception e) {
			System.out.print("Erro ao conectar no BD!" + e.getMessage());
			return null;
		}
	}
	
}


/*
use testbd;
create table marca
(	mar_id			int	auto_increment 	primary key,
   mar_nome   		varchar(60),
   mar_origem   	varchar(60)
);

create table movel
(	mod_id			int	auto_increment 	primary key,
   mod_descricao   varchar(60),
   mod_preco		float,
   mar_id			int,
   constraint rel_marca_movel foreign key (mar_id) references marca(mar_id)
);
select * from marca;


select * from movel;


insert into movel (mod_descricao, mod_preco, mar_id) 
		values ('Cadeira de Balanço', 100, 1);
       

update marca set mar_nome = 'Teste' where mar_id = 2; 

delete from Marca where mar_id = 3;

*/