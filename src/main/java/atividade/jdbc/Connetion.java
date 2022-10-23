package atividade.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connetion {
	public Connection getConnetion() {
		try {
			return DriverManager.getConnection("jdbc:mysql://localhost/bdlivraria?useTimezone=true&serverTimezone=UTC", "root", "admin");
		}catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
}
