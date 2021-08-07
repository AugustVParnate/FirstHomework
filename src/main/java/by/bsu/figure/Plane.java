package by.bsu.figure;

import java.util.Objects;

public class Plane {

    private double angle;

    public double getAngle() {
        return angle;
    }

    public void setAngle(double valueAngle) {
        this.angle = valueAngle;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "angle=" + angle +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Plane plane = (Plane) o;
        return Double.compare(plane.angle, angle) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(angle);
    }
}
