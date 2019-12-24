import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class letterGradeTest {

    @Test
    public void invalidInt () {
        char answer = letterGrade.letterGrade(110);
        char answer2 = letterGrade.letterGrade(-10);
        assertEquals('X',answer);
        assertEquals('X',answer2);
    }

    @Test
    public void should_be_gradeA () {
        char answer = letterGrade.letterGrade(95);
        assertEquals('A',answer);
    }

    @Test
    public void should_be_gradeB () {
        char answer = letterGrade.letterGrade(87);
        assertEquals('B',answer);
    }

    @Test
    public void should_be_gradeC () {
        char answer = letterGrade.letterGrade(74);
        assertEquals('C',answer);
    }

    @Test
    public void should_be_gradeD () {
        char answer = letterGrade.letterGrade(68);
        assertEquals('D',answer);
    }

    @Test
    public void should_be_gradeF () {
        char answer = letterGrade.letterGrade(20);
        assertEquals('F',answer);
    }
}