package com.example.android.polandquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int score = 0;

    private RadioButton  christianityRadioButton, danceRadioButton, popeRadioButton, bialowiezaRadioButton, borderRadioButton, polandRadioButton;
    private EditText capitalText;
    private CheckBox pierogiCheckBox, schabowyCheckBox, bigosCheckBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       capitalText = (EditText) findViewById(R.id.capital);

       pierogiCheckBox = (CheckBox) findViewById(R.id.pierogi);
       schabowyCheckBox = (CheckBox) findViewById(R.id.schabowy);
       bigosCheckBox = (CheckBox) findViewById(R.id.bigos);

       christianityRadioButton = (RadioButton) findViewById(R.id.christianity);

       bialowiezaRadioButton = (RadioButton) findViewById(R.id.bialowieza);

       borderRadioButton = (RadioButton) findViewById(R.id.border);

       danceRadioButton = (RadioButton) findViewById(R.id.dance);

       polandRadioButton = (RadioButton) findViewById(R.id.poland);

       popeRadioButton = (RadioButton) findViewById(R.id.pope);
    }

    public void enterCapital() {
        String capital = capitalText.getText().toString();

        if(capital.equals("Warsaw")) {
            score += 1;
        }
    }

    public void onCheckBoxDishes() {
        boolean isPierogi = pierogiCheckBox.isChecked();
        boolean isSchabowy = schabowyCheckBox.isChecked();
        boolean isBigos = bigosCheckBox.isChecked();

        if(isPierogi && isBigos && isSchabowy) {
            score += 3;
        } else if (isPierogi && isBigos) {
            score += 2;
        } else if (isPierogi && isSchabowy) {
            score += 2;
        } else if (isBigos && isSchabowy) {
            score +=2;
        } else if (isBigos) {
            score += 1;
        } else if (isSchabowy) {
            score += 1;
        } else if (isPierogi) {
            score += 1;
        } else {
            score += 0;
        }
    }

    public void onRadioButtonReligion() {
        boolean isChristianity = christianityRadioButton.isChecked();


        if(isChristianity) {
            score += 1;
        }
    }

    public void onCheckBoxBison() {
        boolean isBialowieza = bialowiezaRadioButton.isChecked();

        if(isBialowieza) {
            score += 1;
        }
    }

    public void onCheckBoxBorder() {
        boolean isBorder = borderRadioButton.isChecked();

        if(isBorder) {
            score +=1;
        }
    }

    public void onRadioButtonDance() {
        boolean isDance = danceRadioButton.isChecked();

        if (isDance) {
            score += 1;
        }
    }

    public void onCheckBoxFlag() {
        boolean isPoland = polandRadioButton.isChecked();

        if(isPoland) {
            score += 1;
        }
    }

    public void onRadioButtonPope() {
        boolean isPope = popeRadioButton.isChecked();

        if(isPope) {
            score += 1;
        }
    }

    public void checkResults(View view) {
        onCheckBoxDishes();
        enterCapital();
        onRadioButtonReligion();
        onCheckBoxBison();
        onCheckBoxBorder();
        onCheckBoxFlag();
        onRadioButtonDance();
        onRadioButtonPope();


        Toast.makeText(this, "Score: " + score + " / 10", Toast.LENGTH_LONG).show();
        score = 0;
    }
}
