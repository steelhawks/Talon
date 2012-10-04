package org.usfirst.frc.commands;

public class ToggleFeeder extends CommandBase {

	public ToggleFeeder() {
		requires(ballLoaderSubsystem);
	}
	protected void initialize() {
		// TODO Auto-generated method stub

	}

	protected void execute() {
		if (isFeederOn) {
			ballLoaderSubsystem.startFeeder();
			isFeederOn = false;
		}
		else {
			ballLoaderSubsystem.startFeeder();
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
