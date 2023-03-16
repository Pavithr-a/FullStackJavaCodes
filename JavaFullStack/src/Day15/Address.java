package Day15;

public class Address {
	private String name;
	private String houseNo;
	private String streetName;
	private String city;
	private String state;
	private String pincode;
	public Address(String name, String houseNo, String streetName, String city, String state, String pincode) {
		this.name = name;
		this.houseNo = houseNo;
		this.streetName = streetName;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [name=" + name + ", houseNo=" + houseNo + ", streetName=" + streetName + ", city=" + city
				+ ", state=" + state + ", pincode=" + pincode + "]";
	}
	/*public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}*/
	
	

}
