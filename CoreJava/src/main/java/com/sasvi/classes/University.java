package com.sasvi.classes;

public class University {
	
	// object variables
		private String name;
		private String city;
		
		
		
	    // constructors
		public University() {
			super();
		}
		public University(String name, String city) {
			super();
			this.name = name;
			this.city = city;
		}
		
		
		// getters and setters
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
}
