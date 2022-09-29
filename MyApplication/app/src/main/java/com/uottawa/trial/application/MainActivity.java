package com.uottawa.trial.application;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private enum Operator {none,add,minus,multiply,divide}
    private double data1 = 0, data2 = 0;
    private Operator optr = Operator.none;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btn0Click(View view){
        EditText eText = (EditText)findViewById(R.id.resultEdit);
        eText.setText(eText.getText()+"0");
    }
    public void btn1Click(View view){
        EditText eText = (EditText)findViewById(R.id.resultEdit);
        eText.setText(eText.getText()+"1");
    }
    public void btn2Click(View view){
        EditText eText = (EditText)findViewById(R.id.resultEdit);
        eText.setText(eText.getText()+"2");
    }
    public void btn3Click(View view){
        EditText eText = (EditText)findViewById(R.id.resultEdit);
        eText.setText(eText.getText()+"3");
    }
    public void btn4Click(View view){
        EditText eText = (EditText)findViewById(R.id.resultEdit);
        eText.setText(eText.getText()+"4");
    }
    public void btn5Click(View view){
        EditText eText = (EditText)findViewById(R.id.resultEdit);
        eText.setText(eText.getText()+"5");
    }
    public void btn6Click(View view){
        EditText eText = (EditText)findViewById(R.id.resultEdit);
        eText.setText(eText.getText()+"6");
    }
    public void btn7Click(View view){
        EditText eText = (EditText)findViewById(R.id.resultEdit);
        eText.setText(eText.getText()+"7");
    }
    public void btn8Click(View view){
        EditText eText = (EditText)findViewById(R.id.resultEdit);
        eText.setText(eText.getText()+"8");
    }
    public void btn9Click(View view){
        EditText eText = (EditText)findViewById(R.id.resultEdit);
        eText.setText(eText.getText()+"9");
    }
    public void btnClearClick(View view){
        EditText eText = (EditText)findViewById(R.id.resultEdit);
        eText.setText("");
    }
    public void btnDotClick(View view){
        EditText eText = (EditText)findViewById(R.id.resultEdit);
        eText.setText(eText.getText()+".");
    }
    public void btnAddClick(View view){
        optr = Operator.add;
        EditText eText = (EditText)findViewById(R.id.resultEdit);
        data1 = Double.parseDouble(eText.getText().toString());
        eText.setText("");
    }
    public void btnMinusClick(View view){
        optr = Operator.minus;
        EditText eText = (EditText)findViewById(R.id.resultEdit);
        data1 = Double.parseDouble(eText.getText().toString());
        eText.setText("");
    }
    public void btnDivideClick(View view){
        optr = Operator.divide;
        EditText eText = (EditText)findViewById(R.id.resultEdit);
        data1 = Double.parseDouble(eText.getText().toString());
        eText.setText("");
    }
    public void btnMultiplyClick(View view){
        optr = Operator.multiply;
        EditText eText = (EditText)findViewById(R.id.resultEdit);
        data1 = Double.parseDouble(eText.getText().toString());
        eText.setText("");
    }

    public void btnResultClick(View view){
        if (optr != Operator.none){
            EditText eText = (EditText)findViewById(R.id.resultEdit);
            data2 = Double.parseDouble(eText.getText().toString());
            double result = 0;
            if (optr == Operator.add){
                result = data1 + data2;
            } else if (optr == Operator.minus){
                result = data1 - data2;
            } else if (optr == Operator.multiply){
                result = data1 * data2;
            } else if (optr == Operator.divide){
                result = data1 / data2;
            }
            optr = Operator.none;
            data1 = result;
            if((result-(int)result) != 0){
                eText.setText(String.valueOf(result));
            } else {
                eText.setText(String.valueOf((int)result));
            }
        }
    }
}