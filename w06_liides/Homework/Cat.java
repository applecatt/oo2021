package Homework;

import java.util.Random;

public class Cat implements Animal{
    public String name;

    @Override
    public String speak() {
        String call = "Meow!";
        return call;
    }

    @Override
    public String eat() {
        Random r = new Random();
        String[] = new String[]{"chicken", "catches a bird outside", "ruins carpet"};
        return ;
    }

    @Override
    public String sleep() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String beSneaky() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String lookAround() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String attack() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String defend() {
        // TODO Auto-generated method stub
        return null;
    }
}
