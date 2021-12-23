package nl.plaatsoft.dishes.dao;

import java.util.List;
import java.util.Optional;
import javax.persistence.EntityManager;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * The Class StatusDao.
 * 
 * @author wplaat
 */
public class PersonDao {

	/** The Constant log. */
	private static final Logger log = LogManager.getLogger( PersonDao.class);
	
    /** The entity manager. */
    private EntityManager entityManager;
    
    /**
     * Instantiates a new Status dao.
     *
     * @param entityManager the entity manager
     */
    public PersonDao(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
        
    /**
     * Find all.
     *
     * @return the list
     */
    public List<Person> findAll() {
        return entityManager.createQuery("from Person").getResultList();
    }
   
    /**
     * Find by id.
     *
     * @param id the id
     * @return the optional
     */
    public Optional<Person> findById(long id) {
    	Person status = entityManager.find(Person.class, id);
        if (status != null) {
        	return Optional.of(status);
        } else {
        	return Optional.empty();
        }
    }
    
    /**
     * Save.
     *
     * @param status the status
     * @return the optional
     */
    public Optional<Person> save(Person status) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(status);
            entityManager.getTransaction().commit();
            return Optional.of(status);
        } catch (Exception e) {
            log.error(e.getMessage());
        }
        return Optional.empty();
    }
}