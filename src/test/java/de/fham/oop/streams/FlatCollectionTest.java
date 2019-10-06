package de.fham.oop.streams;

import org.junit.jupiter.api.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

/*
 * Flatten multidimensional collection
 */
public class FlatCollectionTest {
	
	@Test
	public void shouldFlattenCollection() {
		List<String> firstList = asList("Viktor", "Farcic");
		List<String> secondList = asList("John", "Doe", "Third");
		List<List<String>> collection = asList(firstList,secondList);
		
		List<String> expected = asList("Viktor", "Farcic", "John", "Doe",
				"Third");
		
		List<String> result = FlatCollection.transform(collection);
		assertThat(result).isEqualTo(expected);
	}
}