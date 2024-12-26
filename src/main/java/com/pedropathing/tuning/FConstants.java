package com.pedropathing.tuning;

import com.acmerobotics.dashboard.config.Config;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

import com.pedropathing.pathgen.MathFunctions;
import com.pedropathing.pathgen.Point;
import com.pedropathing.pathgen.Vector;
import com.pedropathing.util.CustomFilteredPIDFCoefficients;
import com.pedropathing.util.CustomPIDFCoefficients;
import com.pedropathing.util.KalmanFilterParameters;

@Config
public class FConstants extends FollowerConstants {
    // This section is for configuring your motors
    public static String leftFrontMotorName = "leftFront";
    public static String leftRearMotorName = "leftRear";
    public static String rightFrontMotorName = "rightFront";
    public static String rightRearMotorName = "rightRear";

    public static DcMotorSimple.Direction leftFrontMotorDirection = DcMotorSimple.Direction.REVERSE;
    public static DcMotorSimple.Direction rightFrontMotorDirection = DcMotorSimple.Direction.REVERSE;
    public static DcMotorSimple.Direction leftRearMotorDirection = DcMotorSimple.Direction.FORWARD;
    public static DcMotorSimple.Direction rightRearMotorDirection = DcMotorSimple.Direction.FORWARD;

    // This section is for setting the actual drive vector for the front left wheel, if the robot
    // is facing a heading of 0 radians with the wheel centered at (0,0)
    private static double xMovement = 81.34056;
    private static double yMovement = 65.43028;
    private static double[] convertToPolar = Point.cartesianToPolar(xMovement, -yMovement);
    public static Vector frontLeftVector = MathFunctions.normalizeVector(new Vector(convertToPolar[0], convertToPolar[1]));


    // Translational PIDF coefficients (don't use integral)
    public static CustomPIDFCoefficients translationalPIDFCoefficients = new CustomPIDFCoefficients(
            0.1,
            0,
            0,
            0);

    // Translational Integral
    public static CustomPIDFCoefficients translationalIntegral = new CustomPIDFCoefficients(
            0,
            0,
            0,
            0);

    // Feed forward constant added on to the translational PIDF
    public static double translationalPIDFFeedForward = 0.015;


    // Heading error PIDF coefficients
    public static CustomPIDFCoefficients headingPIDFCoefficients = new CustomPIDFCoefficients(
            1,
            0,
            0,
            0);

    // Feed forward constant added on to the heading PIDF
    public static double headingPIDFFeedForward = 0.01;


    // Drive PIDF coefficients
    public static CustomFilteredPIDFCoefficients drivePIDFCoefficients = new CustomFilteredPIDFCoefficients(
            0.025,
            0,
            0.00001,
            0.6,
            0);

    // Feed forward constant added on to the drive PIDF
    public static double drivePIDFFeedForward = 0.01;

    // Kalman filter parameters for the drive error Kalman filter
    public static KalmanFilterParameters driveKalmanFilterParameters = new KalmanFilterParameters(
            6,
            1);


    // Mass of robot in kilograms
    public static double mass = 10.65942;

    // Centripetal force to power scaling
    public static double centripetalScaling = 0.0005;


    // Acceleration of the drivetrain when power is cut in inches/second^2 (should be negative)
    // if not negative, then the robot thinks that its going to go faster under 0 power
    public static double forwardZeroPowerAcceleration = -34.62719;

    // Acceleration of the drivetrain when power is cut in inches/second^2 (should be negative)
    // if not negative, then the robot thinks that its going to go faster under 0 power
    public static double lateralZeroPowerAcceleration = -78.15554;

    // A multiplier for the zero power acceleration to change the speed the robot decelerates at
    // the end of paths.
    // Increasing this will cause the robot to try to decelerate faster, at the risk of overshoots
    // or localization slippage.
    // Decreasing this will cause the deceleration at the end of the Path to be slower, making the
    // robot slower but reducing risk of end-of-path overshoots or localization slippage.
    // This can be set individually for each Path, but this is the default.
    public static double zeroPowerAccelerationMultiplier = 4;


    // When the robot is at the end of its current Path or PathChain and the velocity goes below
    // this value, then end the Path. This is in inches/second.
    // This can be custom set for each Path.
    public static double pathEndVelocityConstraint = 0.1;

    // When the robot is at the end of its current Path or PathChain and the translational error
    // goes below this value, then end the Path. This is in inches.
    // This can be custom set for each Path.
    public static double pathEndTranslationalConstraint = 0.1;

    // When the robot is at the end of its current Path or PathChain and the heading error goes
    // below this value, then end the Path. This is in radians.
    // This can be custom set for each Path.
    public static double pathEndHeadingConstraint = 0.007;

    // When the t-value of the closest point to the robot on the Path is greater than this value,
    // then the Path is considered at its end.
    // This can be custom set for each Path.
    public static double pathEndTValueConstraint = 0.995;

    // When the Path is considered at its end parametrically, then the Follower has this many
    // milliseconds to further correct by default.
    // This can be custom set for each Path.
    public static double pathEndTimeoutConstraint = 500;

    // This is how many steps the BezierCurve class uses to approximate the length of a BezierCurve.
    public static int APPROXIMATION_STEPS = 1000;

    // This is scales the translational error correction power when the Follower is holding a Point.
    public static double holdPointTranslationalScaling = 0.45;

    // This is scales the heading error correction power when the Follower is holding a Point.
    public static double holdPointHeadingScaling = 0.35;

    // This is the number of times the velocity is recorded for averaging when approximating a first
    // and second derivative for on the fly centripetal correction. The velocity is calculated using
    // half of this number of samples, and the acceleration uses all of this number of samples.
    public static int AVERAGED_VELOCITY_SAMPLE_NUMBER = 8;

    // This is the number of steps the binary search for closest point uses. More steps is more
    // accuracy, and this increases at an exponential rate. However, more steps also does take more
    // time.
    public static int BEZIER_CURVE_BINARY_STEP_LIMIT = 10;


    // These activate / deactivate the secondary PIDs. These take over at errors under a set limit for
    // the translational, heading, and drive PIDs.
    public static boolean useSecondaryTranslationalPID = false;
    public static boolean useSecondaryHeadingPID = false;
    public static boolean useSecondaryDrivePID = false;


    // the limit at which the translational PIDF switches between the main and secondary translational PIDFs,
    // if the secondary PID is active
    public static double translationalPIDFSwitch = 3;

    // Secondary translational PIDF coefficients (don't use integral)
    public static CustomPIDFCoefficients secondaryTranslationalPIDFCoefficients = new CustomPIDFCoefficients(
            0.3,
            0,
            0.01,
            0);

    // Secondary translational Integral value
    public static CustomPIDFCoefficients secondaryTranslationalIntegral = new CustomPIDFCoefficients(
            0,
            0,
            0,
            0);

    // Feed forward constant added on to the small translational PIDF
    public static double secondaryTranslationalPIDFFeedForward = 0.015;


    // the limit at which the heading PIDF switches between the main and secondary heading PIDFs
    public static double headingPIDFSwitch = Math.PI / 20;

    // Secondary heading error PIDF coefficients
    public static CustomPIDFCoefficients secondaryHeadingPIDFCoefficients = new CustomPIDFCoefficients(
            5,
            0,
            0.08,
            0);

    // Feed forward constant added on to the secondary heading PIDF
    public static double secondaryHeadingPIDFFeedForward = 0.01;


    // the limit at which the heading PIDF switches between the main and secondary drive PIDFs
    public static double drivePIDFSwitch = 20;

    // Secondary drive PIDF coefficients
    public static CustomFilteredPIDFCoefficients secondaryDrivePIDFCoefficients = new CustomFilteredPIDFCoefficients(
            0.02,
            0,
            0.000005,
            0.6,
            0);

    // Feed forward constant added on to the secondary drive PIDF
    public static double secondaryDrivePIDFFeedForward = 0.01;

    @Override
    public String getLeftFrontMotorName() {
        return leftFrontMotorName;
    }

    @Override
    public String getLeftRearMotorName() {
        return leftRearMotorName;
    }

    @Override
    public String getRightFrontMotorName() {
        return rightFrontMotorName;
    }

    @Override
    public String getRightRearMotorName() {
        return rightRearMotorName;
    }

    @Override
    public DcMotorSimple.Direction getLeftFrontMotorDirection() {
        return leftFrontMotorDirection;
    }

    @Override
    public DcMotorSimple.Direction getRightFrontMotorDirection() {
        return rightFrontMotorDirection;
    }

    @Override
    public DcMotorSimple.Direction getLeftRearMotorDirection() {
        return leftRearMotorDirection;
    }

    @Override
    public DcMotorSimple.Direction getRightRearMotorDirection() {
        return rightRearMotorDirection;
    }

    @Override
    public Vector getFrontLeftVector() {
        return frontLeftVector;
    }

    @Override
    public CustomPIDFCoefficients getTranslationalPIDFCoefficients() {
        return translationalPIDFCoefficients;
    }

    @Override
    public CustomPIDFCoefficients getTranslationalIntegral() {
        return translationalIntegral;
    }

    @Override
    public double getTranslationalPIDFFeedForward() {
        return translationalPIDFFeedForward;
    }

    @Override
    public CustomPIDFCoefficients getHeadingPIDFCoefficients() {
        return headingPIDFCoefficients;
    }

    @Override
    public double getHeadingPIDFFeedForward() {
        return headingPIDFFeedForward;
    }

    @Override
    public CustomFilteredPIDFCoefficients getDrivePIDFCoefficients() {
        return drivePIDFCoefficients;
    }

    @Override
    public double getDrivePIDFFeedForward() {
        return drivePIDFFeedForward;
    }

    @Override
    public KalmanFilterParameters getDriveKalmanFilterParameters() {
        return driveKalmanFilterParameters;
    }

    @Override
    public double getMass() {
        return mass;
    }

    @Override
    public double getCentripetalScaling() {
        return centripetalScaling;
    }

    @Override
    public double getForwardZeroPowerAcceleration() {
        return forwardZeroPowerAcceleration;
    }

    @Override
    public double getLateralZeroPowerAcceleration() {
        return lateralZeroPowerAcceleration;
    }

    @Override
    public double getZeroPowerAccelerationMultiplier() {
        return zeroPowerAccelerationMultiplier;
    }

    @Override
    public double getPathEndVelocityConstraint() {
        return pathEndVelocityConstraint;
    }

    @Override
    public double getPathEndTranslationalConstraint() {
        return pathEndTranslationalConstraint;
    }

    @Override
    public double getPathEndHeadingConstraint() {
        return pathEndHeadingConstraint;
    }

    @Override
    public double getPathEndTValueConstraint() {
        return pathEndTValueConstraint;
    }

    @Override
    public double getPathEndTimeoutConstraint() {
        return pathEndTimeoutConstraint;
    }

    @Override
    public int getApproximationSteps() {
        return APPROXIMATION_STEPS;
    }

    @Override
    public double getHoldPointTranslationalScaling() {
        return holdPointTranslationalScaling;
    }

    @Override
    public double getHoldPointHeadingScaling() {
        return holdPointHeadingScaling;
    }

    @Override
    public int getAveragedVelocitySampleNumber() {
        return AVERAGED_VELOCITY_SAMPLE_NUMBER;
    }

    @Override
    public int getBezierCurveBinaryStepLimit() {
        return BEZIER_CURVE_BINARY_STEP_LIMIT;
    }

    @Override
    public boolean getUseSecondaryTranslationalPID() {
        return useSecondaryTranslationalPID;
    }

    @Override
    public boolean getUseSecondaryHeadingPID() {
        return useSecondaryHeadingPID;
    }

    @Override
    public boolean getUseSecondaryDrivePID() {
        return useSecondaryDrivePID;
    }

    @Override
    public double getTranslationalPIDFSwitch() {
        return translationalPIDFSwitch;
    }

    @Override
    public CustomPIDFCoefficients getSecondaryTranslationalPIDFCoefficients() {
        return secondaryTranslationalPIDFCoefficients;
    }

    @Override
    public CustomPIDFCoefficients getSecondaryTranslationalIntegral() {
        return secondaryTranslationalIntegral;
    }

    @Override
    public double getSecondaryTranslationalPIDFFeedForward() {
        return secondaryTranslationalPIDFFeedForward;
    }

    @Override
    public double getHeadingPIDFSwitch() {
        return headingPIDFSwitch;
    }

    @Override
    public CustomPIDFCoefficients getSecondaryHeadingPIDFCoefficients() {
        return secondaryHeadingPIDFCoefficients;
    }

    @Override
    public double getSecondaryHeadingPIDFFeedForward() {
        return secondaryHeadingPIDFFeedForward;
    }

    @Override
    public double getDrivePIDFSwitch() {
        return drivePIDFSwitch;
    }

    @Override
    public CustomFilteredPIDFCoefficients getSecondaryDrivePIDFCoefficients() {
        return secondaryDrivePIDFCoefficients;
    }

    @Override
    public double getSecondaryDrivePIDFFeedForward() {
        return secondaryDrivePIDFFeedForward;
    }
}
