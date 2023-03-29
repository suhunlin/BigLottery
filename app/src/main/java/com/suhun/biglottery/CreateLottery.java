package com.suhun.biglottery;

import java.util.HashSet;
import java.util.Random;

public class CreateLottery {
    public Integer[] createLottery(){
        int lotteryNumber = 6;
        Integer[] lotteryArray = new Integer[lotteryNumber];
        HashSet<Integer> numSet= new HashSet<Integer>();
        while(numSet.size()<6){
            numSet.add(new Random().nextInt(49) + 1);
        }
        lotteryArray = numSet.toArray(new Integer[numSet.size()]);

        return lotteryArray;
    }
}
