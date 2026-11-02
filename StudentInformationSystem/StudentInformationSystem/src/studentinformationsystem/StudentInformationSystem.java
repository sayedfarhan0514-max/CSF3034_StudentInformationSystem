/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentinformationsystem;
/**
 *AUTHOR: SAYED MUHAMMAD AFIF FARHAN BIN SAYED ABDULLAH
 *NO MATRIC:S86918
 *QUESTION: LAB MODULE 2 GIT (ACTIVITY 8)
 *DATE: 28/10/2026
 */
public class StudentInformationSystem {
    public static void main(String[] args) 
    {
        int mark1 = 40;
        int mark2 = 45;
        int totalMark = mark1 + mark2;

        System.out.println("Total Mark: " + totalMark);

        if (totalMark >= 80) 
        {
            System.out.println("Result: Excellent");
        } 
        else if (totalMark >= 50) 
        {
            System.out.println("Result: Good");
        } 
        else 
        {
            System.out.println("Result: Needs Improvement");
        }
    }
    
}
