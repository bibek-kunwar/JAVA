package ATM;

import java.util.Scanner;

public class Main {
    public static  void main(String[] args){
        int atmnumber=12345;
        int atmpin=123;
        Scanner in=new Scanner(System.in);
        System.out.println("enter your atm number");
        int atmNumber=in.nextInt();
        System.out.println("enter Pin");
        int pin=in.nextInt();
        if((atmnumber==atmNumber)&&(atmpin==pin) ){

            System.out.println("1. View avaiable Blance \n2.Withdraw Amounth\n3.Depoite Amounth\n4. view the ministatment \n 5.exit");
            System.out.println("enter your choice ");
            int ch=in.nextInt();
            if(ch==1){
                
            } else if (ch==2) {
                
            } else if (ch==3) {
                
            } else if (ch==4) {
                
            } else if (ch==5) {
                System.out.println("collect your ATM  thank you!");
                System.exit(0);
            }
        }
        else {
            System.out.println("Incorrect password");
            System.exit(0);
        }
    }
}
