package pl.kurs.dao;

import pl.kurs.model.Car;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CarDaoImpl implements CarDao {

    private EntityManagerFactory factory;
    private EntityManager entityManager;


    public CarDaoImpl() {
        // tworrzenie fabryki zwiazdko encji na podstawie jednostki utrwalania
        factory = Persistence.createEntityManagerFactory("myPersistenceUnit");
        // tworzymy zarzadzce  encjami pobierrajac go z fabryki
        entityManager = factory.createEntityManager();
    }

    @Override
    public void save(Car car) {
        //tworzsymy transakcje
        EntityTransaction tx = entityManager.getTransaction();
        // rozpoczynamy transakcje
        tx.begin();
        // zapisujemy obiekt
        entityManager.persist(car);
        // komitujemy zmiany
        tx.commit();
    }

    @Override
    public Car getCar(Long id) {
        return entityManager.find(Car.class, id);
    }
}
