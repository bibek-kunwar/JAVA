package OopJava;
/*If a class has
multiple methods having same name but different in parameters, it is known as Method Overloading.
There are two ways to overload the method in java
By changing number of arguments
By changing the data type
 */
//By changing the number of arguments
class Adder{
    static int add(int a,int b){return a+b;}
    static int add(int a,int b,int c){return a+b+c;}
}
//by changing a data types
class Subtract{
    static int sub(int a,int b){return a-b;}
    static int sub(int a,int b,int c){return a-b-c;}
}

public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println(Adder.add(11, 11)); //changing arguments
        System.out.println(Adder.add(11, 11, 11));


        System.out.println(Subtract.sub(11,11)); //chnaging data type
        System.out.println(Subtract.sub(11,11,11));
    }
}
