package de.fham.oop.streams;

import de.fham.oop.streams.common.Person;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

/*
 * Group people by nationality
 */
public class GroupingTest {

	@Test
    public void partitionAdultsShouldSeparateKidsFromAdults() {
        Person sara = new Person("Sara", 4, "Norwegian");
        Person viktor = new Person("Viktor", 40, "Serbian");
        Person eva = new Person("Eva", 42, "Norwegian");
        
        List<Person> collection = asList(sara, eva, viktor);
        
        Map<String, List<Person>> result = Grouping.groupByNationality(collection);
        
        assertThat(result.get("Serbian")).contains(viktor);
        assertThat(result.get("Norwegian")).contains(sara, eva);
    }
}
