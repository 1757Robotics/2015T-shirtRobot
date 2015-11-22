
package org.usfirst.frc.team1757.robot;

//Class imports from the WPILibj library
import edu.wpi.first.wpilibj.IterativeRobot;

//Added Java imports
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//Added WPI Library imports
import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.SpeedController;

//Importing functions from Commons class
import org.usfirst.frc.team1757.robot.Commons;

/**
 * WPI GENERATED COMMENT
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */

public class Robot extends IterativeRobot {
    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
		
	//TODO REMOVE --- Class reference variables
		//I don't understand why we use these, you generally aren't supposed to have null declarations. Safer?
		//See SpeedController instantiations for alternative examples
	CANTalon talon ;
	Joystick gamepad;
	Solenoid singleSolenoid;
	SpeedController speedController;
	Relay spikeRelay;
	DoubleSolenoid doubleSolenoid;
	
    public void robotInit() {
    	//Object instantiation and definition for dependencies
    	
    	//The port numbers for these variables are not correct. Assume that proper values are entered prior to use.
    	
    	//Talon object instantiation on CAN port 0
    	//speedController = new CANTalon(0);
    	SpeedController frontRight = new CANTalon(0);
    	//Talon object instantiation on CAN port 1
    	SpeedController frontLeft = new CANTalon(1);
    	//Talon object instantiation on CAN port 2
    	SpeedController backRight = new CANTalon(2);
    	//Talon object instantiation on CAN port 3
    	SpeedController backRleft = new CANTalon(3);
    	//Talon object instantiation on CAN port 4
    	SpeedController heightAdjust = new CANTalon(4);
    	
    	//Joystick object instantiation on port 0; used for robot operation
    	gamepad = new Joystick(0);
    	
    	//spikeRelay object instantiation on PWM port 0; used for sprinkler valve
    	spikeRelay = new Relay(0);
    	//Relay spikeRelay = new Relay(0);
    	//This port number is likey incorrect
    		//Note that we will likely be using more than one spikeRelay in practice; append to reflect hardware change
    		//Incomplete: append for compressor controls -- or can use PCM instead
    	
    	
    	//Double solenoid object instantiation on PWM port 1,2; used for piston control
    	DoubleSolenoid pistonControl = new DoubleSolenoid(1,2); // These port numbers are likely incorrect
    	//Append solenoid implementation to reflect hardware changes. 
    	//Likely will include second solenoid for compressor air input control.
    	
    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {

    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
    	
    	
    	/*
    	 * In this branch of the project support for a loop & if maze based system of controller input; however,
    	 * future branches should utilize event based input for the sake of a cleaner project and better programming practice.
    	 * 
    	 * Note the structure of the code: the buttons are detected sequentially with priority on the most 
    	 * 
    	 * */
        while(isEnabled() && isOperatorControl()){
        	//Loops during FRC safe operator control time
        	if (gamepad.getRawButton(Commons.BUTTON_A)){
        		if (Commons.BUTTONFUNCTION[Commons.BUTTON_A] == "")
        		spikeRelay.set(Relay.Value.kForward);
        		
        	}
        	
        	
        		
        }
    }
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
    
    }
    
}
