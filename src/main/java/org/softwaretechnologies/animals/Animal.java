package org.softwaretechnologies.animals;

public class Animal {
    private final String name;
    private final AnimalType type;

    public Animal(String name, AnimalType type){
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    /**
     * Создайте три класса животных: кошка, корова, собака.
     * Кошка должна издавать звук: "meow"
     * Корова должна издавать звук: "moo"
     * Собака должна издавать звук: "woof"
     * @return Метод должен возвращать строку, соответсвующую издаваемого животным звука.
     */
    public String sound(){
        return type.getSound();
    }
}
