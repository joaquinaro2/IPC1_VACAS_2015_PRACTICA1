package principal;

import java.sql.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Programa2_201314725 {

	public static void main(String[] args) {
		System.out.println("Ingrese los siguientes datos de su fecha de nacimiento\ningrese el d�a");
		Scanner sc=new Scanner(System.in);
		int dia=sc.nextInt();
		System.out.println("ingrese el mes");
		int mes=sc.nextInt();
		System.out.println("ingrese el a�o");
		int a�o=sc.nextInt();
		int va=(2015*365+30*6+16-(a�o*365+mes*30+dia));
		if(va>(365*18)){
			System.out.println("Si se puede inscribir");
		}else {
			 System.out.println("No se puede inscribir");	 
			 }
		
		
	}
}
