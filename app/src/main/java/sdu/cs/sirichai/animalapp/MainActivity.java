package sdu.cs.sirichai.animalapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Explicit
    EditText userEditText, passEditText;
    Button loginButton;
    String userString, passString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ผูกตัวแปร java กับ XML
        userEditText = findViewById(R.id.edtUsername);
        passEditText = findViewById(R.id.edtPassword);
        loginButton = findViewById(R.id.btnLogin);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //รับค่า Username&password
                userString = userEditText.getText().toString().trim();
                passString = passEditText.getText().toString().trim();

                //cleck ค่าว่าง
                if ((userString.length() == 0) || (passString.length() == 0)) {
                    Toast.makeText(getApplicationContext(), "กรุณากรอกข้อมูลในครบทุกช่อง", Toast.LENGTH_SHORT).show();
                } else {//ถ้าข้อมูลไม่ว่าง

                    // Cleck password
                    if ((passString.equals("1234"))) {
                        Toast.makeText(getApplicationContext(), "ยันดีต้อนรับ " + userString, Toast.LENGTH_SHORT).show();

                        //ส่งข้อมูลไปหน้า MenuGame
                        Intent Intent = new Intent(MainActivity.this, GameActivity.class);
                        //ส่งข้อมูล
                        Intent.putExtra("name", userString);
                        //เริ่มส่งข้อมูล
                        startActivity(Intent);
                    } else {
                        Toast.makeText(getApplicationContext(),"กรอกข้อมูลไม่ถูกต้อง", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

    }//end OnCreate
}//end Class
