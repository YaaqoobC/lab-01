package com.example.petshop;
import java.util.Date;

public class Dog extends Pet implements Pettable{

    public Dog(String name) {
        super(name);
    }

    public Dog(Date birthdate, String name) {
        super(birthdate, name);
    }

    @Override
    public String speak() {
        return "meow";
    }

    @Override
    public void pet() {
        // Pet Dog
    }
}
