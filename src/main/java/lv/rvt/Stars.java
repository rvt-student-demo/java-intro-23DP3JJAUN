package lv.rvt;

import java.util.*;

public class Stars 
{
    public static void ChristmasTree( int height )
    {
        // Mes taisam seit musu uzdevumus   
        for (int i=0; i < height; i++) {
            printSpaces(height - i);
            printStars(i * 2 + 1);
            System.out.println();
        }
        for( int i = 0; i < 2; i++) {
            printSpaces(height - 1);
            printStars(number:3);
            System.out.println();    
        }
    }
    

}
