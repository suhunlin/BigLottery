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
//    TextView g0,g1,g2,g3,g4,g5;
    int lotNumberLen = 6;
    TextView[] lotNumber = new TextView[lotNumberLen];
    Button b0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setViewId();
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int i=0;
                Integer[] getLotteryNum = createLottery.createLottery();
                for(Integer lotNum:getLotteryNum){
                    lotNumber[i++].setText(lotNum.toString());
                }


//                for(Integer lotNum:lotteryNum){
//                    Log.d(tag, "The lottery num " + lotNum);
//                }

            }
        });
    }

    public void setViewId(){
        lotNumber[0] = findViewById(R.id.num0);
        lotNumber[1] = findViewById(R.id.num1);
        lotNumber[2] = findViewById(R.id.num2);
        lotNumber[3] = findViewById(R.id.num3);
        lotNumber[4] = findViewById(R.id.num4);
        lotNumber[5] = findViewById(R.id.num5);
        b0 = findViewById(R.id.createLottery);
    }

}