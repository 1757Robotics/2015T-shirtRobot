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
    
}