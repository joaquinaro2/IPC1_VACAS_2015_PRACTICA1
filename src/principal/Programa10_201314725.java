package principal;

import java.util.Scanner;

public class Programa10_201314725 {

	public static void main(String[] args) {
		String salir; 
		Scanner sc =new Scanner(System.in);
		do 
		{ 
		for (int n=1;n<=1000;n++){
		System.out.println(n);
		if (n%20==0){
			System.out.println("Desea continuar [y]/[n]");
			
			String p=sc.next();
			if (p.equals("n")){
				break;
			}
				
		}}
		
		System.out.println("Presione m para regresar al menú o cualquier letra para continuar");	
		salir = sc.next(); 
		}
		while (!salir.equals("m"));
			Principal menu=new Principal();
			menu.main(args);
			
	
	}}
	