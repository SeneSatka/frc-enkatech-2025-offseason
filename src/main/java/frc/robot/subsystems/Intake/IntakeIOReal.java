// Copyright 2025-2026 FRC 6985
// https://www.enkatech6985.com/
//
// This program is free software; you can redistribute it and/or
// modify it under the terms of the GNU General Public License
// version 3 as published by the Free Software Foundation or
// available in the root directory of this project.
//
// This program is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
// GNU General Public License for more details.
package frc.robot.subsystems.Intake;

import com.ctre.phoenix6.hardware.TalonFX;
import frc.robot.Constants.CanIds;

public class IntakeIOReal implements IntakeIO {
  public final TalonFX pivotMotor = new TalonFX(CanIds.IntakePivotMotor, "canivore");
  public final TalonFX rollerMotor = new TalonFX(CanIds.IntakeRollerMotor, "canivore");
  public final TalonFX centeringMotor = new TalonFX(CanIds.IntakeCenteringMotor, "canivore");

  @Override
  public void periodic() {}
}
