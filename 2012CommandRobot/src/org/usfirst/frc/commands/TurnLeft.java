package org.usfirst.frc.commands;

public class TurnLeft extends CommandBase {
	private double m_timeout;
	
	public TurnLeft (double timeout) {
		m_timeout = timeout;
		requires(chassis);
	}
	protected void initialize() {
		setTimeout(m_timeout);
	}

	protected void execute() {
		chassis.turnLeft();
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
