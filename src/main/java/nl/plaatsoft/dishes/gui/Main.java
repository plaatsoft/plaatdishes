package nl.plaatsoft.dishes.gui;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import nl.plaatsoft.dishes.core.Config;

@SpringBootApplication
public class Main {
	
	/** The Constant log. */
	private static final Logger log = LogManager.getLogger( Main.class);

	/** The config. */
	private Config config = new Config();
	
	/**
	 * Init
	 */
	private void init() {		
		
		log.info("Init database {}", config.getDatabaseUrl());
		
		Map<String, String> properties = new HashMap<String, String>();
		properties.put("javax.persistence.jdbc.driver", config.getDatabaseDriver());
		properties.put("javax.persistence.jdbc.url", config.getDatabaseUrl());
		properties.put("javax.persistence.jdbc.user", config.getDatabaseUsername());
		properties.put("javax.persistence.jdbc.password", config.getDatabasePassword());
				
		properties.put("hibernate.dialect", config.getHibernateDialect());
		properties.put("hibernate.hbm2ddl.auto", config.getHibernateHbm2ddlAuto());
		properties.put("hibernate.show_sql", config.getHibernateShowSql());
						
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("PlaatDishes", properties);
        EntityManager entityManager = entityManagerFactory.createEntityManager();
	}
	
    public static void main(String[] args) {
    	    	
        SpringApplication.run(Main.class, args);
    }
    
}
