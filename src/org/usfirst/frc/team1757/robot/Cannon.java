package org.usfirst.frc.team1757.robot;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.AnalogPotentiometer;
import edu.wpi.first.wpilibj.interfaces.Potentiometer;
import edu.wpi.first.wpilibj.Timer;

/** 
 * @author Loading
 *
 *Class defines all elements related to the cannon
 *
 *
 */

public class Cannon {
    
    private volatile boolean firing = false;
    private volatile boolean disabled = false;
    private volatile float forkAngle = 45.0f;

    private final DoubleSolenoid sprinkler = new DoubleSolenoid(1, 2);
    private final DigitalInput stopSwitch = new DigitalInput(1);
    private final Potentiometer stringPot = new AnalogPotentiometer(2);
    
    private final Timer reloadTimer = new Timer();
    private final Timer chargeTimer = new Timer();
    
    private volatile int shotsFired = 0;

    private Cannon() {};
    
    public static Cannon getInstance() {
        return new Cannon();
    }
    
    public int getShotCount() {
        return shotsFired;
    }
    
    public void resetShotCount() {
        shotsFired = 0;
    }

    public void Cannon_Tilt(String direction) {
        final float speed = Constants.Cannon.TILT_SPEED;
        
    }

    public void fire() {
    	// Complete firing process: report pressure, release sprinkler valve. 
    	//Wherever this is called should also call the compressor charge method (which has its own timer) and after the reload method
    	firing = true;
    	
    	
    	firing = false;
    	reloadTimer.start();
    	chargeTimer.start();
    	//Begin the reload cycle
    	//Enable compressors
    	++shotsFired;
    }

    public double getPotVoltage() {
        return 0;
    }

    public boolean isFiring() {
        return firing;
    }
}