package principal;

import java.util.Scanner;

public class Programa9_201314725 {

	public static void main(String[] args) {
		int n;
		System.out.println("Ingrese el hasta el cual desea llegar:");
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		int ni=1;
		
		System.out.println("x\tx^2\tx^3\tx^4");
	
			for(int k=0;k!=n;k++){
				System.out.println((ni)+"\t"+(ni*ni)+"\t"+(ni*ni*ni)+"\t"+(ni*ni*ni*ni));
				ni++;
			
		}
		
	}

}
