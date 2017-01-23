package com.example.rishabh.thematrix;

import android.content.Intent;
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





    public void calc(View view) {
        EditText a10,b10,c10,a20,b20,c20,a30,b30,c30;
        String a11,b11,c11,a22,b22,c22,a33,b33,c33;
        int a1,b1,c1,a2,b2,c2,a3,b3,c3;
        float det;

        a10 = (EditText) findViewById(R.id.editText1);
        a11 = a10.getText().toString();
        a1 = Integer.parseInt(a11);

        b10 = (EditText) findViewById(R.id.editText2);
        b11 = b10.getText().toString();
        b1 = Integer.parseInt(b11);

        c10 = (EditText) findViewById(R.id.editText3);
        c11 = c10.getText().toString();
        c1 = Integer.parseInt(c11);

        a20 = (EditText) findViewById(R.id.editText4);
        a22 = a20.getText().toString();
        a2 = Integer.parseInt(a22);

        b20 = (EditText) findViewById(R.id.editText5);
        b22 = b20.getText().toString();
        b2 = Integer.parseInt(b22);

        c20 = (EditText) findViewById(R.id.editText6);
        c22 = c20.getText().toString();
        c2 = Integer.parseInt(c22);

        a30 = (EditText) findViewById(R.id.editText7);
        a33 = a30.getText().toString();
        a3 = Integer.parseInt(a33);

        b30 = (EditText) findViewById(R.id.editText8);
        b33 = b30.getText().toString();
        b3 = Integer.parseInt(b33);

        c30 = (EditText) findViewById(R.id.editText9);
        c33 = c30.getText().toString();
        c3 = Integer.parseInt(c33);

        det=a1*(b2*c3 - b3*c2) - b1*(a2*c3 - a3*c2)+ c1*(a2*b3 - a3*b2);
        setContentView(R.layout.activity_main);
        TextView tv=(TextView)findViewById(R.id.textView2);
        tv.setText("The determinant of the matrix is: "+det);
    }

public void start(View view){
    Intent i=new Intent(this,inverse.class);
    startActivity(i);
}
    }
