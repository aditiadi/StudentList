/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentlist;

import java.util.Scanner;

/**
 *
 * @author Aditi
 */
public class StudentList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        //Changed array size to 4
        Student[] students = new Student[4];
        
        System.out.println("Enter student names");
        
        for(int i=0; i<students.length; i++)
        {
            System.out.println("Enter student's name :"+(i+1));
            String name = input.nextLine();
            Student student = new Student(name);
            students[i] = student;
        }
        
        String format = "Student name is %s\n";
        
        for(Student student : students)
        {
            System.out.printf(format, student.getName());
        }
    } 
}
