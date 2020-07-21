package com.example.mathgame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button button0, button1, button2, button3, button4, button5, button6,
            button7, button8, button9, buttonC, buttonEnter, buttonQ;
    TextView edttxt, question;
    int rand_num1,rand_num2,rand_func,soln,input;
    String[] functions = new String[4];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0 = (Button) findViewById(R.id.b_0);
        button1 = (Button) findViewById(R.id.b_1);
        button2 = (Button) findViewById(R.id.b_2);
        button3 = (Button) findViewById(R.id.b_3);
        button4 = (Button) findViewById(R.id.b_4);
        button5 = (Button) findViewById(R.id.b_5);
        button6 = (Button) findViewById(R.id.b_6);
        button7 = (Button) findViewById(R.id.b_7);
        button8 = (Button) findViewById(R.id.b_8);
        button9 = (Button) findViewById(R.id.b_9);
        buttonC = (Button) findViewById(R.id.b_C);
        buttonEnter = (Button) findViewById(R.id.b_enter);
        buttonQ = (Button) findViewById(R.id.button_q);
        edttxt = (TextView) findViewById(R.id.screen2);
        question = (TextView) findViewById(R.id.screen1);


        functions[0] = "+";
        functions[1] = "-";
        functions[2] = "*";
        functions[3] = "mod";

        Random rand = new Random();
        rand_func = rand.nextInt(4);
        question.setText("Your question is: ");
        rand_num1 = rand.nextInt(101);
        rand_num2 = rand.nextInt(101);
        while(rand_func == 1 && rand_num1 < rand_num2){//prevents negatives
                rand_num1 = rand.nextInt(101);
                rand_num2 = rand.nextInt(101);
        }
        while(rand_func == 3 && rand_num2 == 0){//prevent errors
                rand_num2 = rand.nextInt(101);
        }
        question.setText(question.getText() + Integer.toString(rand_num1) + " " + functions[rand_func] + " " + Integer.toString(rand_num2));

        buttonQ.setOnClickListener(new View.OnClickListener() {//creates a random generated question 
            @Override
            public void onClick(View v) {
                Random rand = new Random();
                functions[0] = "+";
                functions[1] = "-";
                functions[2] = "*";
                functions[3] = "mod";
                rand_func = rand.nextInt(4);
                edttxt.setText("");
                question.setText("");
                question.setText("Your question is: ");
                rand_num1 = rand.nextInt(101);
                rand_num2 = rand.nextInt(101);
                while(rand_func == 1 && rand_num1 < rand_num2){//prevents negatives
                    rand_num1 = rand.nextInt(101);
                    rand_num2 = rand.nextInt(101);
                }
                while(rand_func == 3 && rand_num2 == 0){//prevent errors
                    rand_num2 = rand.nextInt(101);
                }
                question.setText(question.getText() + Integer.toString(rand_num1) + " " + functions[rand_func] + " " + Integer.toString(rand_num2));
            }
        });


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edttxt.setText(edttxt.getText() + "1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edttxt.setText(edttxt.getText() + "2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edttxt.setText(edttxt.getText() + "3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edttxt.setText(edttxt.getText() + "4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edttxt.setText(edttxt.getText() + "5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edttxt.setText(edttxt.getText() + "6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edttxt.setText(edttxt.getText() + "7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edttxt.setText(edttxt.getText() + "8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edttxt.setText(edttxt.getText() + "9");
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edttxt.setText(edttxt.getText() + "0");
            }
        });


        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edttxt.setText("");
            }
        });


        buttonEnter.setOnClickListener(new View.OnClickListener() {//checks each case if input matches answer
            @Override
            public void onClick(View v) {
                input = Integer.parseInt(edttxt.getText()+"");
                if (rand_func == 0){
                    soln = rand_num1 + rand_num2;
                    if (soln == input){
                        question.setText("Correct Answer!");
                    }
                    else{
                        question.setText("Incorrect Answer!");
                    }
                }
                if (rand_func == 1){
                    soln = rand_num1 - rand_num2;
                    if (soln == input){
                        question.setText("Correct Answer!");
                    }
                    else{
                        question.setText("Incorrect Answer!");
                    }
                }
                if (rand_func == 2){
                    soln = rand_num1 * rand_num2;
                    if (soln == input){
                        question.setText("Correct Answer!");
                    }
                    else{
                        question.setText("Incorrect Answer!");
                    }
                }
                if (rand_func == 3){
                    soln = rand_num1 % rand_num2;

                    if (soln == input){
                        question.setText("Correct Answer!");
                    }
                    else{
                        question.setText("Incorrect Answer!");
                    }
                }
            }
        });
    }
}
