/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystem;

import edu.wpi.first.wpilibj.Spark;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.MoveWristCommand;

/**
 * Add your docs here.
 */
public class WristSubsystem extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  public Spark wristMotor = new Spark(RobotMap.wristMotorPort); 

  //Moves the wrist motor
  public void moveWristUp(double speed){
    wristMotor.set(speed);
  }

  public void moveWristDown(double speed){
    wristMotor.set(speed);
  }

  public void stop(){
    wristMotor.set(0.0);
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
    setDefaultCommand(new MoveWristCommand());
  }
}
