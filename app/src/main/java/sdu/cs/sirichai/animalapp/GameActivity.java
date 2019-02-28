package sdu.cs.sirichai.animalapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class GameActivity extends AppCompatActivity {

    //Explicit
    Button btn1,btn2,btn3,btn4;
    ImageView questionImageView;
    ImageButton volumeImageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        //ผูกตัวแปรบน java กับ id บน xml
        btn1 = findViewById(R.id.btm1);
        btn2 = findViewById(R.id.btm2);
        btn3 = findViewById(R.id.btm3);
        btn4 = findViewById(R.id.btm4);
        questionImageView = findViewById(R.id.imvQuestion);
        volumeImageButton = findViewById(R.id.imbVolume);

    }//end onCreate
}//end Class
