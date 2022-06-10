package com.company.magicBoxBounded;

public class BoundedDemo {
    public static void main(String[] args) {
        MagicBoxBounded<Bird> magicBoxBounded = new MagicBoxBounded<>();

        magicBoxBounded.setObject(new Pigeon());
    }
}
