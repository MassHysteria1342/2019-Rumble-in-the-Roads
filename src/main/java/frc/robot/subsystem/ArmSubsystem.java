package frc.robot.subsystem;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;
//import frc.robot.subsystems.Spark;
import frc.robot.RobotMap;
import frc.robot.commands.MoveArmCommand;

public class ArmSubsystem extends Subsystem {
	
	public Talon armMotor = new Talon(RobotMap.mainArmMotorPort);
	
	//public AnalogPotentiometer armPot = new AnalogPotentiometer(RobotMap.armPotPort);
	// Put methods for controlling this subsystem
	// here. Call these from Commands.
	public ArmSubsystem(){
		armMotor.setInverted(true);
	}

	public void initDefaultCommand() {
		setDefaultCommand(new MoveArmCommand());
		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());
	}

	public void moveArm(double speed){
		armMotor.set(speed);
	}

	public void stopArm(){
		armMotor.set(0.0);
	}
}