package OopJava;


class  Employee{
    int id;
    String name;
    public  void Display(){
        System.out.println("My ID is :"+ id);
        System.out.println("My name is :"+ name);
    }
}
public class ClassBasic {
    public  static  void main(String[] args){
        System.out.println("this is a custom class");

        Employee emp1 =new Employee();
        Employee emp2=new Employee();
        emp1.id=1;
        emp1.name="Hira kali";
        emp2.id=2;
        emp2.name="bibek";

        emp1.Display();
        emp2.Display();
    }

}
