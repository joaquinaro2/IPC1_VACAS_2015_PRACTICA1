package principal;

import java.sql.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Programa2_201314725 {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//System.out.println("Ingrese su fecha de nacimiento (Dia/mes/a�o)");
//Scanner sc =new Scanner(System.in);
// int dia =sc.nextInt();
// int mes=sc.nextInt();
// int a�o=sc.nextInt();
// 
		//Instanciamos el objeto Calendar
        //en fecha obtenemos la fecha y hora del sistema
        Calendar fecha = new GregorianCalendar();
        //Obtenemos el valor del a�o, mes, d�a,
        //hora, minuto y segundo del sistema
        //usando el m�todo get y el par�metro correspondiente
        int a�o = fecha.get(Calendar.YEAR);
        int mes = fecha.get(Calendar.MONTH);
        int dia = fecha.get(Calendar.DAY_OF_MONTH);
        int hora = fecha.get(Calendar.HOUR_OF_DAY);
        int minuto = fecha.get(Calendar.MINUTE);
        int segundo = fecha.get(Calendar.SECOND);
        System.out.println("Fecha Actual: "
                           + dia + "/" + (mes+1) + "/" + a�o);
        System.out.printf("Hora Actual: %02d:%02d:%02d %n",
                                              hora, minuto, segundo);
	}

}
