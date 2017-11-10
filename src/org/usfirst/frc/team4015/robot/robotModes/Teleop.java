package org.usfirst.frc.team4015.robot.robotModes;

import org.usfirst.frc.team4015.robot.commands.Drive;
import org.usfirst.frc.team4015.robot.commands.MoveRamp;
//import org.usfirst.frc.team4015.robot.commands.ToggleCompressor;
import org.usfirst.frc.team4015.robot.commands.ClimbRope;
import edu.wpi.first.wpilibj.command.CommandGroup;

/* ===================================================
 * This CommandGroup enables control of the drivetrain,
 * ramp, winch, and compressor during teleop mode.
 * To leave the compressor on automatic control, 
 * remove the line "addParallel(new ToggleCompressor());"
 * =================================================*/

public class Teleop extends CommandGroup
{
	// CONSTRUCTOR //
	
	public  Teleop()
	{	
    	addParallel(new Drive());
    	addParallel(new MoveRamp());
    	addParallel(new ClimbRope());
    	
    }
	
}
