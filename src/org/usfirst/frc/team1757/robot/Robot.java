
package org.usfirst.frc.team1757.robot;

//Class imports from the WPILibj library
import edu.wpi.first.wpilibj.IterativeRobot;

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
import org.usfirst.frc.team1757.robot.DriveTrain;

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
	CANTalon talon;
	Gamepad gamepad;
	SpeedController leftDrive;
	SpeedController rightDrive;
	
    public void robotInit() {
    	//I believe because these objects are 'temporary' that they do need to be private.
    	//DriveTrains are used to further break apart code and make the Robot.java more readable
    	SpeedController leftDrive = new DriveTrain(new SpeedController[]{new CANTalon(Constants.CAN_.FRONTRIGHT), new CANTalon(Constants.CAN_.BACKRIGHT)}).setInverted(true);
        SpeedController rightDrive = new DriveTrain(new SpeedController[]{new CANTalon(Constants.CAN_.FRONTLEFT), new CANTalon(Constants.CAN_.BACKLEFT)}).setInverted(false);
        
    	
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
            leftDrive.set(gamepad.getX());
            rightDrive.set(gamepad.getY());
            
            if (gamepad.getButton_A())
            {
            	//Function dependent on text?
            }
        }
    }
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
    
    }
    
}
