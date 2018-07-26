package com.example.android.worldcupquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int grades = 0; // Global variable for grades


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Display the final grades in the form of toast message.
     * @param view views in the activity_main.xml
     */
    public void showGrades(View view){
        Toast.makeText(this, "You got " + getGrades(grades) + " out of 7 questions", Toast.LENGTH_SHORT).show();

    }

    /**
     * This function gets the final grades for the quiz.
     *
     * @param marks refers to the grade of this quiz
     * @return finalGrades;
     */
    private int getGrades(int marks){
        int finalGrades = 0;

        //Answer key for each question
        RadioButton answerKeyQuestionOne = (RadioButton) findViewById(R.id.question_1_choice_3);

        RadioButton answerKeyQuestionTwo = (RadioButton) findViewById(R.id.question_2_choice_1);

        RadioButton answerKeyQuestionThree = (RadioButton) findViewById(R.id.question_3_choice_4);

        CheckBox answerKeyQuestionFourOne = (CheckBox) findViewById(R.id.question_4_choice_1);
        CheckBox answerKeyQuestionFourTwo = (CheckBox) findViewById(R.id.question_4_choice_3);
        CheckBox answerKeyQuestionFourThree = (CheckBox) findViewById(R.id.question_4_choice_4);

        CheckBox answerKeyQuestionFiveOne = (CheckBox) findViewById(R.id.question_5_choice_2);
        CheckBox answerKeyQuestionFiveTwo = (CheckBox) findViewById(R.id.question_5_choice_3);

        CheckBox answerKeyQuestionSixOne = (CheckBox) findViewById(R.id.question_6_choice_2);
        CheckBox answerKeyQuestionSixTwo = (CheckBox) findViewById(R.id.question_6_choice_3);
        CheckBox answerKeyQuestionSixThree = (CheckBox) findViewById(R.id.question_6_choice_4);

        EditText questionSeven = (EditText) findViewById(R.id.question_7_answer_space);
        String answerKeyQuestionSeven = "Luka Modric";
        String answerKeyQuestionSevenTwo = "Modric";
        String answerQuestionSeven = questionSeven.getText().toString();

        //Check for correct answers
        if(answerKeyQuestionOne.isChecked()){
            marks++;
        }

        if(answerKeyQuestionTwo.isChecked()){
            marks++;
        }

        if(answerKeyQuestionThree.isChecked()){
            marks++;
        }

        if(answerKeyQuestionFourOne.isChecked() && answerKeyQuestionFourTwo.isChecked() && answerKeyQuestionFourThree.isChecked()){
            marks++;
        }

        if(answerKeyQuestionFiveOne.isChecked() && answerKeyQuestionFiveTwo.isChecked()){
            marks++;
        }

        if(answerKeyQuestionSixOne.isChecked() && answerKeyQuestionSixTwo.isChecked() && answerKeyQuestionSixThree.isChecked()){
            marks++;
        }

        if(answerQuestionSeven.equalsIgnoreCase(answerKeyQuestionSeven) || answerQuestionSeven.equalsIgnoreCase(answerKeyQuestionSevenTwo)){
            marks++;
        }

        finalGrades = marks; //this statement is to ensure that the value of final grades is the same as the input parameter.

        return finalGrades;

    }
}
