package org.softwaretechnologies;

import org.softwaretechnologies.animals.*;

public class AnimalFactory {

    /**
     * Метод для создания животных по типу
     * @param name - имя животного
     * @param type - тип животного
     * @return животное, соответствующее каждому из типов.
     */


    public static Animal createAnimal(String name, AnimalType type) {
        /* TODO в зависимости от type создайте и верните нужное животное */
        if (type == null) return null;
        return new Animal(name, type);
    }
}
