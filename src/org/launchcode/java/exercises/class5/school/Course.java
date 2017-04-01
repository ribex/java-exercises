package org.launchcode.java.exercises.class5.school;

import java.util.ArrayList;
import java.util.HashMap;

import org.launchcode.java.exercises.class5.school.Student;

/**
 * Created by Rebecca on 3/22/2017.
 */
public class Course {
    private String instructor;
    private int courseId;
    private String courseName;
    private int maxClassSize;
    private ArrayList<Student> roster = new ArrayList<Student>();

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getMaxClassSize() {
        return maxClassSize;
    }

    public void setMaxClassSize(int maxClassSize) {
        this.maxClassSize = maxClassSize;
    }

    public ArrayList<Student> getRoster() {
        return roster;
    }

    public void setRoster(ArrayList<Student> roster) {
        this.roster = roster;
    }
}
