package com.example.multithread.threadsafe;

public class Service {
    private String userName;
    private String password;
    private String anyString = new String();
    public void setUserNamePassword(String userNameParam, String passwordParam) {
        try {
            synchronized (anyString) {
                System.out.println("thread name: " + Thread.currentThread().getName() + " enter synchronized code at time: " + System.currentTimeMillis());
                userName = userNameParam;
                Thread.sleep(3000);
                password = passwordParam;
                System.out.println("thread name: " + Thread.currentThread().getName() + ", user name: " + userName + ", password: " + password);
                System.out.println("thread name: " + Thread.currentThread().getName() + " exit synchronized code at time: " + System.currentTimeMillis());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
