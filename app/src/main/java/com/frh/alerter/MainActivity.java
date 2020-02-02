package com.frh.alerter;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;

import com.tapadoo.alerter.Alerter;

public class MainActivity extends AppCompatActivity {

    Button btnAlerter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnAlerter = findViewById(R.id.btn_alerter);
        btnAlerter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alerter();
            }
        });
    }

    private void alerter() {
        Alerter.create(MainActivity.this)
                .setTitle("Alert Title")
                .setText("The alert scales to accommodate larger bodies of text. " +
                        "The alert scales to accommodate larger bodies of text. " +
                        "The alert scales to accommodate larger bodies of text.")

                //Settitle font
                .setTitleAppearance(R.style.AlertTextAppearance_Title)
                .setTitleTypeface(Typeface.createFromAsset(getAssets(), "sublimeregular.ttf"))

                //Settext font
//                .setTextAppearance(R.style.AlertTextAppearance_Text)
//                .setTextTypeface(Typeface.createFromAsset(getAssets(), "ScopeOne-Regular.ttf"))

                //enable swiptodismiss
                .enableSwipeToDismiss()

                //enable progress
//                .enableProgress(true)
//                .setProgressColorRes(R.color.colorAccent)

                .setBackgroundColorRes(R.color.colorAccent) // or setBackgroundColorInt(Color.CYAN)
                .setIconColorFilter(0) // Optional - Removes white tint
                .show();
    }
}
