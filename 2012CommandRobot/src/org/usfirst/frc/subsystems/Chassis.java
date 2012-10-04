package org.usfirst.frc.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Joystick;

import org.usfirst.frc.ChassisMap;
import org.usfirst.frc.commands.*;
import edu.wpi.first.wpilibj.Jaguar;

public class Chassis extends Subsystem {

	RobotDrive drive;
	
	protected void initDefaultCommand() {
		setDefaultCommand(new DriveWithJoystick());   // set default command
	}
	public Chassis() {
		drive = new RobotDrive (new Jaguar(ChassisMap.frontLeftMotorSlot, ChassisMap.frontLeftMotorChannel),
				new Jaguar(ChassisMap.frontRightMotorSlot, ChassisMap.frontRightMotorChannel));
		// change constructor if we have more motors on drivetrain - i.e. 4 motors total
		// 
		drive.setSafetyEnabled(false);
	}

	public void straight() {   // sets the motor speeds to drive straight (no turn)
		drive.arcadeDrive(1.0, 0.0);
	}
	public void reverse() {   // sets the motor speeds to drive in reverse (no turn)
		drive.arcadeDrive(-1.0, 0.0);
	}
	public void turnLeft() {    // sets the motor speeds to start a left turn
		drive.arcadeDrive(0.0, 1.0);
	}
	public void turnRight() {    // sets the motor speeds to start a right turn
		drive.arcadeDrive(0.0, -1.0);
	}
	public void driveWithJoystick(Joystick stick) {
		drive.arcadeDrive(stick);
	}

}
