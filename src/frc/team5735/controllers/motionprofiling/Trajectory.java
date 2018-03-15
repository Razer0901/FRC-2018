package frc.team5735.controllers.motionprofiling;

public class Trajectory {
    private double[][] leftPoints, rightPoints;  // Position (rotations), Velocity (RPM), Duration (ms)

    public Trajectory(String fileName) {
        this(fileName,false);
    }

    public Trajectory(String fileName, boolean isReversed) {
        leftPoints = TrajectoryParser.getTrajectory(fileName + "/" + fileName + "_left.csv");
        rightPoints = TrajectoryParser.getTrajectory(fileName + "/" + fileName + "_right.csv");

        if (isReversed) {    // Make velocity negative, flip profile (first point is the last point), correct position
            leftPoints = reversePath(leftPoints);
            rightPoints = reversePath(rightPoints);
        }
    }

    public double[][] getLeftPoints() {
        return leftPoints;
    }

    public double[][] getRightPoints() {
        return rightPoints;
    }

    private static double[][] reversePath(double[][] points) {
        double finalPosition = points[points.length-1][0];
        double[][] reversedPoints = new double[points.length][3];
        for (int i = 0; i < points.length; i++) {
            double[] currentPoint = points[points.length-1-i];

            currentPoint[0] -= finalPosition;   // Position
//            currentPoint[0] = round(currentPoint[0],6);

            currentPoint[1] *= -1;              // Velocity
//            currentPoint[1] = round(currentPoint[1],6);

            reversedPoints[i] = currentPoint;
        }

        return reversedPoints;
    }

    private static double round(double value, int places) {
        double scale = Math.pow(10, places);
        return Math.round(value * scale) / scale;
    }
}
