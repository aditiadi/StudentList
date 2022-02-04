/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentlist;

/**
 *
 * @author Aditi  Feb 04/02/2022
 */
public class PartTimeStudent extends Student 
{
    private int numCourses;

    public PartTimeStudent(int numCourses, String name) 
    {
        super(name);
        this.numCourses = numCourses;
    }

    public int getNumCourses() 
    {
        return numCourses;
    }

    public void setNumCourses(int numCourses) 
    {
        this.numCourses = numCourses;
    }
    
    // I am done !!
    
    public void printInfo()
    {
      System.out.println("My name is Aditi..");
      System.out.println("I am an international student");
    } 
}
