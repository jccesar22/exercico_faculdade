package br.unicesumar.aula;


import br.unicesumar.aula.controle.ProjetoDAO;
import br.unicesumar.aula.controle.ProjetoImpl;
import br.unicesumar.aula.exceptions.DadoConsultadoException;
import br.unicesumar.aula.modelo.Projeto;

import java.text.ParseException;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ProjetoDAO dao = new ProjetoImpl();
	        int opcao;
	        do{
	            System.out.println("Registro de projetos");
	            System.out.println("1 - Cadastrar");
	            System.out.println("2 - Alterar");
	            System.out.println("3 - Listar");
	            System.out.println("4 - Localizar por nome");
	            System.out.println("5 - Excluir");
	            System.out.println("\n0 - Sair");
	            Scanner scannerMenu = new Scanner(System.in);
	            opcao = scannerMenu.nextInt();
	            try {
	                switch (opcao){
	                    case 1:
	                        Projeto projeto =new Projeto();
	                        projeto.setNome(coletarTexto("Digite o nome do projeto"));
	                        projeto.setObjetivo(coletarTexto("Digite os objetivos do projeto"));
	                        projeto.setNecessidades(coletarTexto("Digite as necessidades do projeto"));
	                        projeto.setDataInicio(coletarTexto("Digite a data de in�cio do projeto"));
	                        projeto.setDataFinal(coletarTexto("Digite a data final do projeto"));
	                        projeto.setStatus(coletarTexto("Digite o status do projeto"));
	                        dao.adicionar(projeto);
	                       System.out.println(projeto); 
	                        break;
	                    case 2:
	                        String nomeConsultaAlterar = coletarTexto("Digite o nome do projeto que est� buscando para alterar");
	                        Projeto projetoNovo = new Projeto();
	                        projetoNovo.setNome(coletarTexto("Digite o nome do projeto"));
	                        projetoNovo.setObjetivo(coletarTexto("Digite os objetivos do projeto"));
	                        projetoNovo.setNecessidades(coletarTexto("Digite as necessidades do projeto"));
	                        projetoNovo.setDataInicio(coletarTexto("Digite a data de in�cio do projeto"));
	                        projetoNovo.setDataFinal(coletarTexto("Digite a data final do projeto"));
	                        projetoNovo.setStatus(coletarTexto("Digite o status do projeto"));
	                        dao.alterar(nomeConsultaAlterar, projetoNovo);
	                        break;
	                    case 3:
	                        System.out.println(dao.listar());
	                        break;
	                    case 4:
	                        String nomeConsultado = coletarTexto("Digite o nome do projeto que est� buscando");
	                        Projeto projetoEncontrado = dao.consultarPorNome(nomeConsultado);
	                        System.out.println(projetoEncontrado);
	                        break;
	                    case 5:
	                        String nomeConsultaExcluir = coletarTexto("Digite o nome do projeto que est� buscando para excluir");
	                        dao.excluir(nomeConsultaExcluir);
	                        break;
	                    case 0:
	                        break;
	                }
	 
	            }catch (InputMismatchException e){
	                System.out.println("N�o foi poss�vel registrar corretamente a sua op��o.");
	            } catch (ParseException | DateTimeParseException e) {
	                System.out.println("N�o foi poss�vel converter a data, tente informar dd/mm/aaaa");
	            } catch (DadoConsultadoException e) {
	                System.out.println(e.getMessage());
	            }
	            coletarTexto("------------------------------------------------------------------------------");
	        }while (opcao!=0);
	    }
	
	 
	    private static String coletarTexto(String descricao){
	        Scanner scanner = new Scanner(System.in);
	        System.out.println(descricao);
	        return scanner.nextLine();
	    }
	    }

