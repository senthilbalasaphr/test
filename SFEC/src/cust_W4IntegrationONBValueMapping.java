
public class cust_W4IntegrationONBValueMapping {

	
	public String getExternalCode() {
		return externalCode;
	}
	public void setExternalCode(String externalCode) {
		this.externalCode = externalCode;
	}
	public String getExternalName() {
		return externalName;
	}
	public void setExternalName(String externalName) {
		this.externalName = externalName;
	}
	public String getCust_valueMapCode() {
		return cust_valueMapCode;
	}
	public void setCust_valueMapCode(String cust_valueMapCode) {
		this.cust_valueMapCode = cust_valueMapCode;
	}
	public String getCust_ONBValue() {
		return cust_ONBValue;
	}
	public void setCust_ONBValue(String cust_ONBValue) {
		this.cust_ONBValue = cust_ONBValue;
	}
	public String getCust_ECValue() {
		return cust_ECValue;
	}
	public void setCust_ECValue(String cust_ECValue) {
		this.cust_ECValue = cust_ECValue;
	}
	
	String externalCode;
	String externalName;
	String cust_valueMapCode;
	String cust_ONBValue;
	String cust_ECValue;
	
	public cust_W4IntegrationONBValueMapping(String externalCode,String externalName,String cust_valueMapCode,String cust_ONBValue,String cust_ECValue)
	{
	this.externalCode = externalCode;
	this.externalName = externalName;
	this.cust_valueMapCode = cust_valueMapCode;
	this.cust_ONBValue = cust_ONBValue;
	this.cust_ECValue = cust_ECValue;
	
	}
	
}
