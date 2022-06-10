package com.company.magicBox;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MagicBoxDemo {
    public static void main(String[] args) {
        /*
        MagicBox magicBox = new MagicBox();
        magicBox.setObject(new ArrayList<String>(Arrays.asList("1","2","3")));

        //System.out.println(magicBox.getObject());
        Object object = magicBox.getObject();
        Class c = object.getClass();
        System.out.println(c);

        MagicBoxGeneric<Integer> magicBoxInteger = new MagicBoxGeneric<>();
        magicBoxInteger.setObject(1);
        System.out.println(magicBoxInteger.getObject());

        MagicBoxGeneric<List<String>> magicBoxInteger1 = new MagicBoxGeneric<>();
        magicBoxInteger1.setObject(Arrays.asList("1","2","3"));
        System.out.println(magicBoxInteger1.getObject());

         */

        MagicBoxPair<Integer, String> magicBoxPair = new MagicBoxPair<>(1,"s");
        System.out.println(magicBoxPair.getFirst());


    }
}

