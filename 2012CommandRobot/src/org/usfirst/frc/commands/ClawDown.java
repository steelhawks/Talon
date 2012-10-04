package org.usfirst.frc.commands;

public class ClawDown extends CommandBase {

	public ClawDown() {
		requires (armSubsystem);
	}
	protected void initialize() {
		// TODO Auto-generated method stub

	}

	protected void execute() {
		armSubsystem.clawDown();
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
