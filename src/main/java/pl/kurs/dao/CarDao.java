package pl.kurs.dao;

import pl.kurs.model.Car;

public interface CarDao {

    // zapis
    void save(Car car);

    // odczyt
    Car getCar(Long id);
}
