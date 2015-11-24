package org.usfirst.frc.team1757.robot;

public final class Constants {
    
    // Makes this class uninstantiable
    private Constants(){}

    /** 
     * INCOMPLETE: append for hardware implementation
     * 
     * Structure: hardware elements are organized by class, values are public members. Classes should be uninstantiatable
     * 
     * Purpose: list of all constants for use throughout project
     * */
    public static final class CAN_ {
    	private CAN_(){};
    	
    	public static final int 
    	FRONTLEFT = 0, FRONTRIGHT = 1, BACKLEFT = 2, BACKRIGHT = 3, CANNON = 4;
    }
    
    public static final class PCM_ {
    	private PCM_(){};
    	
    	public static final int 
    	SOLENOID_TANKSELECT = 1, SOLENOID_PISTON_CANNON_SEAL = 2, SOLENOID_PISTON_CANNON_CANISTER = 3,
    	SOLENOID_SPRINKLERVALVE = 5;
    	
    }
    
    public static final class AIO_{
    	private AIO_(){};
    	
    	public static final int 
    	GYRO = 0;
    }
    
    public static final class DIO_{
    	private DIO_(){};
    	
    	public static final int 
    	PRESSUREGAUGELOW = 0, PRESSUREGAUGEHIGH = 0;
    }
    
    public static final class PWM_ {
    	public static final int
    	COMPRESSOR_CANNON = 0, COMPRESSOR_SOLENOID = 1; 
    }
    
    public static final class Gamepad {
        private Gamepad(){}
        public static final int PORT = 1;
        public static final float DEADZONE = 0.08f;
        public static final float INVERTED = 0.0f;

    	// Constant variables for the button codes on the F310 gamepad
    	public static final int 
    	BUTTON_A = 1, BUTTON_B = 2, BUTTON_X = 3,
    	BUTTON_Y = 4, BUTTON_LB = 5, BUTTON_RB = 6,
    	BUTTON_BACK = 7, BUTTON_START = 8, BUTTON_LS = 9, 
    	BUTTON_RS = 10, AXIS_RTRIGGER = 3, AXIS_LTRIGGER = 3;
    	
    	/**
    	 * Analog (raw)Axis codes
    	 * Left Stick Up/Dn = 2 Axis (Dn+)
    	 * Left Stick L/R = Axis 1 (L-)
    	 * Right Stick Up/Dn = Axis 5 (Dn+)
    	 * Right Stick L/R = Axis 4 (L-)
    	 * Left Trigger = Axis 3 (+)
    	 * Right Trigger = Axis 3 (-)
    	 * Gamepad Up = Axis 2(-)
    	 * Gamepad Dn = Axis 2(+)Gamepad L = Axis 6(-)
    	 * Gamepad R = Axis 6(+)
    	 * 
    	 * NOTE: Mode switch changes Axis 2 between Left Stick Up/Dn and Gamepad Up/Dn 
	*/
    }
    
    public static final class FlightStick {
        private FlightStick(){}
        public static final int PORT = 2;
        public static final float DEADZONE = 0.08f;
    }
    
    public static final class FlightStick2 {
        private FlightStick2(){}
        public static final int PORT = 3;
        public static final float DEADZONE = 0.08f;
    }
    
    public static final class Cannon {
        private Cannon(){}
        //In the case that a potentiometer is implemented on the cannon for angle measurement, use these values
        
        public static final float TILT_SPEED = 0.75f;
        
        public static final int INTAKE = 0;
        public static final int SHOOTING = 0;
        public static final int START = 0;
    }
    
}