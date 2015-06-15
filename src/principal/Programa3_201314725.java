package principal;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Programa3_201314725 {

		public static void main (String[]args){
			System.out.println("Para saber su indice de masa corporal ingrese:"
					+ "\nSu peso(kg).");
			Scanner s =new Scanner(System.in);
			double p=s.nextDouble();
			System.out.println("Su altura(m)");
			double h=s.nextDouble();
			
			int mc=(int) (p/(h*h));
			System.out.println("Su indice de masa corporal es de: "+mc);
			
			
			
			switch (mc){
			case 17:
			case 18:
			System.out.println("En funcion al valor de IMC su descripcion de IMC es de: BAJO PESO");
				break;
				
			case 19:
			case 20:
			case 21:
			case 22:
			case 23:
			case 24:
			case 25:
			
				System.out.println("En funcion al valor de IMC su descripcion de IMC es de: PESO NORMAL");
				break;
				
			case 26:
			case 27:
			case 28:
			case 29:
			case 30:
			
				System.out.println("En funcion al valor de IMC su descripcion de IMC es de: SOBREPESO");
				break;
				
			
			case 31:
			case 32:
			case 33:
			case 34:
			case 35:
			
				System.out.println("En funcion al valor de IMC su descripcion de IMC es de: OBESIDAD PRE-MÓRBIDA");
				break;
				
			
			default:
				System.out.println("En funcion al valor de IMC su descripcion de IMC es de: OBESIDAD MÓRBIDA)");
				break;
			}
			
			
			
		}
}
