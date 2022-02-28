package com.peaksoft;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Oblastar oblast1 = Oblastar.BATKEN;
        System.out.println(oblast1.getOzgocholuktor());

        Oblastar oblast2 = Oblastar.OSH;
        System.out.println(oblast2.getOzgocholuktor());

        Oblastar oblast3 = Oblastar.JALALABAD;
        System.out.println(oblast3.getOzgocholuktor());

        Oblastar oblast4 = Oblastar.TALAS;
        System.out.println(oblast4.getOzgocholuktor());

        Oblastar oblast5 = Oblastar.NARYN;
        System.out.println(oblast5.getOzgocholuktor());

        Oblastar oblast6 = Oblastar.YSYK_KOL;
        System.out.println(oblast6.getOzgocholuktor());

        Oblastar oblast7 = Oblastar.CHUY;
        System.out.println(oblast7.getOzgocholuktor());



        Oblastar[] oblast = Oblastar.values();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter regions name: ");
        String nameOblast = scanner.nextLine();

        for (Oblastar regions : oblast) {
            if (regions.name().equalsIgnoreCase(nameOblast)) {
                System.out.println(regions);
            }
        }

    }
}
