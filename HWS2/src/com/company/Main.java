package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
       Flying1 flying = new Flying1();
        flying.sherkat = "bcw";
        flying.clock =  9 ;
        flying.mabda = "mashhad";
        flying.magsad = "tehran";

        Flying2 flying2 = new Flying2();
        flying2.sherkat = "adms";
        flying2.clock =  7 ;
        flying2.mabda = "rasht";
        flying2.magsad = "shiraz";

        Flying3 flying3 = new Flying3();
        flying3.sherkat = "gwr";
        flying3.clock =  5 ;
        flying3.mabda = "tehran";
        flying3.magsad = "paris";


        Flying4 flying4 = new Flying4();
        flying4.sherkat = "prt";
        flying4.clock =  10;
        flying4.mabda = "tabriz";
        flying4.magsad = "esfahan";

        Scanner input = new Scanner(System.in);
        System.out.println(" baraye moshahede sherkat ha 1");
        System.out.println("baraye moshahede clock 2");
        System.out.println(" baraye moshahede mabda va magsqsad 3");
        System.out.println(" 1 or 2 or 3 :");
        int n =input.nextInt();

        switch(n){
            case 1:
               System.out.println(flying.sherkat + " " + flying2.sherkat + " "+flying3.sherkat + " "+flying4.sherkat + " ");
                break;
            case 2:
                System.out.println(flying.clock+" ");
                System.out.println(flying2.clock+ " ");
                System.out.println(flying3.clock+ " ");
                System.out.println(flying4.clock+ " ");
                break;
            case 3:

                System.out.print("saat parvaz ra vared konid");
                int x= input.nextInt();

                if(x == 9){
                    System.out.println(flying.mabda+ " "+ flying.magsad+ " ");
                }
                if(x == 7){
                    System.out.println(flying2.mabda+ " "+ flying2.magsad+ " ");
                }
                if(x == 5){
                    System.out.println(flying3.mabda+ " "+ flying3.magsad+ " ");
                }
                if(x == 10){
                    System.out.println(flying4.mabda+ " "+ flying4.magsad+ " ");
                }


                break;
            default:

        }


    }
}
