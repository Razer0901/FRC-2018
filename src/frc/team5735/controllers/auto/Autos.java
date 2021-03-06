package frc.team5735.controllers.auto;

import frc.team5735.constants.TrajectoryConstants;
import frc.team5735.controllers.motionprofiling.Trajectory;
import frc.team5735.subsystems.Drivetrain;
import frc.team5735.subsystems.Elevator;
import frc.team5735.subsystems.ElevatorIntake;
import frc.team5735.subsystems.Wrist;
import frc.team5735.utils.units.Degrees;
import frc.team5735.utils.units.Inches;
import static frc.team5735.constants.PositionConstants.*;

public class Autos {

    // Center   = 9ft from right
    // Right    = 5ft from right
    // Left     = 5ft from left

    public static AutoCommand[][] moveForward = {
            {
                    new AutoCommand(ElevatorIntake.getInstance(), true)
            },
            {
                    new AutoCommand(Drivetrain.getInstance(), TrajectoryConstants.centerToRightSwitch),
                    new AutoCommand(Wrist.getInstance(), new Degrees(WRIST_FLAT)),
                    new AutoCommand(Elevator.getInstance(), new Inches(ELEVATOR_SWITCH))
            },
    };

    public static AutoCommand[][] centerToLeftSwitch = {
            {
                    new AutoCommand(ElevatorIntake.getInstance(), true)
            },
            {
                    new AutoCommand(Drivetrain.getInstance(), TrajectoryConstants.centerToLeftSwitch),
                    new AutoCommand(Wrist.getInstance(), new Degrees(WRIST_FLAT)),
                    new AutoCommand(Elevator.getInstance(), new Inches(ELEVATOR_SWITCH))
            },
            {
                    new AutoCommand(ElevatorIntake.getInstance(), INTAKE_EJECT_VALUE)
            },
            {
                    new AutoCommand(null, INTAKE_DELAY_VALUE)     //1000
            },
            {
                    new AutoCommand(ElevatorIntake.getInstance(), INTAKE_STOP_VALUE)
            }
    };

    public static AutoCommand[][] centerToRightSwitch = {
            {
                    new AutoCommand(ElevatorIntake.getInstance(), true)
            },
            {
                    new AutoCommand(Drivetrain.getInstance(), TrajectoryConstants.centerToRightSwitch),
                    new AutoCommand(Wrist.getInstance(), new Degrees(WRIST_FLAT)),
                    new AutoCommand(Elevator.getInstance(), new Inches(ELEVATOR_SWITCH))
            },
            {
                    new AutoCommand(ElevatorIntake.getInstance(), INTAKE_EJECT_VALUE)
            },
            {
                    new AutoCommand(null, INTAKE_DELAY_VALUE)  //1000
            },
            {
                    new AutoCommand(ElevatorIntake.getInstance(), INTAKE_STOP_VALUE)
            }
    };

    public static AutoCommand[][] rightToRightSwitch = {
            {
                    new AutoCommand(ElevatorIntake.getInstance(), true)
            },
            {
                    new AutoCommand(Drivetrain.getInstance(), TrajectoryConstants.sideToSwitch),
                    new AutoCommand(Wrist.getInstance(), new Degrees(WRIST_FLAT)),
                    new AutoCommand(Elevator.getInstance(), new Inches(ELEVATOR_SWITCH))
            },
            {
                    new AutoCommand(ElevatorIntake.getInstance(), INTAKE_EJECT_VALUE)
            },
            {
                    new AutoCommand(null, INTAKE_DELAY_VALUE)  //1000
            },
            {
                    new AutoCommand(ElevatorIntake.getInstance(), INTAKE_STOP_VALUE)
            }
    };

    public static AutoCommand[][] leftToLeftSwitch = {
            {
                    new AutoCommand(ElevatorIntake.getInstance(), true)
            },
            {
                    new AutoCommand(Drivetrain.getInstance(), Trajectory.swapSides(TrajectoryConstants.sideToSwitch)),
                    new AutoCommand(Wrist.getInstance(), new Degrees(WRIST_FLAT)),
                    new AutoCommand(Elevator.getInstance(), new Inches(ELEVATOR_SWITCH))
            },
            {
                    new AutoCommand(ElevatorIntake.getInstance(), INTAKE_EJECT_VALUE)
            },
            {
                    new AutoCommand(null, INTAKE_DELAY_VALUE)  //1000
            },
            {
                    new AutoCommand(ElevatorIntake.getInstance(), INTAKE_STOP_VALUE)
            }
    };

    public static AutoCommand[][] rightToRightScale = {
            {
                    new AutoCommand(ElevatorIntake.getInstance(), true)
            },
            {
                    new AutoCommand(Drivetrain.getInstance(), TrajectoryConstants.sideToScale),
                    new AutoCommand(Wrist.getInstance(), new Degrees(WRIST_FLAT)),
                    new AutoCommand(Elevator.getInstance(), new Inches(ELEVATOR_SCALE))
            },
            {
                    new AutoCommand(ElevatorIntake.getInstance(), INTAKE_EJECT_VALUE)
            },
            {
                    new AutoCommand(null, INTAKE_DELAY_VALUE)
            },
            {
                    new AutoCommand(ElevatorIntake.getInstance(), INTAKE_STOP_VALUE),
                    new AutoCommand(Drivetrain.getInstance(), Trajectory.reverse(TrajectoryConstants.shortPath)),
                    new AutoCommand(Wrist.getInstance(), new Degrees(WRIST_INTAKE)),
                    new AutoCommand(Elevator.getInstance(), new Inches(ELEVATOR_INTAKE))
            }
    };

    public static AutoCommand[][] leftToLeftScale = {
            {
                    new AutoCommand(ElevatorIntake.getInstance(), true)
            },
            {
                    new AutoCommand(Drivetrain.getInstance(), Trajectory.swapSides(TrajectoryConstants.sideToScale)),
                    new AutoCommand(Wrist.getInstance(), new Degrees(WRIST_FLAT)),
                    new AutoCommand(Elevator.getInstance(), new Inches(ELEVATOR_SCALE))
            },
//            {
//            		new AutoCommand(Wrist.getInstance(), new Degrees(WRIST_SCALE))
//            },
            {
                    new AutoCommand(ElevatorIntake.getInstance(), INTAKE_EJECT_VALUE)
            },
            {
                    new AutoCommand(null, INTAKE_DELAY_VALUE)
            },
            {
                    new AutoCommand(ElevatorIntake.getInstance(), INTAKE_STOP_VALUE),
                    new AutoCommand(Drivetrain.getInstance(), Trajectory.reverse(TrajectoryConstants.shortPath)),
                    new AutoCommand(Wrist.getInstance(), new Degrees(WRIST_INTAKE)),
                    new AutoCommand(Elevator.getInstance(), new Inches(ELEVATOR_INTAKE))
            }
    };

    //TWO CUBE
    public static AutoCommand[][] leftSwitchTwoCube = {
            {
                    new AutoCommand(Drivetrain.getInstance(), Trajectory.swapSides(Trajectory.reverse(TrajectoryConstants.switchBackupToSwitch))),
                    new AutoCommand(Wrist.getInstance(), new Degrees(WRIST_INTAKE)),
                    new AutoCommand(Elevator.getInstance(), new Inches(ELEVATOR_INTAKE))
            },
            {
                    new AutoCommand(Drivetrain.getInstance(), Trajectory.swapSides(TrajectoryConstants.switchBackupToCube)),
                    new AutoCommand(ElevatorIntake.getInstance(), false),
                    new AutoCommand(ElevatorIntake.getInstance(), INTAKE_INTAKE_VALUE)
            },
            {
                    new AutoCommand(null, 250)
            },
            {
                    new AutoCommand(Drivetrain.getInstance(), Trajectory.swapSides(Trajectory.reverse(TrajectoryConstants.switchBackupToCube))),
                    new AutoCommand(ElevatorIntake.getInstance(), true)
            },
            {
                    new AutoCommand(Drivetrain.getInstance(), Trajectory.swapSides(TrajectoryConstants.switchBackupToSwitch)),
                    new AutoCommand(Wrist.getInstance(), new Degrees(WRIST_FLAT)),
                    new AutoCommand(Elevator.getInstance(), new Inches(ELEVATOR_SWITCH))
            },
            {
                    new AutoCommand(ElevatorIntake.getInstance(), INTAKE_EJECT_VALUE)
            },
            {
                    new AutoCommand(null, INTAKE_DELAY_VALUE)
            },
            {
                    new AutoCommand(ElevatorIntake.getInstance(), INTAKE_STOP_VALUE),
                    new AutoCommand(Drivetrain.getInstance(), Trajectory.reverse(TrajectoryConstants.shortPath)),
                    new AutoCommand(Wrist.getInstance(), new Degrees(WRIST_INTAKE)),
                    new AutoCommand(Elevator.getInstance(), new Inches(ELEVATOR_INTAKE))
            }
    };

    public static AutoCommand[][] rightSwitchTwoCube = {
            {
                    new AutoCommand(Drivetrain.getInstance(), Trajectory.reverse(TrajectoryConstants.switchBackupToSwitch)),
                    new AutoCommand(Wrist.getInstance(), new Degrees(WRIST_INTAKE)),
                    new AutoCommand(Elevator.getInstance(), new Inches(ELEVATOR_INTAKE))
            },
            {
                    new AutoCommand(Drivetrain.getInstance(), TrajectoryConstants.switchBackupToCube),
                    new AutoCommand(ElevatorIntake.getInstance(), false),
                    new AutoCommand(ElevatorIntake.getInstance(), INTAKE_INTAKE_VALUE)
            },
            {
                    new AutoCommand(Drivetrain.getInstance(), Trajectory.reverse(TrajectoryConstants.switchBackupToCube)),
                    new AutoCommand(ElevatorIntake.getInstance(), true),
                    new AutoCommand(Elevator.getInstance(), new Inches(ELEVATOR_SWITCH))
            },
            {
                new AutoCommand(Wrist.getInstance(), new Degrees(WRIST_FLAT)),

            	new AutoCommand(Drivetrain.getInstance(), TrajectoryConstants.switchBackupToSwitch),
            },
            {
                    new AutoCommand(ElevatorIntake.getInstance(), INTAKE_EJECT_VALUE)
            },
            {
                    new AutoCommand(null, INTAKE_DELAY_VALUE)
            },
            {
                    new AutoCommand(ElevatorIntake.getInstance(), INTAKE_STOP_VALUE),
                    new AutoCommand(Drivetrain.getInstance(), Trajectory.reverse(TrajectoryConstants.shortPath)),
                    new AutoCommand(Wrist.getInstance(), new Degrees(WRIST_INTAKE)),
                    new AutoCommand(Elevator.getInstance(), new Inches(ELEVATOR_INTAKE))
            }
    };

    // ======= TESTING CODE =======
    public static AutoCommand[][] gyroTest = {
            {
                new AutoCommand(Drivetrain.getInstance(), new Degrees(180))
            }
    };

//    public static AutoCommand[][] newTwoCube = {
//            {
//                    new AutoCommand(ElevatorIntake.getInstance(), true)
//            },
//            {
//                    new AutoCommand(Drivetrain.getInstance(), new Trajectory("rightToRightScale")),
//                    new AutoCommand(Wrist.getInstance(), new Degrees(WRIST_FLAT)),
//                    new AutoCommand(Elevator.getInstance(), new Inches(ELEVATOR_SCALE))
//            },
//            {
//                    new AutoCommand(ElevatorIntake.getInstance(), INTAKE_EJECT_VALUE)
//            },
//            {
//                    new AutoCommand(null, INTAKE_DELAY_VALUE)
//            },
//            {
//                    new AutoCommand(ElevatorIntake.getInstance(), INTAKE_STOP_VALUE),
//                    new AutoCommand(Drivetrain.getInstance(), new Trajectory("rightSBackupToScale",true)),
//                    new AutoCommand(Wrist.getInstance(), new Degrees(WRIST_INTAKE)),
//                    new AutoCommand(Elevator.getInstance(), new Inches(ELEVATOR_INTAKE))
//            },
//            {
//                    new AutoCommand(Drivetrain.getInstance(), new Trajectory("rightSBackupToCube")),
//                    new AutoCommand(ElevatorIntake.getInstance(), false),
//                    new AutoCommand(ElevatorIntake.getInstance(), INTAKE_INTAKE_VALUE)
//            },
//            {
//                    new AutoCommand(ElevatorIntake.getInstance(), true),
//                    new AutoCommand(Wrist.getInstance(), new Degrees(WRIST_FLAT)),
//                    new AutoCommand(Elevator.getInstance(), new Inches(ELEVATOR_SWITCH)),
//                    new AutoCommand(Drivetrain.getInstance(), new Trajectory("short"))
//            },
//            {
//                    new AutoCommand(ElevatorIntake.getInstance(), INTAKE_EJECT_VALUE)
//            },
//            {
//                    new AutoCommand(null, INTAKE_DELAY_VALUE)
//            },
//            {
//                    new AutoCommand(null, INTAKE_STOP_VALUE)
//            }
//    };
//
//    public static AutoCommand[][] twoCube = {
//            {
//                    new AutoCommand(ElevatorIntake.getInstance(), true)
//            },
//            {
//                    new AutoCommand(Drivetrain.getInstance(), new Trajectory("rightToRightScale")),
//                    new AutoCommand(Wrist.getInstance(), new Degrees(WRIST_FLAT)),
//                    new AutoCommand(Elevator.getInstance(), new Inches(ELEVATOR_SCALE))
//            },
//            {
//                    new AutoCommand(ElevatorIntake.getInstance(), INTAKE_EJECT_VALUE)
//            },
//            {
//                    new AutoCommand(null, 100)
//            },
//            {
//                    new AutoCommand(ElevatorIntake.getInstance(), 0.)
//            },
//            {
//                    new AutoCommand(Elevator.getInstance(), new Inches(ELEVATOR_INTAKE)),
//                    new AutoCommand(Drivetrain.getInstance(), new Degrees(125-37))
//            },
//            {
//                    new AutoCommand(Wrist.getInstance(), new Degrees(WRIST_INTAKE)),
//                    new AutoCommand(ElevatorIntake.getInstance(), INTAKE_INTAKE_VALUE),
//                    new AutoCommand(Drivetrain.getInstance(), new Trajectory("rightScaleToRightSwitch")),
//            },
//            {
//                    new AutoCommand(ElevatorIntake.getInstance(), true)
//            },
//            {
//                    new AutoCommand(Wrist.getInstance(), new Degrees(WRIST_FLAT)),
//                    new AutoCommand(Elevator.getInstance(), new Inches(ELEVATOR_SWITCH))
//            },
//            {
//                    new AutoCommand(ElevatorIntake.getInstance(), INTAKE_EJECT_VALUE)
//            },
//            {
//                    new AutoCommand(null, 500)
//            },
//            {
//                    new AutoCommand(ElevatorIntake.getInstance(), 0.)
//            }
//    };
}
