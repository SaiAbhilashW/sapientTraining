package training.sapient.works;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import training.sapient.beans.Person;
import training.sapient.util.HibernateUtil;

public class InsertPersonData01 {
	public static void main(String[] args) throws ParseException {
		
	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		//create a new session
		//which reperesents the db conn and which can help do tyhe CRUD operations
		
		Session session = sessionFactory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		Person p = new Person();
//		
//		p.setId(102);
//		p.setName("sai");
//		p.setHeight(6.1);
//		p.setAge(23);
//		
	SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy");
//		p.setBirthDate(sdf.parse("20-04-2010"));
//		
//		//insert / update / delete 
//		
//		session.save(p);
		
		

		
		
		p.setId(103);
		p.setName("mane");
		p.setHeight(6.1);
		p.setAge(23);
		
		sdf = new SimpleDateFormat("dd-mm-yyyy");
		p.setBirthDate(sdf.parse("20-04-2010"));
		session.save(p);
//		
//		p.setId(104);
//		p.setName("firmino");
//		p.setHeight(6.0);
//		p.setAge(27);
//		
//		sdf = new SimpleDateFormat("dd-mm-yyyy");
//		p.setBirthDate(sdf.parse("20-04-2010"));
//		session.save(p);
		transaction.commit();
		
		
	}
}
