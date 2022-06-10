package com.company.magicBox;

public class MagicBox {
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
