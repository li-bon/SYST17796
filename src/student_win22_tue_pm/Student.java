/*
Date: Jan 25 2022
Author: Bonita Li
*/

public class Student {
    private String studentId;
    private String studentName;
    private String address;
    
    public Student(String studentId, String studentName) {
        this.studentId=studentId;
        this.studentName=studentName;
    }
    public String getAddress() {
        return address;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    
 
}
