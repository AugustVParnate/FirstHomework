package by.bsu.actionclass;

import by.bsu.point.Point;

//import org.apache.log4j.LogManager;
//import org.apache.log4j.Logger;

public class Methods {
 //   private static final Logger LOGGER = LogManager.getLogger(Methods.class);

    public void isPlane(Point firstPoint, Point secondPoint, Point thirdPoint) {
        double x1 = firstPoint.getX(), x2 = secondPoint.getX(), x3 = thirdPoint.getX();
        double y1 = firstPoint.getY(), y2 = secondPoint.getY(), y3 = thirdPoint.getY();
        double z1 = firstPoint.getZ(), z2 = secondPoint.getZ(), z3 = thirdPoint.getZ();

        if ((x1 - x2)/(x1 - x3) == (y1 - y2)/(y1 - y3) && (x1 - x2)/(x1 - x3) == (z1 - z2)/(z1 - z3)) {
         //    LOGGER.info("Three points don't make up the plane!");
            System.out.println("Three points don't make up the plane!");
        } else {
            // LOGGER.info("Three points make up the plane!");
            System.out.println("Three points make up the plane!");
        }
    }

}
