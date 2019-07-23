package client;

import beans.Coffee;
import beans.Drinks;
import bl.VendingMachine;
import standards.Options;

public class App {
	public static void main(String[] args) {
		// choice 1 
		
		// one time create 
		VendingMachine vm = new VendingMachine(); 
		
		// loop 
		Drinks drink = new Drinks(Options.CAPACHINO); 
		//vm.drinkOption(drink, customer);
	}
}
