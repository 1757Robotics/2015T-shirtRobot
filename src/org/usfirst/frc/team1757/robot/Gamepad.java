package org.usfirst.frc.team1757.robot;

import edu.wpi.first.wpilibj.GenericHID;


public class Gamepad {
	private final GenericHID controlBackend;
    private float axisInversion;
    private final float DEADZONE;
    
    //Constructor creates an object of itself
    public Gamepad()
    {
    	this(Constants.Gamepad.PORT, Constants.Gamepad.DEADZONE, Constants.Gamepad.INVERTED);
    }
    
    public Gamepad(final int port) {
        this(port, Constants.Gamepad.DEADZONE, Constants.Gamepad.INVERTED); //Constructor without deadzone parameter will default to 0 deadzone
    }
    
    //Proper constructor
    public Gamepad(final int port, final float deadzone, final float inverted) {
        this.controlBackend = new edu.wpi.first.wpilibj.Joystick(port);
        this.axisInversion = inverted;
        this.DEADZONE = deadzone;
    }
    
    
    //Setter method for the stick inversion factor
    public void setInverted(final boolean inverted) {
        if (inverted) {
            axisInversion = -1.0f;
        } else {
            axisInversion = 1.0f;
        }
    }
    
    
    //Get the stick X value
    public double getX() {
        if (Math.abs(controlBackend.getX()) < DEADZONE) {
            return 0.0;
        }
        return controlBackend.getX();
    }
    
    //Get the stick Y value
    public double getY() {
        if (Math.abs(controlBackend.getY()) < DEADZONE) {
            return 0.0;
        }
        return axisInversion * controlBackend.getY();
    }
    
    public double getTwist() {
    	return controlBackend.getTwist();
    }
    
    //Check if button is pressed
    public boolean getButton(final int button) {
        return controlBackend.getRawButton(button);
    }
    
    //Get the axis (trigger) value
    public double getRawAxis(final int axis) {
        return controlBackend.getRawAxis(axis);
    }
    
    
    public boolean getButton_A(){
    	return getButton(Constants.Gamepad.BUTTON_A);
    }
    
    public boolean getButton_B(){
    	return getButton(Constants.Gamepad.BUTTON_B);
    }
    
    public boolean getButton_X(){
    	return getButton(Constants.Gamepad.BUTTON_X);
    }
    
    public boolean getButton_Y(){
    	return getButton(Constants.Gamepad.BUTTON_Y);
    }
    
    public boolean getButton_LB(){
    	return getButton(Constants.Gamepad.BUTTON_LB);
    }
    
    public boolean getButton_RB(){
    	return getButton(Constants.Gamepad.BUTTON_RB);
    }
    
    public boolean getButton_LS(){
    	return getButton(Constants.Gamepad.BUTTON_LS);
    }
    
    public boolean getButton_RS(){
    	return getButton(Constants.Gamepad.BUTTON_RS);
    }
    
    public boolean getTrigger_Right() {
    	if (getRawAxis(Constants.Gamepad.AXIS_RTRIGGER) > 0)
    		return true;
    	else
    		return false;
    }
    
    public boolean getTrigger_Left() {
    	if (getRawAxis(Constants.Gamepad.AXIS_LTRIGGER) < 0)
    		return true;
    	else
    		return false;
    }
    
    
 // Constant variable for the location of the button layout file
 	public static final String FILEPATH = "/RobotButtonLayout.txt";
 	
 	// Array variable for button function for use with gamepad button layout
 	
 	//Load the button layout from SmartDashboard/ .txt File. Note: With albeit limited experimentation, SmartDashboard is not reliable
 	public static String[] BUTTONFUNCTION = Commons.readLines(FILEPATH);
 	
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
    
}