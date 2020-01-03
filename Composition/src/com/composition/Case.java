
package com.composition;

/**
 * @author Rakin
 *
 * Jun 27, 2019
 */
public class Case {
	private String model;
	private String manufacture;
	private String powerSupply;
	private Dimension dimension;
	
	public Case(String model, String manufacture, String powerSupply, Dimension dimension) {
		this.model = model;
		this.manufacture = manufacture;
		this.powerSupply = powerSupply;
		this.dimension = dimension;
	}
	
	public void pressPowerButton() {
		System.out.println("Power button is pressed");
	}
	
	public String getModel() {
		return model;
	}

	public String getManufacture() {
		return manufacture;
	}

	public String getPowerSupply() {
		return powerSupply;
	}

	public Dimension getDimension() {
		return dimension;
	}


}
