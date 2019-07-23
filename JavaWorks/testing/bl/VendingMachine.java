package bl;

import beans.Drinks;
import standards.Options;

public class VendingMachine {


	
	public void drinkOption(Drinks drink) {
			if(drink.getName().equals(Options.CAPACHINO)) {
				Drinks.totalCount++; 
				
				
				
				//file.writeString("coffee:capachino:blr:naveen")
				
			}
	}
	
}
