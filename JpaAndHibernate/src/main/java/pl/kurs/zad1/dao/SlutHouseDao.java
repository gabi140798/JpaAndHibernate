package pl.kurs.zad1.dao;

import pl.kurs.zad1.model.SlutHouse;

public interface SlutHouseDao {

        void save(SlutHouse slutHouse);

        SlutHouse getSlutHouse(int id);

    }
