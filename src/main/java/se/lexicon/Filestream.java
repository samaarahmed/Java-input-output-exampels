package se.lexicon;

import java.io.*;

public class Filestream {
    public static void main(String[] args) {

        File source = new File("source_folder/islamabad.jpg");
        File destination = new File("destination_folder/islamabad-copy.jpg");

        copy(source, destination);
    }

    public static void copy(File source, File destination) {
        try {
            FileInputStream in = new FileInputStream(source);
            FileOutputStream out = new FileOutputStream(destination);
        int b;
        while ((b=in.read())!= -1){
            out.write(b);
            System.out.println("writing b:"+b);
        }

        } catch (FileNotFoundException ex) {
            ex.fillInStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}