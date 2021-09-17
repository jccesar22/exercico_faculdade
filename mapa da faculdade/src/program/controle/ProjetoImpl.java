/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program.controle;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import program.exceptions.DadoConsultadoException;
import program.modelo.Projeto;

/**
 *
 * @author cesar
 */
public class ProjetoImpl extends Projeto implements ProjetoDAO{
	  //Collection que irá armazenar todos os projetos
    private static Set<Projeto> projetos = new HashSet<>();
	@Override
	public void adicionar(Projeto projeto) {	
		projetos.add(projeto);
	}

	public List<Projeto> listar() {
	return null;
	}

	@Override
	public Projeto consultarPorNome(String nome) throws DadoConsultadoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Projeto alterar(String nome, Projeto projeto) throws DadoConsultadoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void excluir(Projeto projeto) throws DadoConsultadoException, UnsupportedOperationException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void excluir(String nome) throws DadoConsultadoException, UnsupportedOperationException {
		// TODO Auto-generated method stub
		
	}
	

}
