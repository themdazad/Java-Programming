package fileHandling;

import jdk.nio.mapmode.ExtendedMapMode;

import java.io.FileOutputStream;
import java.io.*;
import java.util.Scanner;

public class FileExample {
    public static void driver(){
        System.out.println("File Handling Example");

        try{
            Example1.f1();
        } catch(IOException e) {
            System.out.println("Input Output Exception.");
        }
    }
}


class Example1{
    public static void f1() throws IOException{
        FileOutputStream  fout;
        fout = new FileOutputStream("I:/Programming/Java Programming/src/files");

//        Taking input by user

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your company name: ");
        String name = sc.nextLine();

//        open and write data in file
        for(int i = 0; i<=name.length(); i++){
            fout.write(name.charAt(i));
        }
        fout.close(); // close file in which you are writing.

        System.out.println("Data stored in file.");
    }

}