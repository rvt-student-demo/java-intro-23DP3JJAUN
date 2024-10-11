package lv.rvt;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("ievadi savu vardu:");
        String firstname = scanner.nextLine();

        System.out.println("ievadi savu uzvardu:");
        String lastname = scanner.nextLine();

        System.out.println("ievadi savu grupu:");
        String group = scanner.nextLine();
        System.out.println("Sveik "+ firstname + "" + lastname + "" + group);
        

    }

}
