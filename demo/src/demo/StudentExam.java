package demo;
import java.util.Scanner;
public class StudentExam{
    private String examtitle;
    private float marks[];


    public void inputExam()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nExam Title");
        this.examtitle = sc.next();
        System.out.println("marks of 5 subjects");
        for(int x=0; x<5; x++)        
        {
             this.marks[x] = sc.nextFloat();
            }

    }

    public void showStudent()
    {
        System.out.println("\nExam Title"+this.examtitle);
        System.out.println("marks of 5 subjects");
           for(int x=0; x<5; x++)        
            {
                System.out.println(this.marks[x]);
            }
    }

}

