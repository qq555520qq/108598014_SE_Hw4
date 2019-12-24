import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class letterGrade {

    public static void main(String[] args) {
        System.out.print("Enetr the score = ");
        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            int score = Integer.parseInt(br.readLine());
            char grade = letterGrade(score);
            System.out.println("The grade of " + score + " is " + grade);
        } catch (NumberFormatException ex) {
            System.out.println("Not an integer!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
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
