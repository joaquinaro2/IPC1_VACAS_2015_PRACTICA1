package principal;

import java.util.Scanner;

public class Programa8_201314725 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ingrese el numero:");
Scanner sc =new Scanner(System.in);
int n=sc.nextInt();
int l=1;
for (int i=n;i>0;i--){
	for(int j=l;j!=n+1;j++){
	System.out.print((j)+"\t");
	}
	System.out.println();
	n--;
}
	


	}

}
