package org.softwaretechnologies.animals;

public enum AnimalType {
    CAT{
        @Override
        public String getSound() {
            return "meow";
        }
    },
    DOG{
        @Override
        public String getSound() {
            return "woof";
        }
    },
    COW{
        @Override
        public String getSound() {
            return "moo";
        }
    };
    public abstract String getSound();
}
