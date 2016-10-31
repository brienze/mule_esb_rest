package accenturetest.component;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Value;

import accenturetest.model.Country;

import java.util.List;

/**
 * Class that finds the 5 countries which got greatest number of gold medals
 * @author brienze
 *
 */
public class MaximumGold extends RioProcessor{
	
	/**
	 * Value stored in mule.properties
	 */
	@Value("${numberOfCountriesMedal}")
    private String numberOfCountriesMedal;
	
	public List<Country> findCountry(Country[] countries){
		Integer numberOfCountries = Integer.valueOf(numberOfCountriesMedal);
		List<Country> leaders = Stream.of(countries).sorted((c1,c2) -> c2.getGoldCount() - c1.getGoldCount() ).limit(numberOfCountries).collect(Collectors.toList());
		return leaders;
	}
}
