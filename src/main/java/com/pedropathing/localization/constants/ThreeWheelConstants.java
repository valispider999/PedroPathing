package com.pedropathing.localization.constants;

import com.pedropathing.localization.Encoder;

/**
 * This is the ThreeWheelConstants class. It holds many constants and parameters for the Three Wheel Localizer.
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

public class ThreeWheelConstants {
    public static double forwardTicksToInches = .001989436789;
    public static double strafeTicksToInches = .001989436789;
    public static double turnTicksToInches = .001989436789;
    public static double leftY = 1;
    public static double rightY = -1;
    public static double strafeX = -2.5;
    public static String leftEncoder_HardwareMapName = "leftFront";
    public static String rightEncoder_HardwareMapName = "rightRear";
    public static String strafeEncoder_HardwareMapName = "rightFront";
    public static double leftEncoderDirection = Encoder.REVERSE;
    public static double rightEncoderDirection = Encoder.REVERSE;
    public static double strafeEncoderDirection = Encoder.FORWARD;
}
