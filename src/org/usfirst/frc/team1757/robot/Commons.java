package org.usfirst.frc.team1757.robot;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Commons {

	// Constant variables for the button codes on the F310 gamepad
	public static final int 
	BUTTON_A = 1, BUTTON_B = 2, BUTTON_X = 3,
	BUTTON_Y = 4, BUTTON_LB = 5, BUTTON_RB = 6,
	BUTTON_BACK = 7, BUTTON_START = 8, BUTTON_LS = 9, BUTTON_RS = 10;
	
	//void function designed to read all lines from a .txt file and return them to a string array
	public static String[] readLines(String path)
	{
		try {
    		Scanner filescan = new Scanner(path);
    		 List<String> outList = Arrays.asList(); //Safe empty declaration
    		while (filescan.hasNextLine())
    		{
    			outList.add(filescan.nextLine());
    		}
    		filescan.close();
    		return (String[]) outList.toArray(); // Possibly dangerous type casting
    	}
    	catch (Exception e)
    	{
    		System.out.println("Error opening button layout file, will use defaults\n" + e.toString());
    		return new String[] {};
    	}
	}
	
	// Constant variable for the location of the button layout file
	public static final String FILEPATH = "/RobotButtonLayout.txt";
	
	// Array variable for button function for use with gamepad button layout
	public static String[] BUTTONFUNCTION = new String[] {};
	
	/* Analog (raw)Axis codes
	Left Stick Up/Dn = 2 Axis (Dn+)
	Left Stick L/R = Axis 1 (L-)
	Right Stick Up/Dn = Axis 5 (Dn+)
	Right Stick L/R = Axis 4 (L-)
	Left Trigger = Axis 3 (+)
	Right Trigger = Axis 3 (-)
	Gamepad Up = Axis 2(-)
	Gamepad Dn = Axis 2(+)
	Gamepad L = Axis 6(-)
	Gamepad R = Axis 6(+)

	NOTE: Mode switch changes Axis 2 between Left Stick Up/Dn and Gamepad Up/Dn
	*/
	
	//Method purpose: Load all lines from 
	//public static final // 
	
	
	public static void Compressor_Toggle()
	{
		
	}
	
	public static void Cannon_Fire(){
		
	}
}