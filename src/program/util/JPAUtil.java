/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program.util;
/*
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
*/
public class JPAUtil {
    
       private static EntityManagerFactory entityManagerFactory;
 
    public static EntityManager getEntityManagerFactory() {
        if (entityManagerFactory==null) {
            entityManagerFactory = Persistence.createEntityManagerFactory("projetos");
        }
        return entityManagerFactory.createEntityManager();
    }

    private static class EntityManagerFactory {

        public EntityManagerFactory() {
        }

        private EntityManager createEntityManager() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

    private static class EntityManager {

        public EntityManager() {
        }
    }

    private static class Persistence {

        private static EntityManagerFactory createEntityManagerFactory(String projetos) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public Persistence() {
        }
    }
}
