package fm.ua.ulch.horoscope;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;

public class MainActivity extends AppCompatActivity {
    Button submit;
    Button btnAll;

    Intent intent;
    private int sign;

    DatePicker datePicker;
    Sign mSign;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        submit = (Button) findViewById(R.id.buttonSubmit);
        btnAll = (Button) findViewById(R.id.buttonAll);

        datePicker = (DatePicker) findViewById(R.id.datePicker);
        mSign = new Sign();

        btnAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(MainActivity.this, SignActivity.class);
                intent.putExtra("sign", 0);
                startActivity(intent);
            }
        });
        submit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                sign = mSign.getSign(datePicker.getDayOfMonth(), datePicker.getMonth());
                intent = new Intent(MainActivity.this, SignActivity.class);
                intent.putExtra("sign", sign);
                startActivity(intent);
            }
        });
    }
}
