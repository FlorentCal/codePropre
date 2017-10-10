package ex2;

import java.time.LocalDateTime;

public class AppCountStock {

	public static void main(String[] args) {
		
		CountStock comptageStock = new CountStock(0, 0, LocalDateTime.of(2015, 1, 1, 1, 1, 1), LocalDateTime.of(2017, 1, 1, 1, 1, 1));
		
		comptageStock.addAmmount(2);
		comptageStock.displayCountStatus(CountType.SOMME);
		
		comptageStock.addAmmount(10);
		comptageStock.displayCountStatus(CountType.MOYENNE);

	}

}
