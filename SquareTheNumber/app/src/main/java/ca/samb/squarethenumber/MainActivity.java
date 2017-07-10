package ca.samb.squarethenumber;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    protected void calculate(View v){

        //Get Input and Output controls
        //EditText Input = (EditText) findViewById(R.id.etInput);
        //TextView OutPut = (TextView) findViewById(R.id.tvOutput);

        // Process data
        boolean test;
        test = isInteger(Input.getText().toString(),10);
        if(test==true){
            int base = Integer.valueOf(Input.getText().toString());
            int Result;

            Result = base*base;
            String FormattedResult = String.format("%,d",Result);

            //Output the result
            OutPut.setText("Result: " + FormattedResult);
        }
        else{
            OutPut.setText("Result: ERROR");
        }




    }

    public static boolean isInteger(String s, int radix) {
        if(s.isEmpty()) return false;
        for(int i = 0; i < s.length(); i++) {
            if(i == 0 && s.charAt(i) == '-') {
                if(s.length() == 1) return false;
                else continue;
            }
            if(Character.digit(s.charAt(i),radix) < 0) return false;
        }
        return true;
    }


}
