package unit2NextSteps.frmsch;

import java.util.ArrayList;
import java.util.List;

public class Students {
    
    private static List<Student> studentList = new ArrayList<Student>();

    public static List<Student> getStudents(){
        return studentList;
    }

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
            total += student.getAverageScore();
        }
        return total / studentList.size();
    }
    public static double averageMathsScore() {
        int total = 0;
        for (Student student : studentList) {
            total += student.getMathsScore();
        }
        return total / studentList.size();
    }
    public static double averagePhysicsScore() {
        int total = 0;
        for (Student student : studentList) {
            total += student.getPhysicsScore();
        }
        return total / studentList.size();
    }
    public static double averageHistoryScore() {
        int total = 0;
        for (Student student : studentList) {
            total += student.getHistoryScore();
        }
        return total / studentList.size();
    }
    public static String highestMathsScore() {
        int highest = 0;
        String highestName = "";
        for (Student student : studentList) {
            if (student.getMathsScore() > highest) {
                highest = student.getMathsScore();
                highestName = student.getName();
            }
        }
        return "Highest Maths Score: " + highest + " by " + highestName;
    }
    public static String highestPhysicsScore() {
        int highest = 0;
        String highestName = "";
        for (Student student : studentList) {
            if (student.getPhysicsScore() > highest) {
                highest = student.getPhysicsScore();
                highestName = student.getName();
            }
        }
        return "Highest Physics Score: " + highest + " by " + highestName;
    }
    public static String highestHistoryScore() {
        int highest = 0;
        String highestName = "";
        for (Student student : studentList) {
            if (student.getHistoryScore() > highest) {
                highest = student.getHistoryScore();
                highestName = student.getName();
            }
        }
        return "Highest History Score: " + highest + " by " + highestName;
    }
        
}
