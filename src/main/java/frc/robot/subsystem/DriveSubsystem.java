/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystem;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.RobotMap;
import frc.robot.commands.DriveCommand;

public class DriveSubsystem extends Subsystem{
    
    public Spark leftDriveMotor = new Spark(RobotMap.leftMotorDrivePort);
    public Spark rightDriveMotor = new Spark(RobotMap.rightMotorDrivePort);

    public DifferentialDrive drive = new DifferentialDrive(leftDriveMotor, rightDriveMotor);

    public DriveSubsystem(){
        leftDriveMotor.setInverted(true);
		rightDriveMotor.setInverted(true);
    }

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand (new DriveCommand());
    }

    public void drive(double speed, double rotation){
        drive.arcadeDrive(speed, rotation);
    }

    public void stop(){
        drive.arcadeDrive(0, 0);
    }
}
