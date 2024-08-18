import java.util.Random;
import java.util.Arrays;
public class Grades { 
    public static void main(String[] args) {
        Random rand = new Random();
        int[] student = new int[30];
        for(int i=0; i<30; i++) {
            student[i] = rand.nextInt(100);
        }
        System.out.println("Student Grades record : ");
        //System.out.println(Arrays.toString(student));
        int sum = 0, highest_Grade = student[0], lowest_Grade = student[0];
        for(int i=0; i<30; i++) {
            System.out.printf("%d. Marks : %d\n",i+1,student[i]);
            sum += student[i];
            if(highest_Grade<student[i]) {
                highest_Grade = student[i];
            }
            if(lowest_Grade>student[i]) {
                lowest_Grade = student[i];
            }
        }
        int average = sum/student.length;
        System.out.println("Average : "+average+"\nHighest Grade : "+highest_Grade+"\nLowest Grade : "+lowest_Grade);
        //Arrays.sort(student);
        //System.out.println(Arrays.toString(student));
        for(int i=0; i<29; i++) {
            for(int j=i+1; j<30; j++) {
                int temp;
                if(student[i]<student[j]) {
                    temp = student[j];
                    student[j] = student[i]; 
                    student[i] = temp;
                }
            }
        }
        System.out.println("Top 5 scores are :");
        for(int i=0; i<5; i++) {
            System.out.printf("%d\t",student[i]);
        }
    }
}
