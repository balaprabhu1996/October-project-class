package org.tamil;

public class CompanyInfo {

	private String name;

	public void setName(String name) {
		if (name.equals("CSK")) {
			this.name = "MSD";
		}
		else if (name.equals("Tamilnad")) {
			this.name = "Chennai";
		}









	}

	public String getName() {
		return name;
	}



}

