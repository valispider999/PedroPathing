package com.pedropathing.localization.constants;

import com.pedropathing.localization.Encoder;

/**
 * This is the DriveEncoderConstants class. It holds many constants and parameters for the Drive Encoder Localizer.
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

public class DriveEncoderConstants {
    public static double forwardTicksToInches = 1;
    public static double strafeTicksToInches = 1;
    public static double turnTicksToInches = 1;

    public static double robot_Width = 1;
    public static double robot_Length = 1;

    public static double leftFrontEncoderDirection = Encoder.REVERSE;
    public static double rightFrontEncoderDirection = Encoder.FORWARD;
    public static double leftRearEncoderDirection = Encoder.REVERSE;
    public static double rightRearEncoderDirection = Encoder.FORWARD;
}
