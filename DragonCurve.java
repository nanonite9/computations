/* 
 * Filename: DragonCurve.java
 * Author: nanonite9
 */

import java.util.Scanner;

public class DragonCurve {
    public static void main(String[] args) { 
        int order = 5; // final order to print
        
        String dragon = "F";
        String bw = "F";
        String prev;

        for (int i = 0; i < order; i++) { // order 0 through 5
            prev = dragon; // to save previous input
            
            while (i == 0) { // print order 0
                System.out.println(dragon);
                break;
            }
            
            dragon += "L" + bw;
            bw = prev + "R" + bw; // repeat previous input
            System.out.println(dragon);
        }
    }
}
