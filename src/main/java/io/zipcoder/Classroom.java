package io.zipcoder;

import java.lang.reflect.Array;
import java.util.*;
import java.util.logging.Logger;

public class Classroom {
    private static final Logger LOGGER = Logger.getLogger(Classroom.class.getName());
    ArrayList<Student> students = new ArrayList<>();
    private int maxNumOfStudents;

    public Classroom(int maxNumOfStudents){
        this.maxNumOfStudents = maxNumOfStudents;
    }

    public Classroom(Student[] students){
      for(Student s : students) {
          this.students.add(s);
      }
        }


    public Classroom(){

    }

    public ArrayList<Student> getStudents() {

        return students;
    }

    public Double getAverageExamScore(){
        Double sum = 0.0;
        Double result = 0.0;
        for(Student s : students) {
           sum += s.sumExamScores();

        }

        result = sum/students.size();

        return result;
    }

    public void addStudent(Student student) {
        students.add(student);

    }

    public void removeStudent(String firstName, String lastName) {
           Iterator<Student> it = students.iterator();

           while (it.hasNext()){

                Student x = it.next();
               if((x.getFirstName().equals(firstName)) && (x.getLastName().equals(lastName))) {
                   it.remove();
               }
           }

    }

//    public ArrayList<Student> getStudentsByScore() {
//        //Collections.sort(students);
//    }


}
