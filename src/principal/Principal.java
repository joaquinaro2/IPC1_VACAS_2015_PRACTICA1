package principal;

import java.util.Scanner;

public class Principal {

 public static void main(String[] args) {
	 String salir=null;
	 
	 
	 System.out.println("Ingrese el número del programa deseado");
		
		System.out.println("     > Programa 1 ");
		System.out.println("     > Programa 2 ");
		System.out.println("     > Programa 3 ");
		System.out.println("     > Programa 4 ");
		System.out.println("     > Programa 5 ");
		System.out.println("     > Programa 6 ");
		System.out.println("     > Programa 7 ");
		System.out.println("     > Programa 8 ");
		System.out.println("     > Programa 9 ");
		System.out.println("     > Programa 10 ");
		Scanner sc =new Scanner(System.in);
		int op=sc.nextInt();
		
		switch (op){
		case 1:
			Programa1_201314725 programa1=new Programa1_201314725();
			programa1.main(args);
			break;
		case 2:
			Programa2_201314725 programa2=new Programa2_201314725();
			programa2.main(args);
			break;
		case 3:
			Programa3_201314725 programa3=new Programa3_201314725();
			programa3.main(args);
			break;
		case 4:
			Programa4_201314725 programa4=new Programa4_201314725();
			programa4.main(args);
			break;
		case 5:
			Programa5_201314725 programa5=new Programa5_201314725();
			programa5.main(args);
			break;
		case 6:
			Programa6_201314725 programa6=new Programa6_201314725();
			programa6.main(args);
			break;
		case 7:
			Programa7_201314725 programa7=new Programa7_201314725();
			programa7.main(args);
			break;
		case 8:
			Programa8_201314725 programa8=new Programa8_201314725();
			programa8.main(args);
			break;
		case 9:
			Programa9_201314725 programa9=new Programa9_201314725();
			programa9.main(args);
			break;
		case 10:
			Programa10_201314725 programa10=new Programa10_201314725();
			programa10.main(args);
			break;
		default: System.out.println("El programa "+op+" no existe.");
				
		System.out.println("Presione S para salir o cualquier letra para continuar");	
		salir = sc.next(); 
		}
		while (!salir.equals("S")){
		
		}
 }
}