import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class letterGradeBoundaryTest {

    @Test
    public void invalidInt () {
        char answer = letterGrade.letterGrade(101);
        char answer2 = letterGrade.letterGrade(-1);
        assertEquals('X',answer);
        assertEquals('X',answer2);
    }

    @Test
    public void should_be_gradeA () {
        char answer = letterGrade.letterGrade(90);
        char answer2 = letterGrade.letterGrade(97);
        char answer3 = letterGrade.letterGrade(100);
        assertEquals('A',answer);
        assertEquals('A',answer2);
        assertEquals('A',answer3);
    }

    @Test
    public void should_be_gradeB () {
        char answer = letterGrade.letterGrade(80);
        char answer2 = letterGrade.letterGrade(84);
        char answer3 = letterGrade.letterGrade(89);
        assertEquals('B',answer);
        assertEquals('B',answer2);
        assertEquals('B',answer3);
    }

    @Test
    public void should_be_gradeC () {
        char answer = letterGrade.letterGrade(70);
        char answer2 = letterGrade.letterGrade(76);
        char answer3 = letterGrade.letterGrade(79);
        assertEquals('C',answer);
        assertEquals('C',answer2);
        assertEquals('C',answer3);
    }

    @Test
    public void should_be_gradeD () {
        char answer = letterGrade.letterGrade(60);
        char answer2 = letterGrade.letterGrade(64);
        char answer3 = letterGrade.letterGrade(69);
        assertEquals('D',answer);
        assertEquals('D',answer2);
        assertEquals('D',answer3);
    }

    @Test
    public void should_be_gradeF () {
        char answer = letterGrade.letterGrade(59);
        char answer2 = letterGrade.letterGrade(20);
        char answer3 = letterGrade.letterGrade(0);
        assertEquals('F',answer);
        assertEquals('F',answer2);
        assertEquals('F',answer3);
    }
}