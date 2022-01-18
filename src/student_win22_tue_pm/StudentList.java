/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student_win22_tue_pm;

/**
 *
 * @author Bonita
 */
public class StudentList {
    public static void main(String[]args) {
        Student[] studentList = new Student[4];
        studentList[0] = new Student("s1", "Bonita Li");
        studentList[1] = new Student ("s2", "John Doe");
        studentList[2] = new Student ("s3", "abc");
        
        for (int i=0; i<studentList.length; i++){
            System.out.print(studentList[i].getStudentId());
            System.out.print(" ");
            System.out.println(studentList[i].getStudentName());
        }
    }
    
}
