package org.usfirst.frc.commands;

public class DriveReverse extends CommandBase {
	private double m_timeout;
	
	public DriveReverse (double timeout) {
		m_timeout = timeout;
		requires (chassis);
	}
	protected void initialize() {
		setTimeout (m_timeout);
	}

	protected void execute() {
		chassis.reverse();
	}

	protected boolean isFinished() {
		return isTimedOut();
	}

	protected void end() {
		// TODO Auto-generated method stub

	}

	protected void interrupted() {
		// TODO Auto-generated method stub

	}

}
