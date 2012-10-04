package org.usfirst.frc;

/**
 * The ChassisMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class ChassisMap {
	// for Chassis Subsystem
	public static final int frontLeftMotorSlot = 1;
	public static final int frontLeftMotorChannel = 4;
	public static final int frontRightMotorSlot = 1;
	public static final int frontRightMotorChannel = 3;
	/* to be used if have 4 motors in the drivetrain
	public static final int rearLeftMotorSlot = 0;
	public static final int rearLeftMotorChannel = 0;
	public static final int rearRightMotorSlot = 0;
	public static final int rearRightMotorChannel = 0;
    */

}
