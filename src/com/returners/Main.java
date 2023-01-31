package com.returners;

public class Main {

    public static void main(String[] args) {
        Student sam = new Student("Sam", Group.ONE, Grade.A);
        sam.setSecretNickName("D'Artagnan");
        sam.downgrade();
        System.out.println(sam);

        Student john = new Student("John", Group.THREE, Grade.D);
        john.setSecretNickName("Eragon");
        john.upgrade();
        System.out.println(john);
    }
}
