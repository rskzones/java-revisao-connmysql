package br.etec.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.etec.model.Alunos;


public class AlunosJdbcDAO {

	private Connection conn;
	
	
	public AlunosJdbcDAO(Connection conn) {
		this.conn = conn;
	}
	
	
	public void salvar(Alunos c) throws SQLException {
		String sql = "insert into alunos (nome, endereco, bairro) values ('"+c.getNome()+"','"+c.getEndereco()+"','"+c.getBairro()+"')";
		System.out.println(sql);
		PreparedStatement prepareStatement = this.conn.prepareStatement(sql);
		prepareStatement.executeUpdate();
                prepareStatement.close();
	}
}