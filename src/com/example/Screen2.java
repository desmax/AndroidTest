package com.example;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created with IntelliJ IDEA.
 * User: maxim
 * Date: 6/17/12
 * Time: 3:38 PM
 * To change this templateon use File | Settings | File Templates.
 */
public class Screen2 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main2);
        Button button = (Button)findViewById(R.id.button_next_screen2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
}
