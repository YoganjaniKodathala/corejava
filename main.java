package onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class main {
public static void main(String[] args) {
	SessionFactory sf=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	Session s=sf.openSession();
	Transaction t=s.beginTransaction();
	//we are mapping two tables with id...two tables are=question and answer;
	Question q = new Question(1, "jdk");//obj for question..
	Answer a=new Answer(101, "java development kit"); //obj for answer..
	s.save(a);
	q.setAns(a);
	s.save(q);
	t.commit();
	System.out.println("Record inserted");
}
}