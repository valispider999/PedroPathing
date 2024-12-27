package com.pedropathing.localization.constants;

import com.pedropathing.localization.Encoder;
import com.qualcomm.hardware.rev.RevHubOrientationOnRobot;

/**
 * This is the ThreeWheelIMUConstants class. It holds many constants and parameters for the Three Wheel + IMU Localizer.
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

public class ThreeWheelIMUConstants {
    public static double forwardTicksToInches = .001989436789;
    public static double strafeTicksToInches = .001989436789;
    public static double turnTicksToInches = .001989436789;
    public static double leftY = 1;
    public static double rightY = -1;
    public static double strafeX = -2.5;
    public static String IMU_HardwareMapName = "imu";
    public static String leftEncoder_HardwareMapName = "leftFront";
    public static String rightEncoder_HardwareMapName = "rightRear";
    public static String strafeEncoder_HardwareMapName = "rightFront";
    public static RevHubOrientationOnRobot IMU_Orientation = new RevHubOrientationOnRobot(RevHubOrientationOnRobot.LogoFacingDirection.UP, RevHubOrientationOnRobot.UsbFacingDirection.LEFT);
    public static double leftEncoderDirection = Encoder.REVERSE;
    public static double rightEncoderDirection = Encoder.REVERSE;
    public static double strafeEncoderDirection = Encoder.FORWARD;

}
