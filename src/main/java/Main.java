import org.hibernate.Session;
import org.hibernate.SessionFactory;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.security.auth.login.Configuration;
import javax.swing.text.html.parser.Entity;

public class Main {
    public  static void main(String args[]){
        EntityManagerFactory entityManagerFactory=  Persistence.createEntityManagerFactory("org.hibernate.tutorial.jpa");
        Client cl=new Client();
        cl.setId(6);
        cl.setName("Harish gupta");
        Bank bnk=new Bank();
        bnk.setId(6);
        bnk.setName("bank of China");

        Address adr=new Address();
        adr.setStreet("PVR street");
        adr.setCity("Allahabad");
        adr.setState("Uttar Pradesh");
        adr.setPincode("234523");
        cl.setAddress(adr);
        Branch br=new Branch();

        br.setCity("Allahabad");
        Address adr1=new Address();
        adr1.setStreet("New Express Way");
        adr1.setCity("Allahabad");
        adr1.setState("UP");
        adr1.setPincode("211012");
        br.getListOfAddress().add(adr1);

        Address adr2 =new Address();
        adr2.setStreet("Jhalwa");
        adr2.setCity("Allahabad");
        adr2.setState("UP");
        adr2.setPincode("342345");
        br.getListOfAddress().add(adr2);

        Address adr3=new Address();
        adr3.setStreet("Johnsonganj");
        adr3.setCity("Allahabad");
        adr3.setState("UP");
        adr3.setPincode("347652");
        br.getListOfAddress().add(adr3);

        EntityManager entityManager=entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(cl);
        entityManager.persist(bnk);
        entityManager.persist(br);
        entityManager.getTransaction().commit();
        entityManagerFactory.close();


        /*SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();*/



    }
}
