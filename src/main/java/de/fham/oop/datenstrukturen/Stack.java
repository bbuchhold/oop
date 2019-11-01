package de.fham.oop.datenstrukturen;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class Stack {
    private List<Object> objects = new ArrayList<>();

    public Object pop() {
        if (objects.isEmpty()) {
            throw new EmptyStackException();
        }
        return objects.remove(objects.size() - 1);
    }

    public void push(Object object) {
        this.objects.add(object);
    }
}