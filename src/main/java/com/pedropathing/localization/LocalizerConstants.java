package org.firstinspires.ftc.teamcode.pedroPathing.localization;

import com.acmerobotics.dashboard.config.Config;
import com.qualcomm.hardware.rev.RevHubOrientationOnRobot;
import com.qualcomm.hardware.sparkfun.SparkFunOTOS;

import org.firstinspires.ftc.robotcore.external.navigation.AngleUnit;
import org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit;

/**
 * This is the LocalizerConstants class. It holds many constants and parameters for various parts of
 * the Localizers.
 *
 * The view is from the top of the robot looking downwards.
 *
 * Left on robot is the y positive direction
 * Forward on robot is the x positive direction
 *
 *                         forward (x positive)
 *                                △
 *                                |
 *                                |
 *                         /--------------\
 *                         |              |
 *                         |              |
 *                         | ||        || |
 *  left (y positive) <--- | ||        || |
 *                         |     ____     |
 *                         |     ----     |
 *                         \--------------/
 *

 * @author Baron Henderson - 20077 The Indubitables
 * @version 1.0, 12/24/2024
 */
@Config
public class LocalizerConstants {

    // TODO: Change the Localizer Value to the Localizer you will be using.
    public static final Localizers localizers = Localizers.OTOS;

    public static double forwardTicksToInches = .001989436789;
    public static double strafeTicksToInches = .001989436789;
    public static double turnTicksToInches = .001989436789;

    // Drive Encoders
    public static double DriveEncoders_LeftFrontEncoderDirection = Encoder.REVERSE;
    public static double DriveEncoders_RightFrontEncoderDirection = Encoder.FORWARD;
    public static double DriveEncoders_LeftRearEncoderDirection = Encoder.REVERSE;
    public static double DriveEncoders_RightRearEncoderDirection = Encoder.FORWARD;

    // Two Wheel
    public static double TwoWheel_ForwardY = 1;
    public static double TwoWheel_StrafeX = -2.5;
    public static String TwoWheel_IMU_HardwareMapName = "imu";
    public static String TwoWheel_ForwardEncoder_HardwareMapName = "leftFront";
    public static String TwoWheel_StrafeEncoder_HardwareMapName = "rightRear";
    public static RevHubOrientationOnRobot TwoWheel_IMU_Orientation = new RevHubOrientationOnRobot(RevHubOrientationOnRobot.LogoFacingDirection.UP, RevHubOrientationOnRobot.UsbFacingDirection.LEFT);
    public static double TwoWheel_ForwardEncoderDirection = Encoder.REVERSE;
    public static double TwoWheel_StrafeEncoderDirection = Encoder.FORWARD;

    // Two Wheel + Pinpoint IMU
    public static double TwoWheelPinpointIMU_ForwardY = 1;
    public static double TwoWheelPinpointIMU_StrafeX = -2.5;
    public static String TwoWheelPinpointIMU_Pinpoint_HardwareMapName = "pinpoint";
    public static String TwoWheelPinpointIMU_ForwardEncoder_HardwareMapName = "leftFront";
    public static String TwoWheelPinpointIMU_StrafeEncoder_HardwareMapName = "rightRear";
    public static double TwoWheelPinpointIMU_ForwardEncoderDirection = Encoder.REVERSE;
    public static double TwoWheelPinpointIMU_StrafeEncoderDirection = Encoder.FORWARD;

    // Pinpoint
    public static double Pinpoint_ForwardY = 1;
    public static double Pinpoint_StrafeX = -2.5;
    public static DistanceUnit Pinpoint_DistanceUnit = DistanceUnit.INCH;
    public static String Pinpoint_HardwareMapName = "pinpoint";
    public static double Pinpoint_YawScalar = 1.0;
    public static boolean Pinpoint_EncoderResolutionCustom = false;
    public static GoBildaPinpointDriver.GoBildaOdometryPods Pinpoint_EncoderResolution = GoBildaPinpointDriver.GoBildaOdometryPods.goBILDA_4_BAR_POD;
    public static double Pinpoint_CustomEncoderResolution = 13.26291192;
    public static GoBildaPinpointDriver.EncoderDirection Pinpoint_ForwardEncoderDirection = GoBildaPinpointDriver.EncoderDirection.REVERSED;
    public static GoBildaPinpointDriver.EncoderDirection Pinpoint_StrafeEncoderDirection = GoBildaPinpointDriver.EncoderDirection.FORWARD;

    // Three Wheel
    public static double ThreeWheel_LeftY = 1;
    public static double ThreeWheel_RightY = -1;
    public static double ThreeWheel_StrafeX = -2.5;
    public static String ThreeWheel_LeftEncoder_HardwareMapName = "leftFront";
    public static String ThreeWheel_RightEncoder_HardwareMapName = "rightRear";
    public static String ThreeWheel_StrafeEncoder_HardwareMapName = "rightFront";
    public static double ThreeWheel_LeftEncoderDirection = Encoder.REVERSE;
    public static double ThreeWheel_RightEncoderDirection = Encoder.REVERSE;
    public static double ThreeWheel_StrafeEncoderDirection = Encoder.FORWARD;

    // Three Wheel + IMU
    public static double ThreeWheelIMU_LeftY = 1;
    public static double ThreeWheelIMU_RightY = -1;
    public static double ThreeWheelIMU_StrafeX = -2.5;
    public static String ThreeWheelIMU_IMU_HardwareMapName = "imu";
    public static String ThreeWheelIMU_LeftEncoder_HardwareMapName = "leftFront";
    public static String ThreeWheelIMU_RightEncoder_HardwareMapName = "rightRear";
    public static String ThreeWheelIMU_StrafeEncoder_HardwareMapName = "rightFront";
    public static RevHubOrientationOnRobot ThreeWheelIMU_IMU_Orientation = new RevHubOrientationOnRobot(RevHubOrientationOnRobot.LogoFacingDirection.UP, RevHubOrientationOnRobot.UsbFacingDirection.LEFT);
    public static double ThreeWheelIMU_LeftEncoderDirection = Encoder.REVERSE;
    public static double ThreeWheelIMU_RightEncoderDirection = Encoder.REVERSE;
    public static double ThreeWheelIMU_StrafeEncoderDirection = Encoder.FORWARD;

    // OTOS
    public static final String OTOS_HardwareMapName = "sensor_otos";
    public static final DistanceUnit OTOS_LinearUnit = DistanceUnit.INCH;
    public static final AngleUnit OTOS_AngleUnit = AngleUnit.RADIANS;
    public static final SparkFunOTOS.Pose2D OTOS_Offset = new SparkFunOTOS.Pose2D(0, 0, Math.PI / 2);
    public static final double OTOS_LinearScalar = 1.0;
    public static final double OTOS_AngularScalar = 1.0;
}
