import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class StudentScoreTest {

    @Test
    void testExcellentScore() {
        int[] scores = {9, 8, 10};

        assertEquals("Excellent", StudentScore.classifyScore(scores));
    }

    @Test
    void testPassScore() {
        int[] scores = {6, 7, 5};

        assertEquals("Pass", StudentScore.classifyScore(scores));
    }

    @Test
    void testFailScore() {
        int[] scores = {3, 4, 2};

        assertEquals("Fail", StudentScore.classifyScore(scores));
    }

    @Test
    void testExcellentWithOneScore() {
        int[] scores = {8};

        assertEquals("Excellent", StudentScore.classifyScore(scores));
    }
}