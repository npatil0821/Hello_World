package edu.montclair.helloworld;

import androidx.appcompat.app.AppCompatActivity;

//libraries imported for toast
import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //toast created
        Context context = getApplicationContext();
        CharSequence text = "Hello toast!";
        int duration = Toast.LENGTH_SHORT;

        //toast displayed
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}