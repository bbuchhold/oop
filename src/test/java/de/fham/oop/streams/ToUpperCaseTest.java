package de.fham.oop.streams;


import org.junit.jupiter.api.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

//https://technologyconversations.com/2014/11/04/java-8-streams-micro-katas/

/*
 * Convert elements of a collection to upper case.
 */
public class ToUpperCaseTest {

	@Test
	public void transformShouldConvertCollectionElementsToUpperCase() {
		List<String> collection = asList("My", "name", "is", "John", "Doe");
		List<String> expected = asList("MY", "NAME", "IS", "JOHN", "DOE");
		
		List<String> result = ToUpperCase.transform(collection);
		assertThat(result).isEqualTo(expected);
	}
}