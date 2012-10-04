package org.usfirst.frc.commands;


public class ToggleConveyorReverse extends CommandBase {

	public ToggleConveyorReverse() {
		requires(ballLoaderSubsystem);
	}
	protected void initialize() {
		// TODO Auto-generated method stub

	}

	protected void execute() {
		if (isConveyorOn) {
			ballLoaderSubsystem.stopConveyor();
			isConveyorOn = false;
		}
		else {
			ballLoaderSubsystem.reverseConveyor();
			isConveyorOn = true;
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
