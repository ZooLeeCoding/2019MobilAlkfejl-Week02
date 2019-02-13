package hu.szte.mobilalk.maf_02;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int counter;
    private TextView counterView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.counter = 0;
        this.counterView = findViewById(R.id.countView);
    }

    public void toastMe(View view) {
        Context context = getApplicationContext();
        CharSequence text = getResources().getString(R.string.toast_message) +
                this.counter;
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void countMe(View view) {
        this.counter++;
        counterView.setText(String.valueOf(this.counter));
    }
}
