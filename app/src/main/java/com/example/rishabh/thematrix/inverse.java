package com.example.rishabh.thematrix;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class inverse extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inverse);
    }

    public void calc(View view) {
        EditText a10, b10, c10, a20, b20, c20, a30, b30, c30;
        String a11, b11, c11, a22, b22, c22, a33, b33, c33;
        int a1, b1, c1, a2, b2, c2, a3, b3, c3, det, inverse;
                float A1,B1,C1,A2,B2,C2,A3,B3,C3;

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
        det = a1 * (b2 * c3 - b3 * c2) - b1 * (a2 * c3 - a3 * c2) + c1 * (a2 * b3 - a3 * b2);
        A1=(b2 * c3 - b3 * c2)/det;
        A2=-(b1*c3 - b3*c1)/det;
        A3=(b1*c2-b2*c1)/det;
        B1=-(a2 * c3 - a3 * c2)/det;
        B2=(a1*c3-c1*a3)/det;
        B3=-(a1*c2-a2*c1)/det;
        C1=(a2*b3-b2*a3)/det;
        C2=-(a1*b3-a3*b1)/det;
        C3=(a1*b2-a2*b1)/det;


        setContentView(R.layout.activity_inverse);
        TextView tv=(TextView)findViewById(R.id.textView2);
        tv.setText("The inverse of the matrix is: "+System.getProperty("line.separator")+ A1+ "  "+ A2+"  " +A3+ System.getProperty("line.separator")+B1+ "  "+ B2+"  " +B3+ System.getProperty("line.separator")+C1+ "  "+ C2+"  " +C3+ System.getProperty("line.separator"));


    }
}