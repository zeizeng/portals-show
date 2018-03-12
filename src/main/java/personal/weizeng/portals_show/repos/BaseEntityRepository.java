package personal.weizeng.portals_show.repos;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class BaseEntityRepository<T> {
	
	@PersistenceContext
	protected EntityManager entityManager;
	
	
   public void save(T t){
    	entityManager.persist(t);
    }
}
