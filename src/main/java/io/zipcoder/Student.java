package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Logger;

public class Student {
    private static final Logger LOGGER = Logger.getLogger(Student.class.getName());
    String firstName;
    String lastName;
    ArrayList<Double> examScores = new ArrayList<>();

    public Student(String firstName, String lastName, Double[] examScores){
        this.firstName = firstName;
        this.lastName = lastName;


          for(Double score : examScores) {
              this.examScores.add(score);
          }


    }



    @Override
    public String toString() {
        String result;
        result = String.format("Student Name: %s %s\n> Average Score");
        return result;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getNumberOfExamsTaken() {
        return examScores.size();
    }

    public String getExamScores(){
        String scoreString = "";
        for(Double score : examScores) {
            if(score == examScores.get(examScores.size() -1)){
                scoreString += score;
            }
            else{
                scoreString += score + ", ";
            }
        }

        return scoreString;
    }

    public Double addExamScore(Double score) {
        examScores.add(score);
        return score;
    }

    public String setExamScore(Integer index, Double newScore) {
        String result = "";

       examScores.set(index, newScore);
        result = (index+1) + " " + newScore;

        return result;
    }

    public Double getAverageExamScore() {
        Double avg;
        Double sum = 0.0;
        for(Double d : examScores) {
            sum += d;
        }
        avg = sum/examScores.size();
        return avg;
    }


}
