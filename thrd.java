package com.multithreading;
class myThread extends Thread{
    @Override

    public void run(){
        while(true) {
            System.out.println("0");
            //System.out.println("running ");
        }
    }
}
class myThread2 extends Thread{
    @Override
    public void run(){
        while(true) {
            System.out.println("1");
            //System.out.println("running 2");
        }
    }
}
public class thrd {
    public static void main(String[] args) {
        myThread t1= new myThread();
        myThread2 t2= new myThread2();
        t1.start();//start calls run
        t2.start();

    }
}
