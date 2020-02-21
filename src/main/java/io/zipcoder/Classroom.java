package io.zipcoder;

public class Classroom {
    private Student[] students;
    private int maxNumOfStudents;

    public Classroom(int maxNumOfStudents){
        this.maxNumOfStudents = maxNumOfStudents;
    }

    public Classroom(Student[] students){

        this.maxNumOfStudents = students.length;
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
        return result;
    }
}
