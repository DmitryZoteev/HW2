package com.netcracker;

import com.netcracker.chapter1.LotteryTicket;
import com.netcracker.chapter1.MagicSquare;
import com.netcracker.chapter1.Angle;
import com.netcracker.chapter1.Factorial;
import com.netcracker.chapter2.Car;
import com.netcracker.chapter2.Point;
import com.netcracker.chapter3.Employee;
import com.netcracker.chapter3.IntSequence;
import com.netcracker.chapter3.Measurable;
import com.opencsv.CSVReader;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static com.netcracker.chapter1.SubString.subString;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("=============chapter 1==============");
        System.out.println("===============ex2==================");
        System.out.println(Angle.angleNormalization(60));
        System.out.println(Angle.angleNormalization(400));
        System.out.println(Angle.angleNormalization(-60));
        System.out.println(Angle.angleNormalization(-400));
        System.out.println(Angle.angleNormalizationWithFloorMod(60));
        System.out.println(Angle.angleNormalizationWithFloorMod(400));
        System.out.println(Angle.angleNormalizationWithFloorMod(-60));
        System.out.println(Angle.angleNormalizationWithFloorMod(-400));

        System.out.println("===============ex6==================");
        System.out.println(Factorial.searchFactorial(1000));

        System.out.println("===============ex8==================");
        String str = "abcd";
        subString(str);

        System.out.println("===============ex13=================");
        System.out.println(LotteryTicket.createTicket());

        System.out.println("===============ex14=================");
        MagicSquare m = new MagicSquare();
        m.start();

        System.out.println("=============chapter 2==============");
        System.out.println("===============ex5==================");
        Point p = new Point(3, 4).translate(1, 3).scale(0.5);
        System.out.println("координаты точки: " + p.getX() + " " + p.getY());

        System.out.println("===============ex9==================");
        Car car = new Car(65, 0.7);
        car.Drive(95);
        car.Drive(1);
        car.addGallons(100);
        car.Drive(130);
        System.out.println("Пробег: " + car.getDistance());
        System.out.println("Бензина в баке: " + car.getFuelLevel());

        System.out.println("===============ex13==================");
        String filePath = "C:\\Users\\dmitr\\Desktop\\Java SpringSchool 2022\\Projects\\HW2\\src\\com\\netcracker\\points.csv";
        CSVReader reader = new CSVReader(new FileReader(filePath));
        List<Point> points = new ArrayList();

        String[] record;
        while ((record = reader.readNext()) != null) {
            Point point = new Point(Double.parseDouble(record[0]), Double.parseDouble(record[1]));
            points.add(point);
        }
        System.out.println(points);
        reader.close();

        System.out.println("=============chapter 3==============");
        System.out.println("===============ex1==================");
        Measurable[] mes = {
                new Employee("Adam", 1500),
                new Employee("Christopher"),
                new Employee("Leo", 3200)
        };
        System.out.println("Средняя ЗП: " + Employee.average(mes));

        System.out.println("===============ex2==================");
        System.out.println("Максимальная зарплата у работника по имени: " + ((Employee) Employee.largest(mes)).getName());

        System.out.println("===============ex4==================");
        IntSequence sequence = IntSequence.of(3, 1, 4, 1, 5, 9);
        while (sequence.hasNext()) {
            System.out.println(sequence.next());
        }

        System.out.println("===============ex5==================");
        print(IntSequence.constant(1), 7);
        print(IntSequence.constantLambda(7), 4);
    }

    private static void print(IntSequence sequence, int limit) {
        Stream.generate(sequence::next).limit(limit).forEach(System.out::print);
        System.out.println();
    }
}
