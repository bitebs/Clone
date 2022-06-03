package com.company.magicBox;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

public class MagicBoxDemo {
    public static void main(String[] args) {
        MagicBox magicBox = new MagicBox();
        magicBox.setObject(new ArrayList<String>(Arrays.asList("1","2","3")));

        //System.out.println(magicBox.getObject());
        Object object = magicBox.getObject();
        Class c = object.getClass();
        System.out.println(c);

        MagicBoxGeneric<Integer> magicBoxInteger = new MagicBoxGeneric<>();
    }
}

class MagicBox{
    private Object object;

    @Override
    public String toString() {
        return "MagicBox";

    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }


}
