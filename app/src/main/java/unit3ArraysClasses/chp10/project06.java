package unit3ArraysClasses.chp10;

import java.util.Arrays;

// Student Class case study is in section 10.9
public class project06 {
    public static void main(String[] args) {
        // askForNumbers();
    }

    private static class Student {
        private String name;
        private int[] testScores;

        public Student() {
        }

        public Student(String name) {
            this(name, 3);
        }

        public Student(String name, int[] testScores) {
            this.name = name;
            this.testScores = testScores;
        }

        public Student(String name, int count) {
            this.name = name;
            this.testScores = new int[count];
            for (int i = 0; i < count; i++) {
                this.testScores[i] = 0;
            }
        }

        // build a copy of Student
        public Student(Student s) {
            this(s.name, s.testScores);
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setTestScores(int[] testScores) {
            this.testScores = testScores;
        }

        public String getName() {
            return name;
        }

        public int[] getTestScores() {
            return testScores;
        }

        public void setScoreAt(int position, int score) {
            this.testScores[position - 1] = score;
        }

        public int getScoreAt(int position) {
            return this.testScores[position - 1];
        }

        public double getAverage() {
            double sum = 0.0;
            for (int score : testScores) {
                sum += score;
            }
            return sum / this.testScores.length;
        }

        public int getHighScore() {
            int highScore = 0;
            for (int score : testScores) {
                highScore = Math.max(highScore, score);
            }
            return highScore;
        }

        public String toString() {
            return this.name + ": " + Arrays.toString(this.testScores) + "; Average: " + getAverage();
        }

        public String validate() {
            StringBuilder message = new StringBuilder();
            if (name.isEmpty()) {
                message.append("ERROR: Name cannot be empty; ");
            } else if (name.length() > 0) {
                for (int score : testScores) {
                    if (score < 0 || score > 100)
                        message.append("ERROR: Test score must be between 0 and 100; value: ").append(score);
                }
            } else {
                message.append("NO_ERROR");
            }

            return message.toString();
        }
    }
}
