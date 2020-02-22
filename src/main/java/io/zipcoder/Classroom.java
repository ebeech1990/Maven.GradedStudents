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

//    Double student1Score = student1.getAverageExamScore();//125.00 leon
//    Double student2Score = student2.getAverageExamScore();//112.5 jim
//    Double student3Score = student3.getAverageExamScore();//125.00 sara
//125,112,125 0
//125,112,125 1



    public ArrayList<Student> getStudentsByScore() {
        Comparator<Student> avgComp = Comparator.comparing(Student::getAverageExamScore).reversed().thenComparing(Student::getLastName);
        Collections.sort(students,avgComp);
        for(Student s : students) {
            System.out.println(s);
        }
//85 leon
//65 sara
//65 tara

       return students;
    }


}
