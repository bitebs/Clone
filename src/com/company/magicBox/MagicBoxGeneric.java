package com.company.magicBox;

public class MagicBoxGeneric<T> {
    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    private T object;
}
