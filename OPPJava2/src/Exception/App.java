package Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("student.txt"));
            while(sc.hasNext()){
                System.out.println(sc.next());
            }
        }
        catch (FileNotFoundException e){
            System.out.println("File is not exist");
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            
        }
    }
}
