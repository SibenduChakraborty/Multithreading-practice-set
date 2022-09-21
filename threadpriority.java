package com.multithreading;
class mythred implements Runnable{
    public void run(){
        System.out.println("this is a thread");
    }
}
public class threadpriority {
    public static void main(String[] args) {
        mythred t1= new mythred();
        mythred t2= new mythred();
        Thread tt1= new Thread(t1);
        Thread tt2= new Thread(t2);
        tt1.start();
        tt2.start();
    }
}
