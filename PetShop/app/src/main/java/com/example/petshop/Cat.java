package com.example.petshop;
import java.util.Date;

public class Cat extends Pet implements Pettable {

    public Cat(String name) {
        super(name);
    }

    public Cat(Date birthdate, String name) {
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
