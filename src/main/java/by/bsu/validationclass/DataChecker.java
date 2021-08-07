package by.bsu.validationclass;

import java.nio.file.FileSystems;
import java.nio.file.Files;

public class DataChecker {
    public double x1, y1, z1, x2, y2, z2, x3, y3, z3;

    public void CheckDataItem() throws Exception {
        String line = new
                String(Files.readAllBytes(FileSystems.getDefault().getPath
                ("C:\\Users\\81501\\IdeaProjects\\Project1\\file\\textfile.txt")));
        String[] parts = line.split(" ");
        if (parts.length != 9) {
            throw new Exception("Incorrect number of coordinates!");
        }
        x1 = Double.parseDouble(parts[0]);
        y1 = Double.parseDouble(parts[1]);
        z1 = Double.parseDouble(parts[2]);
        x2 = Double.parseDouble(parts[3]);
        y2 = Double.parseDouble(parts[4]);
        z2 = Double.parseDouble(parts[5]);
        x3 = Double.parseDouble(parts[6]);
        y3 = Double.parseDouble(parts[7]);
        z3 = Double.parseDouble(parts[8]);
    }
}
