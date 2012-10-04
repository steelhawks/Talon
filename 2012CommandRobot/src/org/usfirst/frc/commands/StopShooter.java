package org.usfirst.frc.commands;

public class StopShooter extends CommandBase {

	public StopShooter() {
		requires (shootingSubsystem);
	}
	protected void initialize() {
		// TODO Auto-generated method stub

	}

	protected void execute() {
		shootingSubsystem.stopBottom();
		shootingSubsystem.stopTop();
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
