package edu.handong.csee.java.lab06.BugInfestation;	//the package name and the directory
import java.util.Scanner;	//import the class Scanner

/**
 * the class named BugInfestation
 * User will input the volume of the house, estimated number of roaches in the house.
 * Then the program calculates how long it takes for the roaches to fill the house,
   and how many roaches are inside after that.
 * @author KKB
 */
public class BugInfestation {	//Declare the class named BugInfestation
	static final double GROTH_RATE = 0.95;
	static final double ONE_BUG_VOLUME = 0.002;
	

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		double houseVolume;
		double population;
		double totalBugVolume;
		
		double startPopulation;
		double newBugs;
		double newBugVloume;
		int countWeeks=0;
		
		System.out.print("Enter the total volum of your house in cubic feet: ");
		houseVolume	= keyboard.nextDouble();
		System.out.print("Enter the estimated number of roaches in your houuse: ");
		startPopulation = keyboard.nextDouble();
		System.out.println("Starting with a roach population of "+population+"\nand a volume of "+houseVolume);
		
		population = startPopulation;
		totalBugVolume = population*ONE_BUG_VOLUME;
		while(totalBugVolume<houseVolume) {
			newBugs = population*GROTH_RATE;
			
		}
		
		
	
	}
}
