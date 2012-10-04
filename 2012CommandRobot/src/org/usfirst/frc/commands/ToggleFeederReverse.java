package org.usfirst.frc.commands;


public class ToggleFeederReverse extends CommandBase {

	public ToggleFeederReverse() {
		requires(ballLoaderSubsystem);
	}
	protected void initialize() {
		// TODO Auto-generated method stub

	}

	protected void execute() {
		if (isFeederOn) {
			ballLoaderSubsystem.stopFeeder();
			isFeederOn = false;
		}
		else {
			ballLoaderSubsystem.reverseFeeder();
			isFeederOn = true;
		}
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
