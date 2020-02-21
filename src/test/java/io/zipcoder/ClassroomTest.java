package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.logging.Logger;

public class ClassroomTest {
    private static final Logger LOGGER = Logger.getLogger(ClassroomTest.class.getName());
//    @Test
//    public void TestGetAvgExamScore(){
//        Double[] s1Scores = { 100.0, 150.0 };
//        Double[] s2Scores = { 225.0, 25.0 };
//
//        Student s1 = new Student("student", "one", s1Scores);
//        Student s2 = new Student("student", "two", s2Scores);
//
//        Student[] students = new Student[2];
//        students[0] = s1;
//        students[1] = s2;
//        Classroom classroom = new Classroom(students);
//
//        // When
//        Double actualOutput = classroom.getAverageExamScore();
//        Double expectedOutput = 250.0;
//        Assert.assertEquals(expectedOutput, actualOutput);
//    }
//
//    @Test
//    public void TestAddStudent(){
//        // : Given
//        int maxNumberOfStudents = 1;
//        Classroom classroom = new Classroom(maxNumberOfStudents);
//        Double[] examScores = { 100.0, 150.0, 250.0, 0.0 };
//        Student student = new Student("Leon", "Hunter", examScores);
//
//        // When
//        Student[] preEnrollment = classroom.getStudents();
//        classroom.addStudent(student);
//        Student[] postEnrollment = classroom.getStudents();
//
//
//        // Then
//        String preEnrollmentAsString = Arrays.toString(preEnrollment);
//        String postEnrollmentAsString = Arrays.toString(postEnrollment);
//        System.out.println("===========================");
//        System.out.println(preEnrollmentAsString);
//        System.out.println("===========================");
//        System.out.println(postEnrollmentAsString);
//
//    }
@Test
    public void TestRemoveStudent(){
    int maxNumberOfStudents = 3;
    Classroom classroom = new Classroom(maxNumberOfStudents);
    Double[] examScores1 = { 100.0, 150.0, 250.0, 0.0 };
    Student student1 = new Student("Leon", "Hunter", examScores1);
    Double[] examScores2 = { 100.0, 150.0, 250.0, 0.0 };
    Student student2 = new Student("Jim", "Smith", examScores2);
    Student student3 = new Student("Sara", "Hill", examScores2);

    classroom.addStudent(student1);
    classroom.addStudent(student2);
    classroom.addStudent(student3);

   String before = classroom.getStudents().toString();
    classroom.removeStudent("Jim", "Smith");
    String after = classroom.getStudents().toString();
    //LOGGER.info(before);
    LOGGER.info(after);
    }

}
