package de.fham.oop.streams;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static java.util.Arrays.asList;

/*
 * Return all unique characters in the given list of Strings
 */
public class UniqueCharactersTest {
	
	@Test
	public void shouldReturnUniqueCharacters() {
		List<String> collection = asList("Hello", "World");
		List<String> expected = asList("H", "e", "l", "o", "W", "r", "d");
		
		List<String> result = UniqueCharacters.getUniqueCharacters(collection);
		Assertions.assertThat(result).isEqualTo(expected);
	}

}
