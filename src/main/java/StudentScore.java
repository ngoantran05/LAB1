public class StudentScore {

    public static String classifyScore(int[] scores) {
        int total = 0;

        // Vòng lặp
        for (int score : scores) {
            total += score;
        }

        double average = (double) total / scores.length;

        // Lệnh rẽ nhánh
        if (average >= 8) {
            return "Excellent";
        } else if (average >= 5) {
            return "Pass";
        } else {
            return "Fail";
        }
    }
}