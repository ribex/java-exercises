package org.launchcode.java.exercises.class5.school;

/**
 * Created by Rebecca on 3/22/2017.
 */
public class Student {

    // declare (and initialize) fields
    private static int nextStudentId = 1;
    private String name;
    private final int studentId;
    private int numberOfCredits;
    private double gpa;

    private Student(String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    private Student(String name, int studentId) {
        this(name, studentId, 0, 0);
    }

    public Student(String name) {
        this(name, nextStudentId);
        nextStudentId++;
    }

    public void addGrade(int courseCredits, double grade) {
        // Update the appropriate fields: numberOfCredits, gpa
        int oldCredits = numberOfCredits;
        numberOfCredits += courseCredits;
        gpa = ((oldCredits * gpa) + grade) / numberOfCredits;
    }

    public String getGradeLevel() {
        // Determine the grade level of the student based on numberOfCredits
        String gradeLevel;
        if (numberOfCredits > 90) {
            gradeLevel = "Senior";
        } else if (numberOfCredits > 60) {
            gradeLevel = "Junior";
        } else if (numberOfCredits > 30) {
            gradeLevel = "Sophomore";
        } else {
            gradeLevel = "Freshman";
        }
        return gradeLevel;
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}
