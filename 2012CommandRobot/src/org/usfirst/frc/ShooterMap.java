package org.usfirst.frc;

/**
 * The ShooterMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 * 
 * ShooterMap is used with the Shooter subsystem
 */

public class ShooterMap {

	// motors
	public static final int bottomShooterMotorSlot = 1;
	public static final int bottomShooterMotorChannel = 5;
	public static final int topShooterMotorSlot = 1;
	public static final int topShooterMotorChannel = 7;

	// solenoids
	public static final int kickerSolenoidA = 3;
	public static final int kickerSolenoidB = 4;


	// Joystick Button mappings
	// if you switch to another joystick, change mappings here
	// operator
	public static final int kickerBtn = F310ButtonMap.kGamepadButtonB;
	public static final int stopShooterBtn = F310ButtonMap.kGamepadButtonA;
	public static final int startShooterBtn = F310ButtonMap.kGamepadButtonX;
}

