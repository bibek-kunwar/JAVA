package BasicJava;

public class ControlStatements {
    public static void main(String[] args) {
        System.out.println("if statement example");
        int age = 20;

        if (age > 18) {
            System.out.print("Age is greater than 18");
        }


        System.out.println("if else Statement");

        int number = 13;
        if (number % 2 == 0) {
            System.out.println("even number");
        } else {
            System.out.println("odd number");

        }

        //Switch example
        char ch='o';
        switch(ch)
        {
            case 'a':
                System.out.println("Vowel");
                break;
            case 'e':
                System.out.println("Vowel");
                break;
            case 'i':
                System.out.println("Vowel");
                break;
            case 'o':
                System.out.println("Vowel");
                break;
            case 'u':
                System.out.println("Vowel");
                break;
            case 'A':
                System.out.println("Vowel");
                break;
            case 'E':
                System.out.println("Vowel");
                break;
            case 'I':
                System.out.println("Vowel");
                break;
            case 'O':
                System.out.println("Vowel");
                break;
            case 'U':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Consonant");
        }

        //  while loop
        int i=1;
        while(i<=10){
            System.out.println(i);
            i++;
        }
        //for loop
        System.out.println("for loop ");
        for(int x=0;x<5;x++){
            System.out.println(x);
            x++;
        }



    }
}
