package com.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.bean.Country;
import com.bean.State;

public class CountryDAO {
    private Session session;

    // Getter and setter for session
    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }

    public void addCountry(Country country) {
       Transaction transaction= session.beginTransaction();
        session.save(country);
        transaction.commit();
    }

    public void addStatetoCountry(String countryName, State state) {
        Transaction transaction=session.beginTransaction();
        Country country =(Country) session.get(Country.class, countryName);
        if (country != null) {
            state.setCountry(country);
            country.getStatelist().add(state);
            session.save(state);
        }
        transaction.commit();
    }

    public List<State> stateWithMaxPopulation(String countryName) {
        String hql = "FROM State s WHERE s.country.countryName = :countryName AND s.population = (SELECT MAX(s2.population) FROM State s2 WHERE s2.country.countryName = :countryName)";
      return session.createQuery(hql).setParameter("countryName",countryName).list();
    }

    public void removeCountry(String countryName) {
        Transaction transaction=session.beginTransaction();
        Country country = (Country)session.get(Country.class, countryName);
        if (country != null) {
            session.delete(country);
        }
transaction.commit();
}
}
