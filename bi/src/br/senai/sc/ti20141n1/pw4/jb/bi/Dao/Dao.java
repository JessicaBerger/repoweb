package br.senai.sc.ti20141n1.pw4.jb.bi.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.senai.sc.ti20141n1.pw4.jb.bi.model.dominio.Dominio;

public abstract class Dao {

	private Connection conn;

	public Connection getConnection() {
		if (conn == null) {
			try {
				conn = DriverManager.getConnection(
						"jdbc:mysql://localhost/bi_database", "root", "root");

				System.out.println("Conectou");
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

		return conn;
	}

	private void salvar(Dominio dominio) {
		String INSERT = "INSERT INTO ideias (titulo, descricao) VALUES(?,?)";
		try {
			PreparedStatement ps = null;

			ps.setString(1, dominio.getTitulo());
			ps.setString(2, dominio.getDescricao());

			ps.executeUpdate();
		} catch (SQLException ex) {
			System.out.println("Erro ao executar o insert" + ex);
		}

	}
}



