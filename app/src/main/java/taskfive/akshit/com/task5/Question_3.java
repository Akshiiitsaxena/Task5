package taskfive.akshit.com.task5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Question_3 extends AppCompatActivity {

    Button bot1,bot2,bot3,bot4,botf;
    int b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_3);


        bot1 = (Button) findViewById(R.id.button1);
        bot2 = (Button) findViewById(R.id.button2);
        bot3 = (Button) findViewById(R.id.button3);
        bot4 = (Button) findViewById(R.id.button4);
        botf = (Button) findViewById(R.id.finish1);
        final Intent i = new Intent(getApplicationContext(),Result.class);
        final Intent ai = getIntent();


        bot1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int b = ai.getIntExtra("right",0);
                i.putExtra("last",b);
                startActivity(i);
            }
        });

        bot2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int b = ai.getIntExtra("right",0);
                i.putExtra("last",b);
                startActivity(i);
            }
        });

        bot3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int b = ai.getIntExtra("right",0);
                i.putExtra("last",b);
                startActivity(i);
            }
        });

        bot4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int b = ai.getIntExtra("right",0);
                b++;
                i.putExtra("last",b);
                startActivity(i);
            }
        });

        botf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int b = ai.getIntExtra("right",0);
                i.putExtra("last",b);
                startActivity(i);
            }
        });

    }
}
