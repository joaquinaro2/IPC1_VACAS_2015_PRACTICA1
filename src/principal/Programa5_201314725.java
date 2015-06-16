package principal;

import java.util.Scanner;

public class Programa5_201314725 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ingrese número: ");
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Sus divisores son:");
		 for (int i = 1 ; i <= n ; i++)
	            if (n % i == 0)
	                System.out.print (i+". ");
	}

}
