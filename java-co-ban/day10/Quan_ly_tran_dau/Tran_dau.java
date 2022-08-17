package Quan_ly_tran_dau;

import java.util.ArrayList;
import java.util.Arrays;

public class Tran_dau {
    private Tuong[] teamA;
    private Tuong[] teamB;
    private String times;

    public Tran_dau(Tuong[] teamA, Tuong[] teamB, String times){
        this.teamA = teamA;
        this.teamB = teamB;
        this.times = times;
    }


    public void printInfo(){
        System.out.printf("teamA: %s\n teamB: %s\n time: %s\n", this.teamA, this.teamB, this.times);
    }
}
