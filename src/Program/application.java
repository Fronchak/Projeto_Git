package Program;

import java.sql.Connection;

import db.DB;

public class application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = DB.getConnection();
		DB.closeConnection();
		
		System.out.println("Conectando ao banco de dados!");
	}

}
