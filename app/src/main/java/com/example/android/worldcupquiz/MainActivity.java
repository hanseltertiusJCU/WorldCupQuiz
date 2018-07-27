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
    int answeredQuestions = 0; // Global variable for answered questions


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
        int questionsAnswered = getQuestionAnswered(answeredQuestions);
        int questionsLeft = 7 - questionsAnswered;
        if(questionsAnswered < 7){
            Toast.makeText(this, "You must answered all questions. " + questionsLeft + " question(s) left", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "You got " + getGrades(grades) + " out of " + questionsAnswered + " questions", Toast.LENGTH_SHORT).show();
        }

    }

    /**
     * This function gets the final grades for the quiz.
     *
     * @param marks refers to the grade of this quiz
     * @return marks;
     */
    private int getGrades(int marks){

        //Answer key for each question
        RadioButton answerKeyQuestionOne = (RadioButton) findViewById(R.id.question_1_choice_3);

        RadioButton answerKeyQuestionTwo = (RadioButton) findViewById(R.id.question_2_choice_1);

        RadioButton answerKeyQuestionThree = (RadioButton) findViewById(R.id.question_3_choice_4);

        CheckBox answerKeyQuestionFourOne = (CheckBox) findViewById(R.id.question_4_choice_1);
        CheckBox wrongAnswerQuestionFour = (CheckBox) findViewById(R.id.question_4_choice_2);
        CheckBox answerKeyQuestionFourTwo = (CheckBox) findViewById(R.id.question_4_choice_3);
        CheckBox answerKeyQuestionFourThree = (CheckBox) findViewById(R.id.question_4_choice_4);

        CheckBox wrongAnswerQuestionFiveOne = (CheckBox) findViewById(R.id.question_5_choice_1);
        CheckBox answerKeyQuestionFiveOne = (CheckBox) findViewById(R.id.question_5_choice_2);
        CheckBox answerKeyQuestionFiveTwo = (CheckBox) findViewById(R.id.question_5_choice_3);
        CheckBox wrongAnswerQuestionFiveTwo = (CheckBox) findViewById(R.id.question_5_choice_4);

        CheckBox wrongAnswerQuestionSix = (CheckBox) findViewById(R.id.question_6_choice_1);
        CheckBox answerKeyQuestionSixOne = (CheckBox) findViewById(R.id.question_6_choice_2);
        CheckBox answerKeyQuestionSixTwo = (CheckBox) findViewById(R.id.question_6_choice_3);
        CheckBox answerKeyQuestionSixThree = (CheckBox) findViewById(R.id.question_6_choice_4);

        EditText questionSeven = (EditText) findViewById(R.id.question_7_answer_space);
        String answerKeyQuestionSeven = "Luka Modric";
        String answerKeyQuestionSevenTwo = "Modric";
        String answerQuestionSeven = questionSeven.getText().toString();

        //Check whether the answer is correct
        if(answerKeyQuestionOne.isChecked()){
            marks++;
        }

        if(answerKeyQuestionTwo.isChecked()){
            marks++;
        }

        if(answerKeyQuestionThree.isChecked()){
            marks++;
        }

        if(answerKeyQuestionFourOne.isChecked() && answerKeyQuestionFourTwo.isChecked() && answerKeyQuestionFourThree.isChecked() && !wrongAnswerQuestionFour.isChecked()){
            marks++;
        }

        if(answerKeyQuestionFiveOne.isChecked() && answerKeyQuestionFiveTwo.isChecked() && !wrongAnswerQuestionFiveOne.isChecked() && !wrongAnswerQuestionFiveTwo.isChecked()){
            marks++;
        }

        if(answerKeyQuestionSixOne.isChecked() && answerKeyQuestionSixTwo.isChecked() && answerKeyQuestionSixThree.isChecked() && !wrongAnswerQuestionSix.isChecked() ){
            marks++;
        }

        if(answerQuestionSeven.equalsIgnoreCase(answerKeyQuestionSeven) || answerQuestionSeven.equalsIgnoreCase(answerKeyQuestionSevenTwo)){
            marks++;
        }

        return marks;

    }

    /**
     * This function gets how many questions are answered for the quiz.
     *
     * @param amountAnswered refers to the amount of answer that the user has answered.
     * @return amountAnswered;
     */
    private int getQuestionAnswered(int amountAnswered){

        //Answer key for each question
        RadioButton answerOneQuestionOne = (RadioButton) findViewById(R.id.question_1_choice_1);
        RadioButton answerTwoQuestionOne = (RadioButton) findViewById(R.id.question_1_choice_2);
        RadioButton answerThreeQuestionOne = (RadioButton) findViewById(R.id.question_1_choice_3);
        RadioButton answerFourQuestionOne = (RadioButton) findViewById(R.id.question_1_choice_4);

        RadioButton answerOneQuestionTwo = (RadioButton) findViewById(R.id.question_2_choice_1);
        RadioButton answerTwoQuestionTwo = (RadioButton) findViewById(R.id.question_2_choice_2);
        RadioButton answerThreeQuestionTwo = (RadioButton) findViewById(R.id.question_2_choice_3);
        RadioButton answerFourQuestionTwo = (RadioButton) findViewById(R.id.question_2_choice_4);

        RadioButton answerOneQuestionThree = (RadioButton) findViewById(R.id.question_3_choice_1);
        RadioButton answerTwoQuestionThree = (RadioButton) findViewById(R.id.question_3_choice_2);
        RadioButton answerThreeQuestionThree = (RadioButton) findViewById(R.id.question_3_choice_3);
        RadioButton answerFourQuestionThree = (RadioButton) findViewById(R.id.question_3_choice_4);

        CheckBox answerOneQuestionFour = (CheckBox) findViewById(R.id.question_4_choice_1);
        CheckBox answerTwoQuestionFour = (CheckBox) findViewById(R.id.question_4_choice_2);
        CheckBox answerThreeQuestionFour = (CheckBox) findViewById(R.id.question_4_choice_3);
        CheckBox answerFourQuestionFour = (CheckBox) findViewById(R.id.question_4_choice_4);

        CheckBox answerOneQuestionFive = (CheckBox) findViewById(R.id.question_5_choice_1);
        CheckBox answerTwoQuestionFive = (CheckBox) findViewById(R.id.question_5_choice_2);
        CheckBox answerThreeQuestionFive = (CheckBox) findViewById(R.id.question_5_choice_3);
        CheckBox answerFourQuestionFive = (CheckBox) findViewById(R.id.question_5_choice_4);

        CheckBox answerOneQuestionSix = (CheckBox) findViewById(R.id.question_6_choice_1);
        CheckBox answerTwoQuestionSix = (CheckBox) findViewById(R.id.question_6_choice_2);
        CheckBox answerThreeQuestionSix = (CheckBox) findViewById(R.id.question_6_choice_3);
        CheckBox answerFourQuestionSix = (CheckBox) findViewById(R.id.question_6_choice_4);

        EditText answerSpaceQuestionSeven = (EditText) findViewById(R.id.question_7_answer_space);
        String answerQuestionSeven = answerSpaceQuestionSeven.getText().toString();

        //Check whether the answer is correct
        if(answerOneQuestionOne.isChecked() || answerTwoQuestionOne.isChecked() || answerThreeQuestionOne.isChecked() || answerFourQuestionOne.isChecked()){
            amountAnswered++;
        }

        if(answerOneQuestionTwo.isChecked() || answerTwoQuestionTwo.isChecked() || answerThreeQuestionTwo.isChecked() || answerFourQuestionTwo.isChecked()){
            amountAnswered++;
        }

        if(answerOneQuestionThree.isChecked() || answerTwoQuestionThree.isChecked() || answerThreeQuestionThree.isChecked() || answerFourQuestionThree.isChecked()){
            amountAnswered++;
        }

        if(answerOneQuestionFour.isChecked() || answerTwoQuestionFour.isChecked() || answerThreeQuestionFour.isChecked() || answerFourQuestionFour.isChecked()){
            amountAnswered++;
        }

        if(answerOneQuestionFive.isChecked() || answerTwoQuestionFive.isChecked() || answerThreeQuestionFive.isChecked() || answerFourQuestionFive.isChecked()){
            amountAnswered++;
        }

        if(answerOneQuestionSix.isChecked() || answerTwoQuestionSix.isChecked() || answerThreeQuestionSix.isChecked() || answerFourQuestionSix.isChecked()){
            amountAnswered++;
        }

        if (!answerQuestionSeven.matches("")) {
            amountAnswered++;
        }

        return amountAnswered;

    }
}
