package Quan_ly_tran_dau;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        Tuong[] teamA= new Tuong[5];
        teamA[0] = new Tuong("cat", "chay");
        teamA[1] = new Tuong("B", "BB");
        teamA[2] = new Tuong("C", "CC");
        teamA[3] = new Tuong("D", "DD");
        teamA[4] = new Tuong("E", "EE");

        Tuong[] teamB= new Tuong[5];
        teamB[0] = new Tuong("D", "DD");
        teamB[1] = new Tuong("E", "EE");
        teamB[2] = new Tuong("F", "FF");
        teamB[3] = new Tuong("G", "GG");
        teamB[4] = new Tuong("H", "HH");

        ArrayList<Tran_dau> tran_daus = new ArrayList<>();
        tran_daus.add(new Tran_dau(teamA, teamB, "120p"));
    }
}
