package de.fham.oop.streams;

import org.junit.jupiter.api.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

/*
 * Filter collection so that only elements with less then 4 characters are returned.
 */
public class FilterCollectionTest {
	
	@Test
	public void shouldFilterCollection() {
		List<String> collection = asList("My", "name", "is", "John", "Doe");
		List<String> expected = asList("My", "is", "Doe");
		
		List<String> result = FilterCollection.filter(collection);
		assertThat(result).isEqualTo(expected);
	}
}