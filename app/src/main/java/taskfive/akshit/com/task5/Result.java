package taskfive.akshit.com.task5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class Result extends AppCompatActivity {

    int Final_from_one,Final_from_two,Final;
    TextView txt;
    RelativeLayout relativeLayout;
    String str;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

         str = "You have reached the end of the Quiz";
         txt = (TextView) findViewById(R.id.textView3);
         relativeLayout = (RelativeLayout) findViewById(R.id.relative_layout);

        Intent i1 = getIntent();
        Intent i2 = getIntent();
        Intent i3 = getIntent();

        int Final_from_one = i1.getIntExtra("wrongg",0);
        int Final_from_two = i2.getIntExtra("wrong2",0);
        int Final = i3.getIntExtra("last",0);

              if (Final_from_one==0 || Final_from_two==0)
              {
                  txt.setText("You scored ZERO. You're a noob.");
              }

              if (Final_from_two==1 || Final==1)
              {
                  txt.setText("You scored ONE. Still a noob.");
              }

              if (Final==2)
              {
                  txt.setText("You scored TWO. That's fine.");
              }

               if (Final==3)
              {
                     txt.setText("You scored THREE. You need a life.");
              }


         Toast.makeText(Result.this,str,Toast.LENGTH_LONG).show();



    }
}
