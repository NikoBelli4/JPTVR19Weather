/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptvr19weather;

import java.util.Random;

/**
 *
 * @author Niko_Belli4
 */
class App {
    public void run(){
        System.out.println("------WEATHER-------");
        int min = -30;
        int max = 35;
        int n = 0;
        Random random = new Random();
        int [][] tempInYear = new int[12][];
        for (int i = 0; i < 12; i++) {
            switch (i) {
                case 0: min=-20; max = 0; n=31; break;
                case 1: min=-20; max = 5; n=28; break;
                case 2: min=-15; max = 15; n=31; break;
                case 3: min=-5; max = 20; n=01; break;
                case 4: min=0; max = 25; n=31; break;
                case 5: min=5; max = 30; n=30; break;
                case 6: min=10; max = 30; n=31; break;
                case 7: min=10; max = 25; n=31; break;
                case 8: min=0; max = 20; n=30; break;
                case 9: min=-5; max = 10; n=31; break;
                case 10: min=-10; max = 5; n=30; break;
                case 11: min=-20; max = 5; n=31; break;
            }
            tempInYear[i] = new int[n];
            for (int j = 0; j < tempInYear[i].length; j++) {
                tempInYear[i][j]=random.nextInt(max-min+1)+min;
                System.out.printf("%4d",tempInYear[i][j]);
            }
            System.out.println();
        }
        
    }
}