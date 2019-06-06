
public class W4IntegrationONBMapping {
	
	String externalCode;
	public W4IntegrationONBMapping(String externalCode2, String externalName2, String state2, String oNBField2,
			String eCField2, String valueMapCode2) {
		// TODO Auto-generated constructor stub
		this.externalCode = externalCode2;
		this.externalName = externalName2;
		this.State = state2;
		this.ONBField = oNBField2;
		this.ECField = eCField2;
		this.valueMapCode = valueMapCode2;
		
			
		
	}
	public String getExternalName() {
		return externalName;
	}
	public void setExternalName(String externalName) {
		this.externalName = externalName;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getONBField() {
		return ONBField;
	}
	public void setONBField(String oNBField) {
		ONBField = oNBField;
	}
	public String getECField() {
		return ECField;
	}
	public void setECField(String eCField) {
		ECField = eCField;
	}
	public String getValueMapCode() {
		return valueMapCode;
	}
	public void setValueMapCode(String valueMapCode) {
		this.valueMapCode = valueMapCode;
	}

	public String getExternalCode() {
		return externalCode;
	}
	public void setExternalCode(String externalCode) {
		this.externalCode = externalCode;
	}
	public String get__metadata() {
		return __metadata;
	}
	public void set__metadata(String __metadata) {
		this.__metadata = __metadata;
	}
	String externalName;
	String State;
	String ONBField;
	String ECField;
	String valueMapCode;
	String __metadata;
}
