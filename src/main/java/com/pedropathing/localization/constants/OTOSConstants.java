package com.pedropathing.localization.constants;

import com.qualcomm.hardware.sparkfun.SparkFunOTOS;

import org.firstinspires.ftc.robotcore.external.navigation.AngleUnit;
import org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit;

/**
 * This is the OTOSConstants class. It holds many constants and parameters for the OTOS Localizer.
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

public class OTOSConstants {
    public static final String hardwareMapName = "sensor_otos";
    public static final DistanceUnit linearUnit = DistanceUnit.INCH;
    public static final AngleUnit angleUnit = AngleUnit.RADIANS;
    public static final SparkFunOTOS.Pose2D offset = new SparkFunOTOS.Pose2D(0, 0, Math.PI / 2);
    public static final double linearScalar = 1.0;
    public static final double angularScalar = 1.0;
}
