package com.netcracker.chapter2;

import com.opencsv.CSVReader;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class CSVReaderPoints {
    public static List<Point> getPointsList(String filePath) throws Exception {
        CSVReader reader = new CSVReader(new FileReader(filePath));
        List<Point> points = new ArrayList();

        String[] record;
        while ((record = reader.readNext()) != null) {
            Point point = new Point(Double.parseDouble(record[0]), Double.parseDouble(record[1]));
            points.add(point);
        }
        System.out.println(points);
        reader.close();
        return null;
    }
}
