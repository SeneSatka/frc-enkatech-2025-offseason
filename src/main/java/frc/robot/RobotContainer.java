package frc.robot;

import edu.wpi.first.wpilibj.XboxController;
import frc.robot.commands.DriveCommands;
import frc.robot.subsystems.SubSystems;
import frc.robot.subsystems.drive.Drive;

public class RobotContainer {
  public final SubSystems subsystems;
  public final XboxController controller = new XboxController(0);

  public RobotContainer(SubSystems subsystems) {
    this.subsystems = subsystems;
    buttonBindings(subsystems.drive);
  }

  public void buttonBindings(Drive drive) {
    drive.setDefaultCommand(
        DriveCommands.joystickDrive(
            drive,
            () -> -controller.getLeftY(),
            () -> -controller.getLeftX(),
            () -> -controller.getRightX()));
  }
}
