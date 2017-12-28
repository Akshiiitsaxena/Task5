package taskfive.akshit.com.task5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Question_1 extends AppCompatActivity {

    Button button_1,button_2,button_3,button_4,button_final;
    int i;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_1);

        button_1 = (Button) findViewById(R.id.button1);
        button_2 = (Button) findViewById(R.id.button2);
        button_3 = (Button) findViewById(R.id.button3);
        button_4 = (Button) findViewById(R.id.button4);
        button_final = (Button) findViewById(R.id.finish1);
        final Intent intent = new Intent(getApplicationContext(),Question_2.class);
        final Intent intent2 = new Intent(getApplicationContext(),Result.class);
        i=0;


      button_1.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              intent.putExtra("correct",i);
              startActivity(intent);
          }
      });

        button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i++;
                intent.putExtra("correct",i);
                startActivity(intent);

            }
        });

        button_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("correct",i);
                startActivity(intent);
            }
        });

        button_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("correct",i);
                startActivity(intent);
            }
        });

        button_final.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             intent2.putExtra("wrongg",i);
             startActivity(intent2);
            }
        });


    }
}
