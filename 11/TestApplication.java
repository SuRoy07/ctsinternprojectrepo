package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.bean.Country;
import com.bean.State;
import com.dao.CountryDAO;
import java.util.List;

public class TestApplication {
    public static void main(String[] args) {
        // Load Hibernate configuration
      
        SessionFactory sessionFactory =new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Session session = sessionFactory.openSession();

        // Set session to CountryDAO
        CountryDAO countryDAO = new CountryDAO();
        countryDAO.setSession(session);

        // Test the application
        Country country = new Country();
        country.setCountryName("India");
        country.setCurrency("INR");
        country.setCapital("New Delhi");


        State state = new State();
        state.setStateName("Tamil Nadu");
        state.setLanguage("Tamil");
        state.setPopulation(75000000);
        

         State state1 = new State();
        state1.setStateName("Maharashtra");
        state1.setLanguage("Marathi");
        state1.setPopulation(112000000);
                countryDAO.addCountry(country);
        countryDAO.addStatetoCountry("India", state);
        countryDAO.addStatetoCountry("India", state1);


        // Fetch states with max population
        List<State> states = countryDAO.stateWithMaxPopulation("India");
        for (State s : states) {
            System.out.println("State with max population: " +s.getStateName() );
        }

        // Remove country
        countryDAO.removeCountry("India");

        // Close session
        session.close();
        sessionFactory.close();
    }
}
