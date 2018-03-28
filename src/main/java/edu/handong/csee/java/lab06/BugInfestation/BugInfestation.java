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
	static final double GROTH_RATE = 0.95;	//declare constant - weekly groth rate of the roach population
	static final double ONE_BUG_VOLUME = 0.002;	//declare constant - Volume of an average roach
	
	/**
	 * The main method get the informations(house volume, start populations of roaches) from user, 
	and calculates how long it takes for the roaches to fill the house, and how many roaches are inside after that time.
	Then print out the informations user inputed, and show the results.
	 * @param args
	 */
	public static void main(String[] args) {	//Declare the main method
		Scanner keyboard = new Scanner(System.in);	//instantiate the class Scanner to keyboard.
		double houseVolume;	//declare double variable to get house volume from user
		double population;	//declare double variable to calculate population
		double totalBugVolume;	//declare double variable to calculate the total bug volume
		
		double startPopulation;	//declare the double variable to get start populations of roaches from user
		double newBugs;	//declare the double variable to calculate the new bugs after a week
		double newBugVolume;	//declare the double variable to calculate the new bug volume
		int countWeeks=0;	//declare an integer value to count the weeks
		
		System.out.print("Enter the total volum of your house in cubic feet: ");	//print out the message to get the house volume from user
		houseVolume	= keyboard.nextDouble();	//get house volume from user
		System.out.print("Enter the estimated number of roaches in your houuse: ");	//print out the message to get the initial population of the roaches
		startPopulation = keyboard.nextDouble();	//get initial population of the roaches
		
		population = startPopulation;	//initiate population to start population
		totalBugVolume = population*ONE_BUG_VOLUME;	//initiate total bug volume
		
		while(totalBugVolume<houseVolume) {	//use while loop to repeat untio the total bug volume exceeds the house volume
			newBugs = population*GROTH_RATE;	// calculate the number of new bugs weekly 
			newBugVolume = newBugs*ONE_BUG_VOLUME;	//calculate the new bugs volume 
			population = population + newBugs;	//calculate the population of the roaches weekly increased
			totalBugVolume = totalBugVolume + newBugVolume;	//calculate the total bugs volume
			countWeeks = countWeeks + 1;	//count weeks after all calculations above is done
		}
		
		System.out.println("Starting with a roach population of "+startPopulation+"\nand a volume of "+houseVolume+ ". \nAfter "+countWeeks+" weeks,\nthe house will be filled with "+ population + " roaches.\n"+ "THey will fill a volume of "+totalBugVolume+" cubic feet.\nBetter call Debuggig Experts Inc.");
		//print out the informations user inputed and the result
		
	
	}
}
