package it.figuccia;

import java.util.*;

public class Student {
    private String studentName;
    private String studentSurname;
    private double marksAverage;

    public Student(String name, String surname, double average) {
        this.studentName = name;
        this.studentSurname = surname;
        this.marksAverage = average;
    }

    // Metodo statico per il calcolo della media che estende la classe Number
    public static double getAverageMark(List<? extends Number> listOfMarks) {
        double average = (listOfMarks.get(0).doubleValue() + listOfMarks.get(1).doubleValue())/listOfMarks.size();
        return average;
    }
    @Override
    public String toString() {
        return "Student:\ntName: " + studentName +". Surname: " + studentSurname + ", Average: " + marksAverage + ".";
    }
}
