/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernateexample;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import java.util.*;
/**
 *
 * @author ronsilva
 */
public class AutomobileDAO {

    SessionFactory factory = null;
    Session session = null;

    private static AutomobileDAO single_instance = null;

    private AutomobileDAO()
    {
        factory = HibernateUtil.getSessionFactory();
    }

    /** This is what makes this class a singleton.  You use this
     *  class to get an instance of the class.
     * @return  */
    public static AutomobileDAO getInstance()
    {
        if (single_instance == null) {
            single_instance = new AutomobileDAO();
        }

        return single_instance;
    }

    /** Used to get more than one customer from database
     *  Uses the OpenSession construct rather than the
     *  getCurrentSession method so that I control the
     *  session.  Need to close the session myself in finally
     * @return  */
    public List <Automobile> getAutomobiles() {

        try {   
            session = factory.openSession();
            session.getTransaction().begin();
            String sql = "from hibernateexample.Automobile";
            List<Automobile> as = (List<Automobile>) session.createQuery(sql).getResultList();
            session.getTransaction().commit();
            return as;

        } catch (Exception e) {
            e.printStackTrace();
            // Rollback in case of an error occurred.
            session.getTransaction().rollback();
            return null;
        } finally {
            session.close();
        }

    }

    public Automobile getAutomobile(int id) {

        try {
            session = factory.openSession();
            session.getTransaction().begin();
            String sql = "from hibernateexample.Automobile where id=" + Integer.toString(id);
            Automobile a = (Automobile) session.createQuery(sql).getSingleResult();
            session.getTransaction().commit();
            return a;

        } catch (Exception e) {
            e.printStackTrace();
            // Rollback in case of an error occurred.
            session.getTransaction().rollback();
            return null;
        } finally {
            session.close();
        }
    }

}

