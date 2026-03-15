package pl.kurs.zad1.dao;

import pl.kurs.model.Car;
import pl.kurs.zad1.model.Slut;

public interface SlutDao {

        void save(Slut slut);

        Slut getSlut(int id);

}
