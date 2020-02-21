package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class ClassroomTest {
    @Test
    public void TestGetAvgExamScore(){
        Double[] s1Scores = { 100.0, 150.0 };
        Double[] s2Scores = { 225.0, 25.0 };

        Student s1 = new Student("student", "one", s1Scores);
        Student s2 = new Student("student", "two", s2Scores);

        Student[] students = new Student[2];
        students[0] = s1;
        students[1] = s2;
        Classroom classroom = new Classroom(students);

        // When
        Double actualOutput = classroom.getAverageExamScore();
        Double expectedOutput = 250.0;
        Assert.assertEquals(expectedOutput, actualOutput);
    }

}
