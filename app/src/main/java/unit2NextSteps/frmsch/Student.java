package unit2NextSteps.frmsch;


public class Student {
    private String name;
    private int mathsScore;
    private int physicsScore;
    private int historyScore;
    private double averageScore;

    private Student(String name, int mathsScore, int physicsScore, int historyScore) {
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

    public String validate() {
        StringBuilder message = new StringBuilder();
        if (name.isEmpty()) {
            message.append("Name cannot be empty; ");
        }
        if (mathsScore < 0 || mathsScore > 100) {
            message.append("Maths score must be between 0 and 100; value: ").append(mathsScore).append("; ");
        }
        if (physicsScore < 0 || physicsScore > 100) {
            message.append("Physics score must be between 0 and 100; value: ").append(physicsScore).append("; ");
        }
        if (historyScore < 0 || historyScore > 100) {
            message.append("History score must be between 0 and 100; value: ").append(historyScore).append("; ");
        }
        return message.toString();
    }

    public static class StuBuilder {
        private String name;
        private int mathsScore;
        private int physicsScore;
        private int historyScore;

        public StuBuilder(String name) {
            this.name = name;
        }

        public StuBuilder maths(int mathsScore) {
            this.mathsScore = mathsScore;
            return this;
        }
        public StuBuilder physics(int physicsScore) {
            this.physicsScore = physicsScore;
            return this;
        }
        public StuBuilder history(int historyScore) {
            this.historyScore = historyScore;
            return this;
        }
        public Student build() {
            return new Student(name, mathsScore, physicsScore, historyScore);
        }
    }
}
