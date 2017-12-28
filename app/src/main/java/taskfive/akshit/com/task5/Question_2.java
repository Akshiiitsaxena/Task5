package taskfive.akshit.com.task5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Question_2 extends AppCompatActivity {

    Button butt_1,butt_2,butt_3,butt_4,butt_f;
    int a;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_2);

        butt_1 = (Button) findViewById(R.id.button1);
        butt_2 = (Button) findViewById(R.id.button2);
        butt_3 = (Button) findViewById(R.id.button3);
        butt_4 = (Button) findViewById(R.id.button4);
        butt_f = (Button) findViewById(R.id.finish1);
        final Intent intent_i = new Intent(getApplicationContext(),Question_3.class);
        final Intent intent_i2 = new Intent(getApplicationContext(),Result.class);
        final Intent intent = getIntent();

        butt_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = intent.getIntExtra("correct",0);
                intent_i.putExtra("right",a);
                startActivity(intent_i);
            }
        });

        butt_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = intent.getIntExtra("correct",0);
                intent_i.putExtra("right",a);
                startActivity(intent_i);
            }
        });

        butt_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = intent.getIntExtra("correct",0);
                a++;
                intent_i.putExtra("right",a);
                startActivity(intent_i);
            }
        });

        butt_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = intent.getIntExtra("correct",0);
                intent_i.putExtra("right",a);
                startActivity(intent_i);
            }
        });

        butt_f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = intent.getIntExtra("correct",0);
                intent_i2.putExtra("wrong2",a);
                startActivity(intent_i2);
            }
        });

    }
}
