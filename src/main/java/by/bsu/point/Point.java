package by.bsu.point;

import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;

import java.util.Objects;

public class Point {
    private static final Logger LOG = LogManager.getLogger(Point.class);

    private double x;
    private double y;
    private double z;

    public double getX() {
        return x;
    }

    public void setX(double valueX) throws Exception {
       if (valueX > 10 || valueX < -10) {
           LOG.info("Error. Choose value from -10 to 10!");
           throw new Exception("Error. Choose values from -10 to 10!");
       }
       x = valueX;
    }

    public double getY() {
        return y;
    }

    public void setY(double valueY) throws Exception {
        if (valueY > 10 || valueY < -10) {
            LOG.info("Error. Choose value from -10 to 10!");
            throw new Exception("Error. Choose values from -10 to 10!");
        }
        y = valueY;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double valueZ) throws Exception {
        if (valueZ > 10 || valueZ < -10) {
            LOG.info("Error. Choose value from -10 to 10!");
            throw new Exception("Error. Choose values from -10 to 10!");
        }
        z = valueZ;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return Double.compare(point.x, x) == 0 && Double.compare(point.y, y) == 0 && Double.compare(point.z, z) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, z);
    }
}
