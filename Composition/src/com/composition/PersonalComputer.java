
package com.composition;

/**
 * @author Rakin
 *
 * Jun 27, 2019
 */
public class PersonalComputer {
	
	private Case theCase;
	private Monitor monitor;
	private MotherBoard motherborad;
	
	public PersonalComputer(Case theCase, Monitor monitor, MotherBoard motherborad) {
		this.theCase = theCase;
		this.monitor = monitor;
		this.motherborad = motherborad;
	}

	public Case getTheCase() {
		return theCase;
	}

	public Monitor getMonitor() {
		return monitor;
	}

	public MotherBoard getMotherborad() {
		return motherborad;
	}
	

}
