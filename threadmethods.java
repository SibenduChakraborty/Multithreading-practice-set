package com.multithreading;
class thread3 extends Thread{
    public void run(){
        while(true) {
            System.out.println("running");
        }
    }
}
public class threadmethods {
    public static void main(String[] args) {
        thread3 t= new thread3();
        thread3 t2= new thread3();
        t.start();
        try{
            t.join();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        t2.start();
    }
}
