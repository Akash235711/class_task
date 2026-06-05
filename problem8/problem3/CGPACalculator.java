public class CGPACalculator {
    public static void main(String[] args) {
        String[] studentNames = {"NILOY", "ROBIUL", "NONDI", "SHAWON", "RAFI"};
        double[][] gradePoints = {
                {4.0, 3.7, 3.3, 4.0, 3.0},
                {3.3, 3.0, 2.7, 3.7, 3.3},
                {2.0, 2.3, 3.0, 2.7, 2.0},
                {4.0, 4.0, 3.7, 4.0, 4.0},
                {3.0, 2.7, 3.3, 3.0, 2.3}
        };
        int[] credits = {3, 4, 3, 2, 3};
        String[] subjectNames = {"Math", "Physics", "Chemistry", "English", "CS"};
        System.out.println("========== CGPA Calculator ==========");
        System.out.printf("%-12s", "Student");
        for (String sub : subjectNames) {
            System.out.printf("%-12s", sub);
        }
        System.out.printf("%-8s%n", "CGPA");
        System.out.println("-".repeat(80));
        for (int i = 0; i < 5; i++) {
            double weightedSum = 0;
            int totalCredits  = 0;
            for (int j = 0; j < 5; j++) {
                weightedSum  += gradePoints[i][j] * credits[j];
                totalCredits += credits[j];
            }
            double cgpa = weightedSum / totalCredits;
            System.out.printf("%-12s", studentNames[i]);
            for (int j = 0; j < 5; j++) {
                System.out.printf("%-12.1f", gradePoints[i][j]);
            }
            System.out.printf("%.2f%n", cgpa);
        }
        System.out.println("-".repeat(80));
        System.out.printf("%-12s", "Credits");
        for (int c : credits) {
            System.out.printf("%-12d", c);
        }
        System.out.println();
    }
}