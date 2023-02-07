package it.figuccia;

import java.util.ArrayList;
import java.util.List;

public class Tester {
    public static void main(String[] args) {
        List<Double> individualMarksListLisa = new ArrayList<>();
        individualMarksListLisa.add(90.0);
        individualMarksListLisa.add(85.0);

        List<Integer> projectMarksListJeremy = new ArrayList<>();
        projectMarksListJeremy.add(95);
        projectMarksListJeremy.add(89);

        double lisaAvg = Student.getAverageMark(individualMarksListLisa);
        double jeremyAvg = Student.getAverageMark(projectMarksListJeremy);

        List<Student> listOfStudents = new ArrayList<>();
        listOfStudents.add(new Student("Lisa", "Stuart", lisaAvg));
        listOfStudents.add(new Student("Jeremy", "Green", jeremyAvg));

        System.out.println("---Print using toString() override---");
        for (Student student : listOfStudents) {
            System.out.println(student.toString());
        }
        System.out.println("\n---Print using get()---");
        System.out.println(listOfStudents.get(0));
        System.out.println(listOfStudents.get(1));

    }
}