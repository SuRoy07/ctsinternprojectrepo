package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.bean.Customer;
import com.bean.Address;
import com.dao.CustomerDAO;

public class TestApplication {
    public static void main(String[] args) {
        // Load Hibernate configuration
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");

        // Create session factory
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();

        // Create CustomerDAO and set session
        CustomerDAO customerDAO = new CustomerDAO();
        customerDAO.setSession(session);

        // Create Address object
        Address address = new Address();
        address.setDoorNo("123");
        address.setStreetName("Main Street");
        address.setDistrict("Coimbatore");
        address.setPincode("641001");

        // Create Customer object
        Customer customer = new Customer();
        customer.setCustName("John Doe");

        // Add customer
        int customerId = customerDAO.addCustomer(customer, address);
        System.out.println("Customer added with ID: " + customerId);

        // Close session
        session.close();
        sessionFactory.close();
    }
}

