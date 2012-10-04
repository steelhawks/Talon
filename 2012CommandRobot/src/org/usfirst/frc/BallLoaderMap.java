package org.usfirst.frc;

/**
 * The BallLoaderMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 * 
 * BallLoaderMap is used with the BallLoader subsystem
 */

public class BallLoaderMap {

	// motors
	public static final int conveyorMotorSlot = 1;
	public static final int conveyorMotorChannel = 8;
	public static final int feederMotorSlot = 1;
	public static final int feederMotorChannel = 6;

	// Joystick Button mappings
	// if you switch to another joystick, change mappings here
	// F310 buttons
	// operator
	public static final int conveyorBtn = F310ButtonMap.kGamepadButtonShoulderR;
	public static final int conveyorRevBtn = F310ButtonMap.kGamepadButtonShoulderL;

	// driver
	public static final int feederBtn = F310ButtonMap.kGamepadButtonB;
	public static final int feederRevBtn = F310ButtonMap.kGamepadButtonY;
}

