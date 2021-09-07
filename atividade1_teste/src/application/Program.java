package application;

import java.util.Scanner;

import equacao.EquacaoSegundoGrau;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in = new Scanner(System.in);

	        double a, b, c;
	        System.out.println("a");
	            a = in.nextDouble();
	            System.out.println("b");
	            b = in.nextDouble();
	            System.out.println("c");
	            c = in.nextDouble();
	       EquacaoSegundoGrau equacao = new EquacaoSegundoGrau();
	       equacao.divide(a, b, c);
	       

}
	}
