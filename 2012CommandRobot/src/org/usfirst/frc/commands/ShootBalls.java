package org.usfirst.frc.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class ShootBalls extends CommandGroup {

	public ShootBalls() {
		addSequential(new Wait(4));
		addSequential(new Kick());
		addSequential(new Wait(2));
		addSequential(new Kick());
	}
	
}
