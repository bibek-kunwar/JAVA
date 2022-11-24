package OopJava;
/*
If subclass (child class) has the same method as declared in the parent class,
it is known as method overriding in Java.
Usage of Java Method Overriding
1.Method overriding is used to provide the specific implementation of a method
which is already provided by its superclass.
2.Method overriding is used for runtime polymorphism
 */
class A{
    public void meth2(){
        System.out.println("I am method 2 of class A");
    }
}
class B extends A{
    @Override
    public void meth2(){
        System.out.println("I am method 2 of class B");
    }
    public void meth3(){
        System.out.println("I am method 3 of class B");
    }
}


public class MethodOverriding {
    public static void main(String[] args) {
//        A a = new A();
//        a.meth2();

        B b = new B();
        b.meth2();
       // b.meth3();
    }
}
