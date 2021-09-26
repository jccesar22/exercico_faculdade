package br.unicesumar.aula.controle;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import br.unicesumar.aula.exceptions.DadoConsultadoException;
import br.unicesumar.aula.modelo.Projeto;

public class ProjetoImpl implements ProjetoDAO, program.controle.ProjetoDAO {
	// Collection que irá armazenar todos os projetos
	private static Set<Projeto> projetos = new HashSet<>();

	// colocando os elenentos nas lista
	@Override
	public void adicionar(Projeto projeto) {
		projetos.add(projeto);
	}

	// imprimendo as lista de projetos com todos os conteudos
	@Override
	public List<Projeto> listar() {
		List<Projeto> projectList = new ArrayList<>();
		projectList.addAll(projetos);
		return projectList;
	}

	// fazendo a consulta por nome e imprimindo apenas o que foi encontrado
	@Override
	public Projeto consultarPorNome(String nome) throws DadoConsultadoException {
		for (Projeto project : projetos) {
			if (project.getNome().equalsIgnoreCase(nome)) {
				return project;
			}
		}

		throw new DadoConsultadoException("Nome não encontrado no projeto");
	}

	// alterar pprojeto altera o projeto que você escolhe o nome
	
	@Override
	public Projeto alterar(String nome, Projeto projeto) throws DadoConsultadoException {
		Projeto alteracao = consultarPorNome(nome);
		if (projetos.contains(alteracao)) {

			alteracao.setNome(projeto.getNome());
			alteracao.setObjetivo(projeto.getObjetivo());
			alteracao.setNecessidades(projeto.getNecessidades());
			alteracao.setDataInicio(projeto.getDataInicio());
			alteracao.setDataFinal(projeto.getDataFinal());
			alteracao.setStatus(projeto.getStatus());
			return alteracao;

		}

		return null;
	}

	// exclusão do projeto pelo nome do projeto
	@Override
	public void excluir(Projeto projeto) throws DadoConsultadoException, UnsupportedOperationException {
		if (projetos.contains(projeto)) {
			projetos.remove(projeto);
			System.out.println("Excluindo o projeto: " + projeto);
			return;
		}
		throw new DadoConsultadoException("Não foi encontrado o projeto para a exclusão");
	}

	@Override
	public void excluir(String nome) throws DadoConsultadoException, UnsupportedOperationException {

		Projeto excluirProjeto = consultarPorNome(nome);
		this.excluir(excluirProjeto);
	}

	@Override
	public String toString() {
		return "ProjetoImpl listar()=" + listar() + "\n";
	}

	@Override
	public void adicionar(program.modelo.Projeto projeto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public program.modelo.Projeto consultarPorNome(String nome) throws program.exceptions.DadoConsultadoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public program.modelo.Projeto alterar(String nome, program.modelo.Projeto projeto)
			throws program.exceptions.DadoConsultadoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void excluir(program.modelo.Projeto projeto)
			throws program.exceptions.DadoConsultadoException, UnsupportedOperationException {
		// TODO Auto-generated method stub
		
	}

}
