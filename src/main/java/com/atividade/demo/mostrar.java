package com.atividade.demo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import atividade.jdbc.Connetion;

public class mostrar {
	private Connection connection;
	public mostrar() {
		this.connection = new Connetion().getConnetion();
	}
	public List<Tblivros> getLista(){
		try {
			List<Tblivros> tblivros = new ArrayList<Tblivros>();
			PreparedStatement stmt = this.connection.prepareStatement("select * from tblivros where codlivro = ${param.codl} ");
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Tblivros tblivro = new Tblivros();
				tblivro.setCodlivro(rs.getInt("Codlivro"));
				tblivro.setTitulo(rs.getString("Titulo"));
				tblivro.setAutor(rs.getString("Autor"));
				tblivro.setCategoria(rs.getString("Categoria"));
				tblivro.setValor(rs.getFloat("Valor"));
				tblivros.add(tblivro);
			}		
			rs.close();
			stmt.close();
			return tblivros;
		}catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
