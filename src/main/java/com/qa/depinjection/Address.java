package com.qa.depinjection;

public class Address {

	private int houseNo;
	private String roadName;
	private String city;
	private String postcode;
	
	
	
	
	public Address(int houseNo, String roadName, String city, String postcode) {
		this.houseNo = houseNo;
		this.roadName = roadName;
		this.city = city;
		this.postcode = postcode;
	}


	@Override
	public String toString() {
		return "Address [houseNo=" + houseNo + ", roadName=" + roadName + ", city=" + city + ", postcode=" + postcode
				+ "]";
	}
	
	
	
}
