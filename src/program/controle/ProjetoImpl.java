/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program.controle;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import program.modelo.Projeto;

/**
 *
 * @author cesar
 */
public class ProjetoImpl implements ProjetoDAO{
    //Collection que irá armazenar todos os projetos
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
    public oid adicionar(Projeto projeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Projeto alterar(String nome, Projeto projeto) throws DadoConsultadoException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void excluir(Projeto projeto) throws DadoConsultadoException, UnsupportedOperationException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
