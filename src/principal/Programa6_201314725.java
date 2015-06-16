package principal;

public class Programa6_201314725 {

	public static void main(String[] args) {
		
		
		for (int i=1;i<=15;i++){
			double figo=((Math.pow(1.618034, i))-(Math.pow(-0.618034, i)))/(Math.sqrt(5));
			
			int n;
			n=(int) figo;
			System.out.println(n);
	}

}}
