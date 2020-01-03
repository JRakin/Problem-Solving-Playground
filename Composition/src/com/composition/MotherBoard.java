
package com.composition;

/**
 * @author Rakin
 *
 * Jun 27, 2019
 */
public class MotherBoard {
	private String model;
	private String manufacture;
	private int ramSlots;
	private int cardSlots;
	private String bios;
	
	public MotherBoard(String model, String manufacture, int ramSlots, int cardSlots, String bios) {
		this.model = model;
		this.manufacture = manufacture;
		this.ramSlots = ramSlots;
		this.cardSlots = cardSlots;
		this.bios = bios;
	}
	public void loadProgram(String programName) {
		System.out.println("Program "+programName+" is loading now...");
	}

	
	public String getModel() {
		return model;
	}

	public String getManufacture() {
		return manufacture;
	}

	public int getRamSlots() {
		return ramSlots;
	}

	public int getCardSlots() {
		return cardSlots;
	}

	public String getBios() {
		return bios;
	}


}
