package se.lexicon;

import java.io.*;

public class BufferedStream {
    public static void main (String[]args){

        File source = new File("source_folder/islamabad.jpg");
        File destination = new File("destination_folder/islamabad-copy.jpg");

        copy(source, destination);
    }

    public static void copy(File source, File destination){
    try(
        BufferedInputStream in = new BufferedInputStream(new FileInputStream(source));
        BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(destination))

    ){
        byte [] buffer = new byte[1024];
        int bytesRead;
        while ((bytesRead = in.read(buffer))>0){
        out.write(buffer,0,bytesRead);
        out.flush();
            System.out.println("buffering:"+ bytesRead);
        }

    }catch (FileNotFoundException exception){
        exception.fillInStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    }

    }


    }

