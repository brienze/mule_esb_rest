package accenturetest.component;

import java.util.List;

import org.mule.api.MuleEventContext;
import org.mule.api.MuleMessage;

import accenturetest.model.Country;

/**
 * Entry point resolver to process the Rio Olympic 2016 medal counts
 * @author brienze
 *
 */
public abstract class RioProcessor implements org.mule.api.lifecycle.Callable{
	public Country[] processar( Country[] countries){
		return countries;	
	}
	
	public Object[] processar(Object[] countries){
		return null;
	}

	@Override
	public Object onCall(MuleEventContext eventContext) throws Exception {
		MuleMessage me = eventContext.getMessage();
		Country[] countries = (Country[])me.getPayload();
		Integer numberOfCountries = Integer.valueOf(eventContext.getMuleContext().getRegistry().get("numberOfCountriesMedal"));
		System.out.println("numberOfCountries: "+numberOfCountries);
		return findCountry(countries);
	}
	
	public abstract List<Country> findCountry(Country[] countries);
}
