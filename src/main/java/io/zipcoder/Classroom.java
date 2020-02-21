package io.zipcoder;

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

    public Student[] getStudents(Student[] students) {
        return students;
    }

    public Double getAverageExamScore(){
        Double sum = 0.0;
        Double result = 0.0;
        for(Student s : students) {
           sum += s.sumExamScores();

        }

        result = sum/students.length;
        LOGGER.info(result.toString());
        return result;
    }
}
