package fm.ua.ulch.horoscope;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    Button submit;
    Button btnAll;

    int day;
    int month;
    int year;
    Intent intent;
    private int sign;

    Spinner daySpinner;
    Spinner monthSpinner;
    Spinner yearSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        submit = (Button) findViewById(R.id.buttonSubmit);
        btnAll = (Button) findViewById(R.id.buttonAll);


        daySpinner = (Spinner) findViewById(R.id.days);
        monthSpinner = (Spinner) findViewById(R.id.months);
        yearSpinner = (Spinner) findViewById(R.id.years);


        ArrayAdapter<CharSequence> dayAdapter = ArrayAdapter.createFromResource(this, R.array.days, android.R.layout.simple_spinner_item);
        ArrayAdapter<CharSequence> monthAdapter = ArrayAdapter.createFromResource(this, R.array.months, android.R.layout.simple_spinner_item);
        ArrayAdapter<CharSequence> yearAdapter = ArrayAdapter.createFromResource(this, R.array.years, android.R.layout.simple_spinner_item);

        dayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        monthAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        yearAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        daySpinner.setAdapter(dayAdapter);
        monthSpinner.setAdapter(monthAdapter);
        yearSpinner.setAdapter(yearAdapter);

        daySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Object item = parent.getItemAtPosition(position);
                day = Integer.parseInt(item.toString());
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        monthSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Object item = parent.getItemAtPosition(position);
                month = position;
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        yearSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Object item = parent.getItemAtPosition(position);
                year = Integer.parseInt(item.toString());
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

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
                switch (month) {
                    case (0):
                        if (day <= 20) {
                            sign = 0;
                        } else {
                            sign = 1;
                        }
                        break;
                    case (1):
                        if (day <= 19) {
                            sign = 1;
                        } else {
                            sign = 2;
                        }
                        break;
                    case (2):
                        if (day <= 20) {
                            sign = 2;
                        } else {
                            sign = 3;
                        }
                        break;
                    case (3):
                        if (day <= 20) {
                            sign = 3;
                        } else {
                            sign = 4;
                        }
                        break;
                    case (4):
                        if (day <= 21) {
                            sign = 4;
                        } else {
                            sign = 5;
                        }
                        break;
                    case (5):
                        if (day <= 21) {
                            sign = 5;
                        } else {
                            sign = 6;
                        }
                        break;
                    case (6):
                        if (day <= 22) {
                            sign = 6;
                        } else {
                            sign = 7;
                        }
                        break;
                    case (7):
                        if (day <= 23) {
                            sign = 7;
                        } else {
                            sign = 8;
                        }
                        break;
                    case (8):
                        if (day <= 22) {
                            sign = 8;
                        } else {
                            sign = 9;
                        }
                        break;
                    case (9):
                        if (day <= 22) {
                            sign = 9;
                        } else {
                            sign = 10;
                        }
                        break;
                    case (10):
                        if (day <= 21) {
                            sign = 10;
                        } else {
                            sign = 11;
                        }
                        break;
                    case (11):
                        if (day <= 21) {
                            sign = 11;
                        } else {
                            sign = 0;
                        }
                        break;

                }
                intent = new Intent(MainActivity.this, SignActivity.class);
                intent.putExtra("sign", sign);
                startActivity(intent);
            }
        });
    }
}
