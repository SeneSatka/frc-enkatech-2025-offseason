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

import com.ctre.phoenix6.controls.MotionMagicVoltage;
import com.ctre.phoenix6.hardware.TalonFX;
import frc.robot.Constants.CanIds;
import frc.robot.Constants.Intake.PivotState;
import frc.robot.Constants.Intake.RollerState;

public class IntakeIOReal implements IntakeIO {

  public final TalonFX pivotMotor = new TalonFX(CanIds.IntakePivotMotor, "canivore");
  // TODO: pivot motor configs will add

  public final TalonFX rollerMotor = new TalonFX(CanIds.IntakeRollerMotor, "canivore");
  public final TalonFX centeringMotor = new TalonFX(CanIds.IntakeCenteringMotor, "canivore");
  public RollerState rollerState = RollerState.Off;
  public PivotState pivotState = PivotState.Up;

  public boolean hasCoral() {
    // TODO: read sensor value
    return false;
  }

  public boolean unsafeToGoUp() {
    // TODO: calucate distance of arm and intake pos
    return false;
  }

  @Override
  public void setState(PivotState p, RollerState s) {

  }

  public void periodic() {
    rollerMotor.setVoltage(rollerState.rollingVoltage);
    centeringMotor.setVoltage(rollerState.centeringVoltage);
    pivotMotor.setControl(new MotionMagicVoltage(pivotState.angleSetpoint / (2 * Math.PI)));
  }
}
