package com.multithreading;
class mythr extends Thread{
    public mythr(String name){
        super(name);
    }
    public void run(){
        //while(true){
            System.out.println("i am a thread");
        //}
    }
}
public class threadconstructor {
    public static void main(String[] args) {
        mythr t= new mythr("thread 1");
        t.start();
        System.out.println("the id of the thread is " + t.getId());
        System.out.println("the name of the thread is " +t.getName());
    }
}
