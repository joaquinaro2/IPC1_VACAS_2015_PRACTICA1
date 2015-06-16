package principal;

import java.util.Scanner;

public class Programa10_201314725 {

	public static void main(String[] args) {
	
		for (int n=1;n<=1000;n++){
		System.out.println(n);
		if (n%20==0){
			System.out.println("Desea continuar [y]/[n]");
			Scanner sc =new Scanner(System.in);
			String p=sc.next();
			if (p.equals("n")){
				break;
			}
				
		}
	}

	}

}
