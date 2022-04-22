package com.example.multithread.threadsafe;

public class UserInfoService {
    public void serviceFunctionA(UserInfo userInfo) {
        synchronized (userInfo) {
            try {
                System.out.println(Thread.currentThread().getName() + " user name=" + userInfo.getUserName());
                userInfo.setUserName("asdf");
                Thread.sleep(3000);
                System.out.println(Thread.currentThread().getName() + " end time=" + System.currentTimeMillis());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
