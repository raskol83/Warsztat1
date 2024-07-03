package pl.coderslab;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        {
            File file = new File("C:\\Users\\Laptop\\Warsztat1\\TaskManager\\src\\main\\java\\pl\\coderslab\\filetoread.txt");
            Scanner in = null;
            try {
                in = new Scanner(file);
                while (in.hasNext()) {
                    String line = in.nextLine();
                    System.out.println(line);
                }
            } catch (FileNotFoundException e) {

                e.printStackTrace();
            }

        }
    }}