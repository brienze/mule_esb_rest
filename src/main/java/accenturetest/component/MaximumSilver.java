package accenturetest.component;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Value;

import accenturetest.model.Country;

/**
 * Class that finds the 5 countries which got greatest number of silver medals
 * @author brienze
 *
 */
public class MaximumSilver extends RioProcessor{
	
	/**
	 * Value stored in mule.properties
	 */
	@Value("${numberOfCountriesMedal}")
    private String numberOfCountriesMedal;
	
	public List<Country> findCountry(Country[] countries){
		Integer numberOfCountries = Integer.valueOf(numberOfCountriesMedal);
		List<Country> leaders = Stream.of(countries).sorted((c1,c2) -> c2.getSilverCount() - c1.getSilverCount() ).limit(numberOfCountries).collect(Collectors.toList());
		return leaders;
	}
}