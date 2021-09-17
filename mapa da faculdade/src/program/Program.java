/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program;


import java.text.ParseException;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.Scanner;
import program.controle.ProjetoDAO;
import program.controle.ProjetoImpl;
import program.exceptions.DadoConsultadoException;
import program.modelo.Projeto;
/**
 *
 * @author cesar
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          ProjetoDAO dao = new ProjetoImpl();
          Projeto projeto =new Projeto();
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
                        projeto.setNome(coletarTexto("Digite o nome do projeto"));
                        projeto.setObjetivo(coletarTexto("Digite os objetivos do projeto"));
                        projeto.setNecessidades(coletarTexto("Digite as necessidades do projeto"));
                        projeto.setDataInicio(coletarTexto("Digite a data de início do projeto  no formato -> dd/MM/yyyy"));
                        projeto.setDataFinal(coletarTexto("Digite a data final do projeto no formato -> dd/MM/yyyy"));
                        projeto.setStatus(coletarTexto("Digite o status do projeto"));
                        dao.adicionar(projeto);
                       System.out.println(projeto);
                        break;
                    case 2:
                        String nomeConsultaAlterar = coletarTexto("Digite o nome do projeto que está buscando para alterar");
                        Projeto projetoNovo = new Projeto();
                        projetoNovo.setNome(coletarTexto("Digite o nome do projeto"));
                        projetoNovo.setObjetivo(coletarTexto("Digite os objetivos do projeto"));
                        projetoNovo.setNecessidades(coletarTexto("Digite as necessidades do projeto"));
                        projetoNovo.setDataInicio(coletarTexto("Digite a data de início do projeto no formato -> dd/MM/yyyy"));
                        projetoNovo.setDataFinal(coletarTexto("Digite a data final do projeto no formato -> dd/MM/yyyy"));
                        projetoNovo.setStatus(coletarTexto("Digite o status do projeto"));
                        dao.alterar(nomeConsultaAlterar, projetoNovo);
                        break;
                    case 3:
                        System.out.println(dao.listar());
                        break;
                    case 4:
                        String nomeConsultado = coletarTexto("Digite o nome do projeto que está buscando");
                        Projeto projetoEncontrado = dao.consultarPorNome(nomeConsultado);
                        System.out.println(projetoEncontrado);
                        break;
                    case 5:
                        String nomeConsultaExcluir = coletarTexto("Digite o nome do projeto que está buscando para excluir");
                        dao.excluir(nomeConsultaExcluir);
                        break;
                    case 0:
                        break;
                }
 
            }catch (InputMismatchException e){
                System.out.println("Não foi possível registrar corretamente a sua opção.");
            } catch (ParseException | DateTimeParseException e) {
                System.out.println("Não foi possível converter a data, tente informar dd/mm/aaaa");
            } catch (DadoConsultadoException e) {
                System.out.println(e.getMessage());
            }
            coletarTexto("----");
        }while (opcao!=0);
    }
 
    private static String coletarTexto(String descricao){
        Scanner scanner = new Scanner(System.in);
        System.out.println(descricao);
        return scanner.nextLine();
    }
    
    
}
