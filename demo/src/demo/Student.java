package demo;

import java.util.Scanner;

public class Student // Has-A
{   Scanner sc = new Scanner(System.in);
    private int rollNumber;
    private String name;
    private String branch;
    private StudentExam[] exam;

    

    public void inputStudent()
    {
        
        System.out.print("\nRoll : "); this.rollNumber = sc.nextInt();
        System.out.print("Name : "); this.name = sc.next();
        System.out.print("Branch : "); this.branch = sc.next();
        System.out.println("How many exam are done");
    	int n =sc.nextInt();
    	this.exam= new StudentExam[n];
    	for(int x=0; x<n; x++)       
        { StudentExam exam= new StudentExam();
           this.exam[x] = StudentExam;
        } 
    	
    	
    }
   
    public void showStudent()
    {
        System.out.println("\nRoll Number : " + rollNumber);
        System.out.println("Name : " + name);
        System.out.println("Branch : " + branch);
        this.exam.StudentExam();
        
        
    }
}