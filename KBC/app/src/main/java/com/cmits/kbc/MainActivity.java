package com.cmits.kbc;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button submit_answer_j;
    TextView question_j,choice_j,winning_msg_j,losing_msg_j;
    EditText answer_j;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        submit_answer_j = findViewById(R.id.submit_answer);
        question_j = findViewById(R.id.question);
        choice_j = findViewById(R.id.choice);
        winning_msg_j = findViewById(R.id.winning_msg);
        losing_msg_j = findViewById(R.id.losing_msg);
        answer_j = findViewById(R.id.answer);
        question_j.setText("Who is Sana?");
        choice_j.setText("A. Scientist \n B. Teacher \n C. Student \n D. President");
        submit_answer_j.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String choice_s = String.valueOf(answer_j.getText());

                switch(choice_s)
                {
                    case "A":
                        winning_msg_j.setText("Congratulations You are Right You Won Rs 1000 \n Question 2 On Your Screen");
                        kbc2();
                        break;
                    default:
                        losing_msg_j.setText("Oops She is A Scientist Your Answer is Wrong");
                }
            }
        });
    }

    void kbc2()
    {
        question_j.setText("Who is Parth?");
        choice_j.setText("A. Scientist \n B. Coder \n C. Student \n D. President");
        submit_answer_j.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String choice_s = String.valueOf(answer_j.getText());

                switch(choice_s)
                {
                    case "B":
                        winning_msg_j.setText("Congratulations You are Right You Won Rs 5000 \n Question 3 On Your Screen");
                        kbc3();
                        break;
                    default:
                        losing_msg_j.setText("Oops He is A Coder Your Answer is Wrong");
                }
            }
        });
    }
    void kbc3()
    {
        question_j.setText("Who is Gaurav?");
        choice_j.setText("A. Scientist \n B. Coder \n C. Teacher  \n D. President");
        submit_answer_j.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String choice_s = String.valueOf(answer_j.getText());

                switch(choice_s)
                {
                    case "C":
                        winning_msg_j.setText("Congratulations You are Right You Won Rs 10000 \n Question 3 On Your Screen");
                        break;
                    default:
                        losing_msg_j.setText("Oops He is A Teacher Your Answer is Wrong");
                }
            }
        });
    }


}
