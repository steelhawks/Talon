package org.usfirst.frc.commands;

public class Wait extends CommandBase {
	private double m_timeout;
	
	public Wait(double timeout) {
		m_timeout = timeout;
	}
	protected void initialize() {
		setTimeout(m_timeout);
	}

	protected void execute() {
		// do nothing
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
