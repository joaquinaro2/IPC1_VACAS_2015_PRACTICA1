package principal;

import java.util.Scanner;

public class Programa1_201314725 {

	public static void main(String[] args) {
		String salir; 
		do 
		{ 
		System.out.println("Para ingresar la hora ingrese:\nHora:");
		Scanner sc=new Scanner(System.in);
		int h=sc.nextInt();
		System.out.println("Minutos:");
		int m=sc.nextInt();
		System.out.println("Segundos:");
		int s=sc.nextInt();
		int t= h*3600+m*60+s;
		t=t+1;
		int h2=(int)(t/3600);
		t=t-h2*3600;
		int m2=(int)(t/60);
		t=t-m2*60;
		int s2=(int)(t);
		System.out.println(h2+":"+m2+":"+s2);
		  
		
		System.out.println("Presione m para regresar al menú o cualquier letra para continuar");	
		salir = sc.next(); 
		} 
		while (!salir.equals("m"));
			Principal menu=new Principal();
			menu.main(args);
			
	}

}
