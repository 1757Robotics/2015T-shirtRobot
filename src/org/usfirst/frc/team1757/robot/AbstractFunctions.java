package org.usfirst.frc.team1757.robot;

//wpi imports

public class AbstractFunctions {
	/**
	 * This class serves the purpose of further separating code by moving the robot hardware functions elsewhere
	 * In the main Robot.java class, we aim to minimize the size for the sake of readability and abstraction.
	 * Continue this practice throughout
	 * */
	
	
	public static void Compressor_Toggle()
	{
		//Enable the spikeRelay associated with the Compressor port number; 
		//likely will need to be appended depending on hardware implementation
		
	}
	
	
	//Abstracted cannon functions
	public static void Cannon_Fire(){
		//Enable the spikeRelay associated with the Sprinkler 
		
		
	}
	
	public static void Cannon_Load(){
		
	}
	
	public static void Cannon_Cycle(){
		//Cycle the cannon by 
	}
	
	public static void Cannon_Tilt_Up(){
		
	}
	
	public static void Cannon_Tilt_Down(){
		
	}
}
