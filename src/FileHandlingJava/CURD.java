package FileHandlingJava;

import java.io.File;

public class CURD {
    public static void main(String[] args) {
        /*

        File myFile = new File("CWH_file1.txt");
        try {
            myFile.createNewFile();
            System.out.println("File created successfully.");
        }
        catch (IOException e) {
            e.printStackTrace();
        }



        // code to write a file
        try {
            FileWriter f=new FileWriter("myfile.txt");
            f.write("we are writing on a create file myfile.txt");
            f.close(); //when open a file we must be close after operation
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        //reading a file
        File f=new File("myfile.txt");
        try {
            Scanner sc= new Scanner(f);
            while (sc.hasNextLine()){
                String line = sc.nextLine(); //creating object
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


         */
        File f=new File("CWH_file1.txt");
        if(f.delete()){
            System.out.println("i have deleted this file"+f.getName());

        }
        else {
            System.out.println("some problem occur to delete a file");
        }

    }

}
