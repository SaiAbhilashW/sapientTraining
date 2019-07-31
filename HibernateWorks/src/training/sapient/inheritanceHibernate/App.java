package training.sapient.inheritanceHibernate;

import org.hibernate.Session;

import training.sapient.util.HibernateUtil;

public class App {
	public static void main(String[] args) {
		Product products[] = {
				new Television(101,"LG TV","Good Tv", 2000, "LCD",32, "1024*2048" ),
				new Television(102,"PG TV","Bad Tv", 300, "LED",32, "1024*2000" ),
				new CellPhone(103,"One Plus","Bad Phone", 300, "Android","gsm","smartphone" )
		};
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		for(Product temp : products) {
			session.save(temp);
		}
		
		session.beginTransaction().commit();
		
		System.out.println("Transaction done");
		}
}
