package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String Ur = scan.nextLine();
        System.out.println(UrP(Ur));

    }

    public static int UrP(String Ur) {
        String[] UrP;
        UrP = Ur.split("\\+");
        int res = 0;
        for (int i = 0; i < UrP.length; i++) {
            res += UrM(UrP[i]);
        }
        return res;
    }

    public static int UrM(String UrP) {
        String[] UrM;
        UrM = UrP.split("-");
        int res = UrD(UrM[0]);
        for (int i = 1; i < UrM.length; i++) {
            res -= UrD(UrM[i]);
        }
        return res;
    }

    public static int UrD(String UrM) {
        String[] UrD;
        UrD = UrM.split("/");
        int res = UrR(UrD[0]);
        for (int i = 1; i < UrD.length; i++) {
            res /= UrR(UrD[i]);
        }
        return res;
    }

    public static int UrR(String UrD) {
        String[] UrR;
        int res = 1;
        UrR = UrD.split("\\*");
        for (int i = 0; i < UrR.length; i++) {
            res *= Integer.parseInt(UrR[i]);
        }
        return res;
    }
}
