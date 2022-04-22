package com.example.multithread.singleton;

import java.io.*;

public class SaveAndReadRun {
    public static void main(String[] args) {
        try {
            String fileName = "MyObjectFile.txt";
            // save
            MyObject myObject = MyObject.getInstance();
            FileOutputStream fileOutputStream = new FileOutputStream(new File(fileName));
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(myObject);
            objectOutputStream.close();
            fileOutputStream.close();
            System.out.println(myObject.hashCode());

            // read
            FileInputStream fileInputStream = new FileInputStream(new File(fileName));
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            MyObject readObject = (MyObject) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
            System.out.println(readObject.hashCode());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
