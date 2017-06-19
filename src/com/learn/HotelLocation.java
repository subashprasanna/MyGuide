package com.learn;

public class HotelLocation {
	
	public String getHotelLocation(String hotelName) {
		String result = "";
		if(hotelName.contains("taj")) {
			result = "13.196991,77.710376";
		} else if(hotelName.contains("ramada")) {
			result = "12.984286,77.600601";
		} else if(hotelName.contains("le meridian")) {
			result = "12.990758, 77.586406";
		}
		
		return result;
	}

}
