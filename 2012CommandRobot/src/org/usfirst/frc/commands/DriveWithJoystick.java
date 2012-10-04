package org.usfirst.frc.commands;

public class DriveWithJoystick extends CommandBase {
	public DriveWithJoystick() {
        requires(chassis);  // reserve the chassis subsystem
    }
	
	protected void initialize() {
		// TODO Auto-generated method stub

	}

	protected void execute() {
		chassis.driveWithJoystick(oi.getDriverJoystick());
	}

	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

	protected void end() {
		// TODO Auto-generated method stub

	}

	protected void interrupted() {
		// TODO Auto-generated method stub

	}

}
