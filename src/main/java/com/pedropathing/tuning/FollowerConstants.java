package com.pedropathing.tuning;


import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.pedropathing.pathgen.Vector;
import com.pedropathing.util.CustomFilteredPIDFCoefficients;
import com.pedropathing.util.CustomPIDFCoefficients;
import com.pedropathing.util.KalmanFilterParameters;

/**
 * This is the FollowerConstants class. It holds many constants and parameters for various parts of
 * the Follower. This is here to allow for easier tuning of Pedro Pathing, as well as concentrate
 * everything tunable for the Paths themselves in one place.
 *
 * @author Anyi Lin - 10158 Scott's Bots
 * @author Aaron Yang - 10158 Scott's Bots
 * @author Harrison Womack - 10158 Scott's Bots
 * @version 1.0, 3/4/2024
 */

public abstract class FollowerConstants {

    // Abstract getter methods for motor configuration
    public abstract String getLeftFrontMotorName();
    public abstract String getLeftRearMotorName();
    public abstract String getRightFrontMotorName();
    public abstract String getRightRearMotorName();

    public abstract DcMotorSimple.Direction getLeftFrontMotorDirection();
    public abstract DcMotorSimple.Direction getRightFrontMotorDirection();
    public abstract DcMotorSimple.Direction getLeftRearMotorDirection();
    public abstract DcMotorSimple.Direction getRightRearMotorDirection();

    public abstract Vector getFrontLeftVector();

    // Abstract getter methods for PIDF coefficients
    public abstract CustomPIDFCoefficients getTranslationalPIDFCoefficients();
    public abstract CustomPIDFCoefficients getTranslationalIntegral();
    public abstract double getTranslationalPIDFFeedForward();

    public abstract CustomPIDFCoefficients getHeadingPIDFCoefficients();
    public abstract double getHeadingPIDFFeedForward();

    public abstract CustomFilteredPIDFCoefficients getDrivePIDFCoefficients();
    public abstract double getDrivePIDFFeedForward();

    // Abstract getter methods for Kalman filter and physical parameters
    public abstract KalmanFilterParameters getDriveKalmanFilterParameters();
    public abstract double getMass();
    public abstract double getCentripetalScaling();

    // Abstract getter methods for acceleration parameters
    public abstract double getForwardZeroPowerAcceleration();
    public abstract double getLateralZeroPowerAcceleration();
    public abstract double getZeroPowerAccelerationMultiplier();

    // Abstract getter methods for path end constraints
    public abstract double getPathEndVelocityConstraint();
    public abstract double getPathEndTranslationalConstraint();
    public abstract double getPathEndHeadingConstraint();
    public abstract double getPathEndTValueConstraint();
    public abstract double getPathEndTimeoutConstraint();

    // Abstract getter methods for various parameters
    public abstract int getApproximationSteps();
    public abstract double getHoldPointTranslationalScaling();
    public abstract double getHoldPointHeadingScaling();
    public abstract int getAveragedVelocitySampleNumber();
    public abstract int getBezierCurveBinaryStepLimit();

    // Abstract getter methods for secondary PID settings
    public abstract boolean getUseSecondaryTranslationalPID();
    public abstract boolean getUseSecondaryHeadingPID();
    public abstract boolean getUseSecondaryDrivePID();

    public abstract double getTranslationalPIDFSwitch();
    public abstract CustomPIDFCoefficients getSecondaryTranslationalPIDFCoefficients();
    public abstract CustomPIDFCoefficients getSecondaryTranslationalIntegral();
    public abstract double getSecondaryTranslationalPIDFFeedForward();

    public abstract double getHeadingPIDFSwitch();
    public abstract CustomPIDFCoefficients getSecondaryHeadingPIDFCoefficients();
    public abstract double getSecondaryHeadingPIDFFeedForward();

    public abstract double getDrivePIDFSwitch();
    public abstract CustomFilteredPIDFCoefficients getSecondaryDrivePIDFCoefficients();
    public abstract double getSecondaryDrivePIDFFeedForward();
}
