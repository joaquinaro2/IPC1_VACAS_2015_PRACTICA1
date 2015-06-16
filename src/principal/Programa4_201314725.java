package principal;

import java.util.Scanner;

public class Programa4_201314725 {

	public static void main(String[] args) {
		System.out.println("Ingrese número:");
	Scanner sc=new Scanner(System.in);
	int n =sc.nextInt();
	if (n%2==0){
		System.out.println( (int) Math.pow(n+2, 3)+"\t"+(int) Math.pow(n+4, 3)+"\t"+(int) Math.pow(n+6, 3)+"\t"+(int) Math.pow(n+8, 3)+"\t"+(int) Math.pow(n+10, 3)+"\t");
	}else{
		System.out.println( (int) Math.pow(n+1, 3)+"\t"+(int) Math.pow(n+3, 3)+"\t"+(int) Math.pow(n+5, 3)+"\t"+(int) Math.pow(n+7, 3)+"\t"+(int) Math.pow(n+9, 3)+"\t");
	}

	}

}
