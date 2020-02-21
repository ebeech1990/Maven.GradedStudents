package io.zipcoder;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

public class Classroom {
    private static final Logger LOGGER = Logger.getLogger(Classroom.class.getName());
    private Student[] students;
    private int maxNumOfStudents;

    public Classroom(int maxNumOfStudents){
        this.maxNumOfStudents = maxNumOfStudents;
    }

    public Classroom(Student[] students){
      this.students = new Student[students.length];
      int i = 0;
//           while (i< students.length-1) {
//               this.students[i] = students[i];
//               i++;
//           }
        for(Student s : students) {
            this.students[i] = s;
            i++;
        }
        }


    public Classroom(){
        this.students = new Student[30];
    }

    public Student[] getStudents() {
        return students;
    }

    public Double getAverageExamScore(){
        Double sum = 0.0;
        Double result = 0.0;
        for(Student s : students) {
           sum += s.sumExamScores();

        }

        result = sum/students.length;

        return result;
    }

    public void addStudent(Student student) {

        List<Student> myList = new ArrayList<>();
        myList.add(student);
        Student[] temp = myList.toArray(new Student[myList.size()-1]);
        students = temp;
    }
}
