package com.company.magicBoxBounded;

public class MagicBoxBounded<T extends Animal> {
    private T object;

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }
}
