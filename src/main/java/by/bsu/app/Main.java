package by.bsu.app;

import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;

import by.bsu.actionclass.Methods;
import by.bsu.point.Point;
import by.bsu.validationclass.DataChecker;

public class Main {
    private static final Logger LOG = LogManager.getLogger(Methods.class);

    public static void main(String[] args) throws Exception {
        LOG.info("Program start!");
        if(args.length == 0) {
            System.out.println("Specify the path to the data file as a command-line parameter!");
            System.exit(0);
        }
        DataChecker dataChecker = new DataChecker();
        dataChecker.CheckDataItem();

        Point firstPoint = new Point();
            firstPoint.setX(dataChecker.x1);
            firstPoint.setY(dataChecker.y1);
            firstPoint.setZ(dataChecker.z1);
        Point secondPoint = new Point();
            secondPoint.setX(dataChecker.x2);
            secondPoint.setY(dataChecker.y2);
            secondPoint.setZ(dataChecker.z2);
        Point thirdPoint = new Point();
            thirdPoint.setX(dataChecker.x3);
            thirdPoint.setY(dataChecker.y3);
            thirdPoint.setZ(dataChecker.z3);
        Methods obj = new Methods();
          obj.isPlane(firstPoint, secondPoint, thirdPoint);
          obj.isPerpendicular(firstPoint, secondPoint, thirdPoint);
    }
}
