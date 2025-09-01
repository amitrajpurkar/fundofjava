package unit2NextSteps.frmsch;


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


}
