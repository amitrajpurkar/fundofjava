package unit1GettingStarted;

import java.util.ArrayList;
import java.util.List;


public class Student {
    String name;
    int mathsScore;
    int physicsScore;
    int historyScore;
    double averageScore;

    public Student(String name, int mathsScore, int physicsScore, int historyScore) {
        this.name = name;
        this.mathsScore = mathsScore;
        this.physicsScore = physicsScore;
        this.historyScore = historyScore;
        this.averageScore = (mathsScore + physicsScore + historyScore) / 3;
    }

    public String getName() {
        return name;
    }
    public int getMathsScore() {
        return mathsScore;
    }
    public int getPhysicsScore() {
        return physicsScore;
    }
    public int getHistoryScore() {
        return historyScore;
    }
    public double getAverageScore() {
        return averageScore;
    }

    static List<Student> studentList = new ArrayList<Student>();
    public static void addStudent(Student student) {
        studentList.add(student);
    }
    public static void resetStudents() {
        studentList.clear();
    }
    public static int numberOfStudents() {
        return studentList.size();
    }
    public static double averageAllScore() {
        int total = 0;
        for (Student student : studentList) {
            total += student.mathsScore + student.physicsScore + student.historyScore;
        }
        return total / studentList.size();
    }
    public static double averageMathsScore() {
        int total = 0;
        for (Student student : studentList) {
            total += student.mathsScore;
        }
        return total / studentList.size();
    }
    public static double averagePhysicsScore() {
        int total = 0;
        for (Student student : studentList) {
            total += student.physicsScore;
        }
        return total / studentList.size();
    }
    public static double averageHistoryScore() {
        int total = 0;
        for (Student student : studentList) {
            total += student.historyScore;
        }
        return total / studentList.size();
    }
    
}
