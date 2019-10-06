package de.fham.oop.streams;

import de.fham.oop.streams.common.Person;
import org.junit.jupiter.api.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

/*
 * Get oldest person from the collection
 */
public class OldestPersonTest {
	
	@Test
    public void shouldReturnOldestPerson() {
        Person sara = new Person("Sara", 4);
        Person viktor = new Person("Viktor", 40);
        Person eva = new Person("Eva", 42);
        
        List<Person> collection = asList(sara, eva, viktor);
        assertThat(OldestPerson.getOldestPerson(collection)).isEqualTo(eva);
    }
}