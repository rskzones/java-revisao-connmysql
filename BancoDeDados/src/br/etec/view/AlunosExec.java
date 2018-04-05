package br.etec.view;

import java.sql.Connection;

import br.etec.model.Alunos;
import br.etec.persistence.AlunosJdbcDAO;
import br.etec.persistence.Conexao;

public class AlunosExec {
	public static void main(String args[]) {
		Alunos alunos = new Alunos();
		try {
			
			alunos.setNome("Jeferson Roberto de Lima");
			alunos.setEndereco("Av �guia de Haia, 2600");
			alunos.setBairro("Jd S�o Nicolau");
			
			Connection connection = Conexao.getConnection();
			AlunosJdbcDAO alunosJdbcDao = new AlunosJdbcDAO(connection);
			
			alunosJdbcDao.salvar(alunos);
			

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
