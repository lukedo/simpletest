package com.example.demo.hello;

public class TestStatic {

    public static class animal {
        private String name;
        private static int age;

        public static void move() {
            System.out.println("just move and do sports!!!!");
        }

        public void fly() {
            System.out.println("just try to fly!" + age);
        }


    }
    public static void main(String[] args) {
        System.out.println("hello static method!");
        animal dog = new animal();
        dog.age = 12;
        dog.name = "ok";
        dog.fly();
        dog.move();

    }
}