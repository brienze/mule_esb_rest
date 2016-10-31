package accenturetest.model;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * POJO class that represents Rio Olympic 2016 GET methods
 * 
 * @author brienze
 *
 */
@JsonAutoDetect
public class Country{

	@JsonProperty("rank")
	private Integer rank;
	
	@JsonProperty("country_code")
	private String countryCode;
	
	@JsonProperty("country_name")
	private String countryName;
	
	@JsonProperty("gold_count")
	private Integer goldCount;
	
	@JsonProperty("silver_count")
	private Integer silverCount;
	
	@JsonProperty("bronze_count")
	private Integer bronzeCount;
	
	@JsonProperty("medal_count")
	private Integer medalCount;

	/**
	* 
	* @return
	* The rank
	*/
	public Country(){
		
	}
	
	public Integer getRank() {
		return rank;
	}
	
	/**
	* 
	* @param rank
	* The rank
	*/
	
	public void setRank(Integer rank) {
		this.rank = rank;
	}
	
	/**
	* 
	* @return
	* The countryCode
	*/
	
	public String getCountryCode() {
		return countryCode;
	}
	
	/**
	* 
	* @param countryCode
	* The country_code
	*/
	
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	
	/**
	* 
	* @return
	* The countryName
	*/
	
	public String getCountryName() {
		return countryName;
	}
	
	/**
	* 
	* @param countryName
	* The country_name
	*/
	
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	
	/**
	* 
	* @return
	* The goldCount
	*/
	
	public Integer getGoldCount() {
		return goldCount;
	}
	
	/**
	* 
	* @param goldCount
	* The gold_count
	*/
	
	public void setGoldCount(Integer goldCount) {
		this.goldCount = goldCount;
	}
	/**
	* 
	* @return
	* The silverCount
	*/
	
	public Integer getSilverCount() {
		return silverCount;
	}
	
	/**
	* 
	* @param silverCount
	* The silver_count
	*/
	
	public void setSilverCount(Integer silverCount) {
		this.silverCount = silverCount;
	}
	
	/**
	* 
	* @return
	* The bronzeCount
	*/
	
	public Integer getBronzeCount() {
		return bronzeCount;
	}
	
	/**
	* 
	* @param bronzeCount
	* The bronze_count
	*/
	
	public void setBronzeCount(Integer bronzeCount) {
		this.bronzeCount = bronzeCount;
	}
	
	/**
	* 
	* @return
	* The medalCount
	*/
	
	public Integer getMedalCount() {
		return medalCount;
	}
	
	/**
	* 
	* @param medalCount
	* The medal_count
	*/
	
	public void setMedalCount(Integer medalCount) {
		this.medalCount = medalCount;
	}
}

