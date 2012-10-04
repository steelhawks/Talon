package org.usfirst.frc.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import org.usfirst.frc.OI;
import org.usfirst.frc.subsystems.*;
/**
 * The base for all commands. All atomic commands should subclass CommandBase.
 * CommandBase stores creates and stores each control system. To access a
 * subsystem elsewhere in your code in your code use CommandBase.exampleSubsystem
 * @author Author
 */
public abstract class CommandBase extends Command {

    public static OI oi;
    // Create a single static instance of all of your subsystems
    public static Chassis chassis = new Chassis();
    public static Arms2012 armSubsystem = new Arms2012();
    public static Shooter2012 shootingSubsystem = new Shooter2012();
    public static BallLoader2012 ballLoaderSubsystem = new BallLoader2012();
    public static ExampleSubsystem exampleSubsystem = new ExampleSubsystem();

    public static boolean isConveyorOn = false;
    public static boolean isFeederOn = false;
     
    public static void init() {
        // This MUST be here. If the OI creates Commands (which it very likely
        // will), constructing it during the construction of CommandBase (from
        // which commands extend), subsystems are not guaranteed to be
        // yet. Thus, their requires() statements may grab null pointers. Bad
        // news. Don't move it.
        oi = new OI();

        // Show what command your subsystem is running on the SmartDashboard
        SmartDashboard.putData(exampleSubsystem);
        SmartDashboard.putData(chassis);
        SmartDashboard.putData(shootingSubsystem);
        SmartDashboard.putData(ballLoaderSubsystem);
        SmartDashboard.putData(armSubsystem);
    }

    public CommandBase(String name) {
        super(name);
    }

    public CommandBase() {
        super();
    }
}
