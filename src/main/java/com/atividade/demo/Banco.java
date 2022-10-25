package com.atividade.demo;

import java.sql.Connection;
import atividade.jdbc.Connetion;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class Banco {
	private Connection connection;
	public Banco() {
		this.connection = new Connetion().getConnetion();
	}


public void adicionar(Tblivros tblivro) {
	String sql = "inset into tblivros"+
				 "(titulo, autor, categoria, valor)"+
				 "values (?,?,?,?)";
	try {
		PreparedStatement stmt = connection.prepareStatement(sql);
		stmt.setString(1, tblivro.getTitulo());
		stmt.setString(2, tblivro.getAutor());
		stmt.setString(3, tblivro.getCategoria());
		stmt.setFloat(4, tblivro.getValor());
		
		stmt.execute();
		stmt.close();
	}catch(SQLException e) {
		throw new RuntimeException(e);
	}
}

}