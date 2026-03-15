package pl.kurs.zad1.dao;
import pl.kurs.zad1.model.Slut;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SlutDaolmpl implements SlutDao {

        private EntityManagerFactory factory;
        private EntityManager entityManager;


    public void SlutDaoImpl() {
        factory = Persistence.createEntityManagerFactory("myPersistenceUnit");
        entityManager = factory.createEntityManager();
    }

    @Override
        public void save(Slut slut) {
            EntityTransaction tx = entityManager.getTransaction();
            tx.begin();
            entityManager.persist(slut);
            tx.commit();
        }

        @Override
        public Slut getSlut(int id) {
            return entityManager.find(Slut.class, id);
        }

}

