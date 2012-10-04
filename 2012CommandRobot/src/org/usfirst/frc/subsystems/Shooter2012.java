package org.usfirst.frc.subsystems;

import org.usfirst.frc.ShooterMap;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.Timer;

import org.usfirst.frc.Speed;
import edu.wpi.first.wpilibj.Solenoid;

public class Shooter2012 extends Subsystem {

	private Jaguar topMotor;
	private Jaguar bottomMotor;
	private Solenoid kicker[] = new Solenoid[2];
	
	public Shooter2012 () {
		topMotor = new Jaguar(ShooterMap.topShooterMotorSlot, ShooterMap.topShooterMotorChannel);
		bottomMotor = new Jaguar (ShooterMap.bottomShooterMotorSlot, ShooterMap.bottomShooterMotorChannel);
		
		kicker[0] = new Solenoid(ShooterMap.kickerSolenoidA);
		kicker[1] = new Solenoid(ShooterMap.kickerSolenoidB);
	}
	protected void initDefaultCommand() {
		startTop();
		startBottom();
		resetKicker();
	}
	public void stopTop() {
		topMotor.set(Speed.stop);
	}
	public void startTop() {
		topMotor.set(Speed.defaultTopShooter);
	}
	public void stopBottom() {
		bottomMotor.set(Speed.stop);
	}
	public void startBottom() {
		bottomMotor.set(Speed.defaultBottomShooter);
	}
	public void kick() {
		kicker[0].set(true);
		kicker[1].set(false);
		
		Timer.delay(0.25);
		resetKicker();
	}
	public void resetKicker() {
		kicker[0].set(false);
		kicker[1].set(true);
	}
}
