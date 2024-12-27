package com.pedropathing.localization.constants;

import com.pedropathing.localization.GoBildaPinpointDriver;

import org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit;

/**
 * This is the PinpointConstants class. It holds many constants and parameters for the Pinpoint Localizer.
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

public class PinpointConstants {
    public static double forwardY = 1;
    public static double strafeX = -2.5;
    public static DistanceUnit distanceUnit = DistanceUnit.INCH;
    public static String hardwareMapName = "pinpoint";
    public static double yawScalar = 1.0;
    public static boolean encoderResolutionCustom = false;
    public static GoBildaPinpointDriver.GoBildaOdometryPods encoderResolution = GoBildaPinpointDriver.GoBildaOdometryPods.goBILDA_4_BAR_POD;
    public static double customEncoderResolution = 13.26291192;
    public static GoBildaPinpointDriver.EncoderDirection forwardEncoderDirection = GoBildaPinpointDriver.EncoderDirection.REVERSED;
    public static GoBildaPinpointDriver.EncoderDirection strafeEncoderDirection = GoBildaPinpointDriver.EncoderDirection.FORWARD;
}
