package com.example.multithread.threadsafe;

public class LoginServlet {
    private static String userNameRef;
    private static String passwordRef;

    synchronized public static void doPost(String userName, String password) {
        try {
            userNameRef = userName;
            if ("a".equals(userName)) {
                Thread.sleep(1000);
            }
            passwordRef = password;
            System.out.println("userName = " + userNameRef + ", password = " + passwordRef);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
