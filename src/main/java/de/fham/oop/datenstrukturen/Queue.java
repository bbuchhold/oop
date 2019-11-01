package de.fham.oop.datenstrukturen;

import java.util.ArrayList;

public class Queue<g> {
    private ArrayList<g> elements;

    public Queue() {
        this.elements = new ArrayList<>();
    }

    public void queue(g element) {
        elements.add(element);
    }

    public g dequeue() {
        if(elements.isEmpty()) {
            throw new QueueIsEmtpyException();
        }
        return elements.remove(0);
    }

}
