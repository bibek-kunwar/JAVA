package OopJava;


class MyEmployee{
    //int id;       //private acess modifier we need methods as setter and getter
    //String name;
    private int id;
    private String name;

    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name = n;
    }
    public void setId(int i){
        this.id = i;
    }
    public int getId(){
        return id;
    }
}
public class GetSet {
    public static void main(String[] args) {
        MyEmployee harry = new MyEmployee();
        /*

   // MyEmployee emp1=new MyEmployee();
   // MyEmployee emp2=new MyEmployee();
   // emp1.id=45;                                   this is for public modifier
   // emp1.name="Hira";
   // emp2.id=46;
   // emp2.name="bibek";

         */
        harry.setName("Bibek");
        System.out.println(harry.getName());
        harry.setId(234);
        System.out.println(harry.getId());
    }
}