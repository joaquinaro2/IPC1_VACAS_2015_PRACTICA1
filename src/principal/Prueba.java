package principal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Prueba {
	public static void main(String[] args)
	{
	      double valor = 1254.625;
	      String val = valor+"";
	      BigDecimal big = new BigDecimal(val);
	      big = big.setScale(0, RoundingMode.HALF_UP);
	      System.out.println("Número : "+big);
	}
}
