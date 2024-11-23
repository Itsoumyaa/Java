import java.io.*;
import java.util.*;
public class FileHandling {
    public static void main(String[] args) {
        String filepath="example.txt";
        try(FileReader fileReader=new FileReader(filepath)){
            System.out.println("File opened successfully.");
            int character;
            while((character=fileReader.read())!=-1){
                System.out.println((char) character);
            }
        } catch(FileNotFoundException e){
            System.err.println("Error: File not found. Make sure the file path is correct.");
            e.printStackTrace();
        }
        catch(IOException e){
            System.err.println("Error: An IOException occurred while reading the file.");
            e.printStackTrace();
        }
        System.out.println("Program finished");
    }
}
