package com.zhongguo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ja {
    public static void main(String[] args) {
        int x = 20;
        int y;
        try {
            Scanner in = new Scanner(System.in);
            y = in.nextInt();
            System.out.println(x / y);
        } catch (Exception e) {
            System.out.println("no div");

        }
    }}
    
    
    
    
    package com.zhongguo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String password = "000";
            try {
                if (password.length()<4){
                    throw new Exception();
                }
            }

            catch (Exception e){
                System.out.println("Password too short");
            }


        try {
            if (password.length()<4){
                throw new Exception(password);
            }
        }
        catch (Exception e){
            System.out.println("Pasword:"+ e.getMessage()+" is too short");
        }



        Scanner reader = null;
        try {
            File file =new File("rm.txt");
            reader = new Scanner(file);
            while (reader.hasNext()) {
                int n = reader.nextInt();
                System.out.println(n * n);
            }
        }
        catch (FileNotFoundException e){
            System.out.println("File unailable");
        }
        catch (InputMismatchException e){
            System.out.println("The input must be a number");
        }
        finally {
            if(reader !=null){
                reader.close();
            }
        }
	// write your code here
    }
}
