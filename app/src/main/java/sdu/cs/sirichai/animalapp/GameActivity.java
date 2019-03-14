package sdu.cs.sirichai.animalapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;

public class GameActivity extends AppCompatActivity {

    //Explicit ประกาศตัวแปร
    Button btn1,btn2,btn3,btn4;
    ImageView questionImageView;
    ImageButton volumeImageButton;
    MediaPlayer mediaPlayer; //ตัวแปรเล่นเสียง
    int questionCount = 10; //ตัวแปรกำหนดจำนวนข้อ
    ArrayList<Integer> qid = new ArrayList<Integer>(); //ตัวแปร random โจทย์
    String answer; //ตัวแปรเก็บคำตอบ
    int score = 0; //ตัวแปรเก็บคะแนน

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

        //กำหนดคำสั่งในการ random โจทย์
        for (int i = 1; i <= questionCount; i++) {
            qid.add(i); //จองพื้นที่หน่ยวความจำบน Memory
        }//end for
        Collections.shuffle(qid); //set การ random โจทย์
        setQuestion(qid.remove(0)); //เมื่อ random โจทย์ไห้ pop ออกจาก array

    }//end onCreate

    private void setQuestion(int qid) { //method setQuestion สำหรับแสดงคำถาม
        if (qid == 1) {
            answer = "นก";
            questionImageView.setImageResource(R.drawable.bird);//แสดงรูปเงา
            mediaPlayer = MediaPlayer.create(this, R.raw.bird); //แสดงเสียงสัตว์

            ArrayList<String> choice = new ArrayList<String>(); //Array สำหรับ random choice
            choice.add("นก");
            choice.add("วัว");
            choice.add("หมา");
            choice.add("ยุง");
            Collections.shuffle(choice); //set การ random choice
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }//end if

        if (qid == 2) {
            answer = "แมว";
            questionImageView.setImageResource(R.drawable.cat);//แสดงรูปเงา
            mediaPlayer = MediaPlayer.create(this, R.raw.cat); //แสดงเสียงสัตว์

            ArrayList<String> choice = new ArrayList<String>(); //Array สำหรับ random choice
            choice.add("แมว");
            choice.add("ยุง");
            choice.add("สิงโต");
            choice.add("หมา");
            Collections.shuffle(choice); //set การ random choice
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }//end if

        if (qid == 3) {
            answer = "วัว";
            questionImageView.setImageResource(R.drawable.cow);//แสดงรูปเงา
            mediaPlayer = MediaPlayer.create(this, R.raw.cow); //แสดงเสียงสัตว์

            ArrayList<String> choice = new ArrayList<String>(); //Array สำหรับ random choice
            choice.add("วัว");
            choice.add("แกะ");
            choice.add("ช้าง");
            choice.add("หมู");
            Collections.shuffle(choice); //set การ random choice
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }//end if

        if (qid == 4) {
            answer = "หมา";
            questionImageView.setImageResource(R.drawable.dog);//แสดงรูปเงา
            mediaPlayer = MediaPlayer.create(this, R.raw.dog); //แสดงเสียงสัตว์

            ArrayList<String> choice = new ArrayList<String>(); //Array สำหรับ random choice
            choice.add("หมา");
            choice.add("แมว");
            choice.add("แกะ");
            choice.add("ม้า");
            Collections.shuffle(choice); //set การ random choice
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }//end if

        if (qid == 5) {
            answer = "ช้าง";
            questionImageView.setImageResource(R.drawable.elephant);//แสดงรูปเงา
            mediaPlayer = MediaPlayer.create(this, R.raw.elephant); //แสดงเสียงสัตว์

            ArrayList<String> choice = new ArrayList<String>(); //Array สำหรับ random choice
            choice.add("ช้าง");
            choice.add("ม้า");
            choice.add("วัว");
            choice.add("สิงโต");
            Collections.shuffle(choice); //set การ random choice
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }//end if

        if (qid == 6) {
            answer = "ม้า";
            questionImageView.setImageResource(R.drawable.horse);//แสดงรูปเงา
            mediaPlayer = MediaPlayer.create(this, R.raw.horse); //แสดงเสียงสัตว์

            ArrayList<String> choice = new ArrayList<String>(); //Array สำหรับ random choice
            choice.add("ม้า");
            choice.add("นก");
            choice.add("หมา");
            choice.add("แกะ");
            Collections.shuffle(choice); //set การ random choice
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }//end if

        if (qid == 7) {
            answer = "สิงโต";
            questionImageView.setImageResource(R.drawable.lion);//แสดงรูปเงา
            mediaPlayer = MediaPlayer.create(this, R.raw.lion); //แสดงเสียงสัตว์

            ArrayList<String> choice = new ArrayList<String>(); //Array สำหรับ random choice
            choice.add("สิงโต");
            choice.add("หมู");
            choice.add("นก");
            choice.add("แมว");
            Collections.shuffle(choice); //set การ random choice
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }//end if

        if (qid == 8) {
            answer = "ยุง";
            questionImageView.setImageResource(R.drawable.mosquito);//แสดงรูปเงา
            mediaPlayer = MediaPlayer.create(this, R.raw.mosquito); //แสดงเสียงสัตว์

            ArrayList<String> choice = new ArrayList<String>(); //Array สำหรับ random choice
            choice.add("ยุง");
            choice.add("ม้า");
            choice.add("แมว");
            choice.add("ช้าง");
            Collections.shuffle(choice); //set การ random choice
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }//end if

        if (qid == 9) {
            answer = "หมู";
            questionImageView.setImageResource(R.drawable.pig);//แสดงรูปเงา
            mediaPlayer = MediaPlayer.create(this, R.raw.pig); //แสดงเสียงสัตว์

            ArrayList<String> choice = new ArrayList<String>(); //Array สำหรับ random choice
            choice.add("หมู");
            choice.add("สิงโต");
            choice.add("ยุง");
            choice.add("นก");
            Collections.shuffle(choice); //set การ random choice
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }//end if

        if (qid == 10) {
            answer = "แกะ";
            questionImageView.setImageResource(R.drawable.sheep);//แสดงรูปเงา
            mediaPlayer = MediaPlayer.create(this, R.raw.sheep); //แสดงเสียงสัตว์

            ArrayList<String> choice = new ArrayList<String>(); //Array สำหรับ random choice
            choice.add("แกะ");
            choice.add("หมา");
            choice.add("หมู");
            choice.add("วัว");
            Collections.shuffle(choice); //set การ random choice
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }//end if
    }//end setQuestion

    public void playSound(View view) { //method แสดงเสียง
        mediaPlayer.start();
    }//end playSound

    public void choiceAns(View view) { //method ตรวจคำตอนและรวมคะแนน

        Button button = (Button) view;
        String buttonString = button.getText().toString(); //เก็บข้อความบนปุ่มที่เลือก

        if (buttonString.equals(answer)) { //ถ้าคำตอนที่เลือกตรงกับ answer
            score++; //เพิ่มทีละ 1 คะแนน
        }

        if (qid.isEmpty()) { //ถ้าทำครบทุกข้อ
            //Toast.makeText(getApplicationContext(), "คุณได้ " + score + " คะแนน", Toast.LENGTH_SHORT).show();
            dialogboxScore();
        } else {//ถ้ายังไม่ครบทำต่อ
            setQuestion(qid.remove(0));
        }
    }//end choiceAns

    private void dialogboxScore() { //แสดงคะแนนในรูป DialogBox
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("สรุปคะแนน");
        builder.setMessage("คุณได้ " + score + " คะแนน")
            .setCancelable(false)
            .setPositiveButton("เล่นอีกครั้ง", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Intent intent = getIntent();
                    finish();
                    startActivity(intent);
                }
            })
            .setNegativeButton("ออกไป!!!", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    finish();
                }
            });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }//end dialogboxScore
}//end Class
