package org.usfirst.frc.commands;

public class StartShooter extends CommandBase {

	public StartShooter() {
		requires (shootingSubsystem);
	}
	protected void initialize() {
		// TODO Auto-generated method stub

	}

	protected void execute() {
		shootingSubsystem.startTop();
		shootingSubsystem.startBottom();
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
