package com.multithreading;
class mythreadrunnable1 implements Runnable{
    public void run(){
        System.out.println("I am a thread 1");
    }
}
class mythreadrunnable2 implements Runnable{
    public void run(){
        System.out.println("I am a thread 2");
    }
}
public class runnable {
    public static void main(String[] args) {
        mythreadrunnable1 bullet1= new mythreadrunnable1();
        Thread gun1= new Thread(bullet1);

        mythreadrunnable2 bullet2= new mythreadrunnable2();
        Thread gun2 = new Thread(bullet2);
        //t1.start();    -->not allowed
        //t2.start();

        gun1.start();
        gun2.start();
    }
}
