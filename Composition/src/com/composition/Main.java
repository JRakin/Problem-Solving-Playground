
package com.composition;

/**
 * @author Rakin
 *
 * Jun 27, 2019
 */
public class Main {

	public static void main(String[] args) {
		Dimension dimension = new Dimension(20, 20, 5);
		Case theCase = new Case("220B", "Dell", "240", dimension);
		
		Monitor monitor = new Monitor("27inch beast", "Acer", 27, new Resolution(1920,1080));
		MotherBoard motherboard = new MotherBoard("BJ-200", "Asus", 4, 4, "V2.44");
		
		PersonalComputer pc = new PersonalComputer(theCase, monitor, motherboard);
		
		pc.getMonitor().drawPixel(1200, 1000, "red");
		pc.getMotherborad().loadProgram("Windows 10");
		pc.getTheCase().pressPowerButton();

	}

}
