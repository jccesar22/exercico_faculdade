package equacao;

public class EquacaoSegundoGrau {
	private double a;
	private double b;
	private double c;
	float  delta,        //delta
           sqrtdelta,    //raiz quadrada de delta
           raiz1,raiz2;  //raízes
	
	public EquacaoSegundoGrau() {
		
	}
	public EquacaoSegundoGrau(double a, double b, double c) {
		this.a = a;
		this.setB(b);
		this.c = c;
	}



	public void divide(double a, double b, double c) {
		
		if(a != 0){ 
	        //sempre o "A" não pode ser zero
	            delta = (float) ((b*b) - (4*a*c));
	            sqrtdelta = (float)Math.sqrt(delta);
	        
	        //se a raiz de delta for maior que 0, as raízes são reais    
	            if(delta >=0){
	                raiz1 = (float) (((-1)*b + sqrtdelta)/(2*a));
	                raiz2 = (float) (((-1)*b - sqrtdelta)/(2*a));
	                System.out.println("Raízes1:"+ raiz1 + " e Raízes2: "+ raiz2);
	               System.out.println("A raiz de DELTA: " + sqrtdelta);
	               System.out.printf("a raiz de delta for maior que 0, as raízes são reais ");
	            }
	            else{
	                delta = -delta;
	                sqrtdelta = (float)Math.sqrt(delta);
	                delta = -delta;
	                sqrtdelta = (float)Math.sqrt(delta);
	                System.out.printf("Raíz 1: %.2f + i.%.2f\n", (-b)/(2*a), (sqrtdelta)/(2*a));
	                System.out.printf("Raíz 2: %.2f - i.%.2f\n", (-b)/(2*a), (sqrtdelta)/(2*a));
	            }
	            
	        }
	        else{
	            System.out.println("Coeficiente 'a' inválido. Não é uma equação do Segundo grau o Coeficiente zero");
	        }
	    }
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	}

		/* if(a != 0 || b != 0 || c != 0) {
	            throw new ArithmeticException("não poder ter zero na equação");
	            
	        }
		
	        double delta = Math.pow(b, 2) - 4 * a * c;
	        System.out.println("o valor do Delta e :" + delta);
	        double x1, x2;

	        if (delta < 0) {
	            System.out.println("Não há solução real");
	        } else if (delta > 0){
	            x1 = (-b + Math.pow(delta, 1/2)) / (2 * a);
	            x2 = (-b - Math.pow(delta, 1/2)) / (2 * a);
	            System.out.println("Há duas soluções reais: " + x1 + " e " + x2);
	        } else {
	            x1 = (-b + Math.pow(delta, 1/2)) / (2 * a);
	            x2 = (-b - Math.pow(delta, 1/2)) / (2 * a);
	            System.out.println("Há apenas uma solução real: " + x1 + " e " + x2);
	        }
	        return 0;
	    }*/
	
	}
