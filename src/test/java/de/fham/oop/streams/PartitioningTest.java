package de.fham.oop.streams;

import de.fham.oop.streams.common.Person;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

/*
 * Partition adults and kids
 */
public class PartitioningTest {

	@Test
	public void adultsShouldSeparateKidsFromAdults() {
		Person sara = new Person("Sara", 4);
		Person viktor = new Person("Viktor", 40);
		Person eva = new Person("Eva", 42);
		
		List<Person> collection = asList(sara, eva, viktor);
		
		Map<Boolean, List<Person>> result = Partitioning.partitionAdults(collection);
		assertThat(result.get(true)).containsExactlyInAnyOrder(viktor, eva);
		assertThat(result.get(false)).containsExactlyInAnyOrder(sara);
	}
}