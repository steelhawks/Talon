package org.usfirst.frc.subsystems;

import org.usfirst.frc.BallLoaderMap;
import org.usfirst.frc.Speed;

import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.command.Subsystem;

public class BallLoader2012 extends Subsystem {

	private Jaguar conveyorMotor;
	private Jaguar feederMotor;
	
	public BallLoader2012 () {
		conveyorMotor = new Jaguar (BallLoaderMap.conveyorMotorSlot, BallLoaderMap.conveyorMotorChannel);
		feederMotor = new Jaguar (BallLoaderMap.feederMotorSlot, BallLoaderMap.feederMotorChannel);
	}
	
	protected void initDefaultCommand() {
		startConveyor();
		startFeeder();
	}
	public void startConveyor() {
		conveyorMotor.set(Speed.maxReverse);
	}
	public void stopConveyor() {
		conveyorMotor.set(Speed.stop);
	}
	public void reverseConveyor() {
		conveyorMotor.set(Speed.maxForward);
	}
	public void startFeeder() {
		feederMotor.set(Speed.maxForward);
	}
	public void stopFeeder() {
		feederMotor.set(Speed.stop);
	}
	public void reverseFeeder() {
		feederMotor.set(Speed.maxReverse);
	}
}
