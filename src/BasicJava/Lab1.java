package BasicJava;

public class Lab1 {

        public static void main(String[] args) {
            String name= new String(" bibek");
            System.out.print("My name is  :");
            System.out.println(name);

//same code like c
            int a=6;
            float b=5.9f;
            System.out.printf("the value of a is %d ans the value of b is %f:",a,b);

            // java variables  add two numbers
            int x=5;
            int y=6;
            int z=x+y;
            System.out.printf("the value of x is %d and the value of y is %d" ,x,y);
            System.out.println();
            System.out.println(z);
        int d=6;
        float f=5.7f;
        float e=f;
         e=d+f;
        System.out.println(e);

        //unary operator
            int g=10;
            System.out.println(g++);
            System.out.println(++g);
            System.out.println(g--);
            System.out.println(--g);

            //Arthametic operator
            int i=7;
            int j=8;
            int k=7;
            System.out.println("The arthametic of the i andj are ");
            System.out.println(i+j);
            System.out.println(i-j);
            System.out.println(i*j);
            System.out.println(i/j);
            System.out.println(i%j);


            // AND Operator
            System.out.println("And operator are ");
            System.out.println(i<j&&i<k);
            System.out.println(i<j&i<k);
            //Or operator
            System.out.println("Or operator");
            System.out.println(i>j||i<k);
            System.out.println(i>j|i<k);








        }

}
