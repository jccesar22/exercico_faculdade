package br.unicesumar.aula.controle;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import br.unicesumar.aula.exceptions.DadoConsultadoException;
import br.unicesumar.aula.modelo.Projeto;

public class ProjetoImpl implements ProjetoDAO{
	 //Collection que ir� armazenar todos os projetos
    private static Set<Projeto> projetos = new HashSet<>();
 
 
    @Override
    public void adicionar(Projeto projeto) {
    	
    }
 
    @Override
    public List<Projeto> listar() {
    	return null;
    }
 
    @Override
    public Projeto consultarPorNome(String nome) throws DadoConsultadoException {
        return null;
    }
 
    @Override
    public Projeto alterar(String nome, Projeto projeto) throws DadoConsultadoException {
        return null;
    }
 
    @Override
    public void excluir(Projeto projeto) throws DadoConsultadoException, UnsupportedOperationException {
 
    }
 
    @Override
    public void excluir(String nome) throws DadoConsultadoException, UnsupportedOperationException {
 
    }

	@Override
	public String toString() {
		return "ProjetoImpl [listar()=" + listar() + "]";
	}
    
    
}
