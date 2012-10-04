
package org.usfirst.frc;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import org.usfirst.frc.commands.*;

public class OI {
	// Process operator interface input here.
	public static final int DRIVER_JOYSTICK_PORT = 1;
	public static final int OPERATOR_JOYSTICK_PORT = 2;
	private Joystick driverStick;
	private Joystick operatorStick;
	
	private JoystickButton conveyorToggle;
	private JoystickButton conveyorRevToggle;
	private JoystickButton feederToggle;
	private JoystickButton feederRevToggle;
	private JoystickButton clawUp;
	private JoystickButton clawDown;
	private JoystickButton backClawUp;
	private JoystickButton backClawDown;
	private JoystickButton kicker;
	private JoystickButton startShooter;
	private JoystickButton stopShooter;
	
	
	public OI() {
		driverStick = new Joystick(DRIVER_JOYSTICK_PORT);
		operatorStick = new Joystick(OPERATOR_JOYSTICK_PORT);
		
		// button callback setup
		conveyorToggle = new JoystickButton(operatorStick, BallLoaderMap.conveyorBtn);
		conveyorToggle.whenPressed(new ToggleConveyor());
		conveyorRevToggle = new JoystickButton(operatorStick, BallLoaderMap.conveyorRevBtn);
		conveyorRevToggle.whenPressed(new ToggleConveyorReverse());
		feederToggle = new JoystickButton(driverStick, BallLoaderMap.feederBtn);
		feederToggle.whenPressed(new ToggleFeeder());
		feederRevToggle = new JoystickButton(driverStick, BallLoaderMap.feederRevBtn);
		feederRevToggle.whenPressed(new ToggleFeederReverse());
		clawUp = new JoystickButton (driverStick, ArmMap.clawUpBtn);
		clawUp.whenPressed(new ClawUp());
		clawDown = new JoystickButton (driverStick, ArmMap.clawDownBtn);
		clawDown.whenPressed(new ClawDown());
		backClawUp = new JoystickButton (driverStick, ArmMap.backArmUpBtn);
		backClawUp.whenPressed(new BackClawUp());
		backClawDown = new JoystickButton (driverStick, ArmMap.backArmDownBtn);
		backClawDown.whenPressed(new BackClawDown());
		kicker = new JoystickButton (operatorStick, ShooterMap.kickerBtn);
		kicker.whenPressed(new Kick());
		startShooter = new JoystickButton (operatorStick, ShooterMap.startShooterBtn);
		startShooter.whenPressed(new StartShooter());
		stopShooter = new JoystickButton (operatorStick, ShooterMap.stopShooterBtn);
		stopShooter.whenPressed(new StopShooter());
		
	}
	public Joystick getDriverJoystick() {
		return driverStick;
	}
	public Joystick getOperatorJoystick() {
		return operatorStick;
	}
}

