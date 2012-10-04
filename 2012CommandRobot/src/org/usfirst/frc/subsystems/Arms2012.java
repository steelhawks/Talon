package org.usfirst.frc.subsystems;

import org.usfirst.frc.ArmMap;
import org.usfirst.frc.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.Compressor;

public class Arms2012 extends Subsystem {

	private Compressor airCompressor;
	private Solenoid clawSolenoids[] = new Solenoid[2];
	private Solenoid backSolenoids[] = new Solenoid[2];
	
	public Arms2012() {
		airCompressor = new Compressor (RobotMap.compressorPressureSwitchSlot, RobotMap.compressorPressureSwitchChannel,
					RobotMap.compressorRelaySlot, RobotMap.compressorRelayChannel);
		clawSolenoids[0] = new Solenoid(ArmMap.clawSolendoidA);
		clawSolenoids[1] = new Solenoid(ArmMap.clawSolenoidB);
		backSolenoids[0] = new Solenoid(ArmMap.backArmSolenoidA);
		backSolenoids[1] = new Solenoid(ArmMap.backArmSolenoidB);
		
		clawSolenoids[0].set(false);
		clawSolenoids[1].set(true);
		backSolenoids[0].set(false);
		backSolenoids[1].set(true);
		airCompressor.start();
	}
	protected void initDefaultCommand() {
		clawUp();
		backClawUp();
	}
	public void clawUp () {
		clawSolenoids[0].set(false);
		clawSolenoids[1].set(true);
	}
	public void clawDown () {
		backClawUp(); // bring up back arm - cannot have both front and back arms deployed
		Timer.delay(0.5);
		clawSolenoids[0].set(true);
		clawSolenoids[1].set(false);
	}
	public void backClawUp () {
		backSolenoids[0].set(false);
		backSolenoids[1].set(true);
	}
	public void backClawDown () {
		clawUp(); // bring up claw - cannot have both front and back arms deployed
		Timer.delay(0.5);
		backSolenoids[0].set(true);
		backSolenoids[1].set(false);
	}
}
