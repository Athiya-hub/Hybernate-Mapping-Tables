package com.athiya.hybernatemapping.HybernateMappingProject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        
        Student st=new Student();
        Laptop lp=new Laptop();
        
        st.setHalltiktno(101);
        st.setStudentname("athiya");
        st.setId(1);
      st.getLaptop().add(lp);        
        lp.setId(1);
        lp.setLaptopname("HP ");
        lp.getStudent().add(st);
        
        Configuration con=new Configuration().configure("hybernate.cfg.xml").addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
        SessionFactory sf=con.buildSessionFactory();
        Session session=sf.openSession();
       Transaction tx=session.beginTransaction();
       
       session.save(st);
       session.save(lp);
       tx.commit();
    }
}
