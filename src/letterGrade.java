public class letterGrade {

    public static char letterGrade(int score) {
        char grade;
        if (score < 0 || score > 100) {
            grade = 'X';
        } else if (90 <= score && score <= 100) {
            grade = 'A';
        } else if (80 <= score && score < 90){
            grade = 'B';
        }else if(70<=score &&score<80){
            grade ='C';
        }else if(60 <= score && score <70){
            grade = 'D';
        }else{
            grade = 'F';
        }
        return grade;
    }
}
