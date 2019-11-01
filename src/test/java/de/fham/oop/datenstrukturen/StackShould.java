package de.fham.oop.datenstrukturen;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StackShould {

    private static final Object OBJECT_1 = "Some Object";
    private static final Object OBJECT_2 = "Another object";
    private Stack stack;

    @BeforeEach
    public void initialise() {
        stack = new Stack();
    }

    @Test()
    public void throw_exception_if_popped_when_empty() {
        stack = new Stack();

        assertThrows(EmptyStackException.class, () -> stack.pop());
    }

    @Test
    public void pop_the_last_object_pushed() {
        stack.push(OBJECT_1);
        stack.push(OBJECT_2);

        assertThat(stack.pop()).isEqualTo(OBJECT_2);
    }

    @Test
    public void pop_objects_in_the_reverse_order_they_were_pushed() {
        stack.push(OBJECT_1);
        stack.push(OBJECT_2);

        assertThat(stack.pop()).isEqualTo(OBJECT_2);
        assertThat(stack.pop()).isEqualTo(OBJECT_1);
    }

}