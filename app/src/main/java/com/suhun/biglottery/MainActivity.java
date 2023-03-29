package com.suhun.biglottery;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String tag = MainActivity.class.getSimpleName();
    CreateLottery createLottery = new CreateLottery();
    TextView g0,g1,g2,g3,g4,g5;
    Button b0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setViewId();
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer[] lotteryNum = createLottery.createLottery();
                g0.setText(lotteryNum[0].toString());
                g1.setText(lotteryNum[1].toString());
                g2.setText(lotteryNum[2].toString());
                g3.setText(lotteryNum[3].toString());
                g4.setText(lotteryNum[4].toString());
                g5.setText(lotteryNum[5].toString());
                for(int i=0; i<lotteryNum.length;i++){
                    Log.d(tag, "The lottery num " + lotteryNum[i]);
                }
            }
        });
    }

    public void setViewId(){
        g0 = findViewById(R.id.num0);
        g1 = findViewById(R.id.num1);
        g2 = findViewById(R.id.num2);
        g3 = findViewById(R.id.num3);
        g4 = findViewById(R.id.num4);
        g5 = findViewById(R.id.num5);
        b0 = findViewById(R.id.createLottery);
    }

}