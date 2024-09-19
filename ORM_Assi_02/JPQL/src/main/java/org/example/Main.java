package org.example;

import org.example.config.FactoryConfiguration;
import org.example.entity.Boy;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        //SELECT

        Query query = session.createQuery("select c from Boy c");
        List<Boy> boys = query.list();

        for (Boy boy : boys){
            System.out.println(boy);
        }


        //INSERT
        //Doesn't support insert statement for JPQL


        //UPDATE

        /*Query query1 = session.createQuery("update Boy  b set b.address = :address, b.name = :name  where b.bId = :id");
        query1.setParameter("address","Galle");
        query1.setParameter("name","Kamal");
        query1.setParameter("Id",2);
        query1.executeUpdate();*/


        //DELETE

        /*Query query2 = session.createQuery("delete from Boy b where b.bId = :id");
        query2.setParameter("Id",2);
        query2.executeUpdate();*/


        //SEARCH BY ID

        /*Query query3 = session.createQuery("select b from Boy b where b.bId = :id");
        query3.setParameter("Id",3);
        List<Student> stList = query3.list();

        for (Boy boy : boyList){
            System.out.println(boy);
        }*/


        //JOINQUERY

        /*Query query4 = session.createQuery("select w from Boy b join b.watchList w where b.bId = :id");
        query4.setParameter("Id",1);
        List<Watch> watches = query4.list();

        for (Watch watch : watches){
            System.out.println("Watch type :"+watch.getType());
        }*/

        transaction.commit();
        session.close();

    }
}