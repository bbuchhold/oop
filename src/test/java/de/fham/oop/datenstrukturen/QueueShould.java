package de.fham.oop.datenstrukturen;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class QueueShould {

    public static final String FIRST_ELEMENT = "1st Element";
    public static final String SECOND_ELEMENT = "2nd Element";
    public static final String THRID_ELEMENT = "3rd Element";
    private Queue<String> queue;

    @BeforeEach
    void setUp() {
        queue = new Queue<>();
    }

    @Test
    void throwExceptionWhenEmpty() {
        assertThrows(QueueIsEmtpyException.class, () -> queue.dequeue());
    }

    @Test
    void returnElementsInOrderTheyWhereAdded() {
        queue.queue(FIRST_ELEMENT);
        queue.queue(SECOND_ELEMENT);
        queue.queue(THRID_ELEMENT);

        assertThat(queue.dequeue()).isEqualTo(FIRST_ELEMENT);
        assertThat(queue.dequeue()).isEqualTo(SECOND_ELEMENT);
        assertThat(queue.dequeue()).isEqualTo(THRID_ELEMENT);
    }
}