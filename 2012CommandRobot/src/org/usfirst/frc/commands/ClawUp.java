package org.usfirst.frc.commands;

public class ClawUp extends CommandBase {

	public ClawUp () {
		requires (armSubsystem);
	}
	protected void initialize() {
		// TODO Auto-generated method stub

	}

	protected void execute() {
		armSubsystem.clawUp();
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
