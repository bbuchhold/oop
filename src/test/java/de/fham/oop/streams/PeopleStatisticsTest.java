package de.fham.oop.streams;

import de.fham.oop.streams.common.Person;
import de.fham.oop.streams.common.Statistics;
import org.junit.jupiter.api.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/*
 * Get people statistics: average age, count, maximum age, minimum age and sum of all ages.
 */
public class PeopleStatisticsTest {

	Person sara = new Person("Sara", 4);
	Person viktor = new Person("Viktor", 40);
	Person eva = new Person("Eva", 42);
	List<Person> collection = asList(sara, eva, viktor);

	@Test
	public void getStatisticsShouldReturnExpectedValues() {
		Statistics stats = PeopleStatistics.getStatistics(collection);
		assertNotNull(stats);
		
		int max = stats.getMax();
		assertThat(max).isEqualTo(42);
		
		int min = stats.getMin();
		assertThat(min).isEqualTo(4);
		
		long sum = stats.getSum();
		assertThat(sum).isEqualTo((long)(40 + 42 + 4));
		
		double avg = stats.getAverage();
		assertThat(avg).isEqualTo((double)((4 + 40 + 42) / 3));
		
		int count = stats.getCount();
		assertThat(count).isEqualTo(3);
	}

	
	@Test
	public void getAvgShouldReturnAverageAge() {
		int result = (int) PeopleStatistics.getAvg(collection);
		assertThat(result).isEqualTo(((4 + 40 + 42) / 3));
	}

	
	public void getMaxShouldReturnMaximumAge() {
		int result = PeopleStatistics.getMaxAge(collection);
		assertThat(result).isEqualTo(42);
	}
	
	@Test
	public void getMinShouldReturnMaximumAge() {
		int result = PeopleStatistics.getMinAge(collection);
		assertThat(result).isEqualTo(4);
	}
	
	@Test
	public void getSumShouldReturnSumOfAges() {
		long result = PeopleStatistics.getSum(collection);
		assertThat(result).isEqualTo((long)(40 + 42 + 4));
	}
}