package com.example.omarsayed.class7;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private EditText valueA;
    private EditText valueB;
    private TextView textViewResult;

    /*  @Override
      protected void onStart() {
          super.onStart();
          Toast.makeText(this, "onStart Created", Toast.LENGTH_SHORT).show();
      }
  */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        valueA = findViewById(R.id.editText_valueA);
        valueB = findViewById(R.id.editText_valueB);
        textViewResult = findViewById(R.id.textView_result);

/*
        Toast.makeText(this, "onCreate Execute", Toast.LENGTH_SHORT).show();*/
    }
/*
    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "onResume Executed", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();

        Toast.makeText(this, "onPause Created", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "onStop Created", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Toast.makeText(this, "onRestart Executed", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "onDestroy Executed ", Toast.LENGTH_SHORT).show();
    }*/

    public void calculate(View view) {

        String strValueA = valueA.getText().toString();
        String strValueB = valueB.getText().toString();

        if (TextUtils.isEmpty(strValueA) || TextUtils.isEmpty(strValueB)) {
            Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
        } else {
            int valueA = Integer.parseInt(strValueA);
            int valueB = Integer.parseInt(strValueB);
            int result = 0;
            switch (view.getId()) {
                case R.id.button_sub:
                    result = valueA + valueB;
                    break;
                case R.id.button_div:
                    result = valueA / valueB;
                    break;
                case R.id.button_add:
                    result = valueA + valueB;
                    break;
                case R.id.button_mul:
                    result = valueA * valueB;
                    break;
            }

            textViewResult.setText(String.valueOf(result));
        }

    }

}
