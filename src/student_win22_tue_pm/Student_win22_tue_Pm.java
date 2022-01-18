/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package student_win22_tue_pm;

/**
 *
 * @author Bonita
 */
public class Student_win22_tue_Pm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char[] myWord = new char[7];
        myWord[0]='s';
        myWord[1]='t';
        myWord[2]='u';
        myWord[3]='d';
        myWord[4]='e';
        myWord[5]='n';
        myWord[6]='t';
        
        for(int i=0; i<myWord.length; i++) {
            System.out.println(myWord[i]);
        }
        System.out.print("     ");
        System.out.print("reverse order");
        for (int i = myWord.length-1; i>=0; i--) {
            System.out.print(myWord[i]);
        }
    }
    
}
