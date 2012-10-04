package org.usfirst.frc.commands;

public class TurnRight extends CommandBase {
	private double m_timeout;
	
	public TurnRight (double timeout) {
		m_timeout = timeout;
		requires (chassis);
	}
	protected void initialize() {
		setTimeout(m_timeout);
	}

	protected void execute() {
		chassis.turnRight();
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
