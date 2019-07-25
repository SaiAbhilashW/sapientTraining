package training.day4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import training.day2.Account;

public class ReadWriteObject {

	public static void storeAccount(Account account) throws FileNotFoundException, IOException {
		File file = new File("account.ser");
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
		
		oos.writeObject(account);
		oos.writeInt(100);
		oos.close();
		System.out.println("Data written succesfully");
		
	}
	
	public static Account getAccount() throws FileNotFoundException, IOException, ClassNotFoundException {
		File file = new File("account.ser");
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
		
		Account acc = (Account) ois.readObject();
		System.out.println(ois.readInt());
		return acc;
	}
	
	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, IOException {
		Account account = new Account("boje", 12332);
		try {
			storeAccount(account);
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		Account acc = getAccount();
		System.out.println(acc.toString()); 
	}
}
