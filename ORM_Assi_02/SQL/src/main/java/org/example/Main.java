package org.example;

import org.example.config.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        //select
        NativeQuery query = session.createNativeQuery("select * from Author");
        List<Object[]> authors = query.list();
        for (Object[] author: authors){
            System.out.println(author[0]+":"+author[1]);
        }

        //select - 2nd way
        NativeQuery query6 = session.createNativeQuery("select * from Author");
        /*query.addEntity(Customer.class);
        List<Author> authors = query.list();
        for (Author customer: authors){
            System.out.println(author);
        }*/

        //insert
        /*NativeQuery query1 = session.createNativeQuery("insert into customer values(?1,?2)");
        query1.setParameter(1,2);
        query1.setParameter(2,"Amal");
        query1.executeUpdate();*/


        //update,
       /* NativeQuery query2 = session.createNativeQuery("update customer set name =?1 where cid =?2");
        query2.setParameter(1,"Kamal");
        query2.setParameter(2,2);
        query2.executeUpdate();*/

        // delete
        /*NativeQuery query3 = session.createNativeQuery("delete from customer where cid=?1");
        query3.setParameter(1,2);
        query3.executeUpdate();
*/
        //searchByName
        /*NativeQuery query4 = session.createNativeQuery("select * from customer where name=?1");
        query4.addEntity(Customer.class);
        query4.setParameter(1,"Sherul");
        Customer customer = (Customer) query4.uniqueResult();
        System.out.println(customer);*/


        transaction.commit();
        session.close();
    }
}