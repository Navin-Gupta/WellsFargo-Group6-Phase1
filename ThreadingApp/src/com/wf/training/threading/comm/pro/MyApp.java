package com.wf.training.threading.comm.pro;


class Box{
	private int count;
	public Box() {
		this.count = 0;
	}
	
	synchronized public void put() {
		if(this.count > 0) {
			try {
				// wait();
				wait(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		// if(this.count > 0) {}
		this.count++;
		System.out.println("Produced : " + this.count);
		notify();
	}
	
	synchronized public void get() {
		if(this.count == 0) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.count--;
		System.out.println("Consumed : " + this.count);
		notify();
	}
}

class Producer extends Thread{
	Box box;
	public Producer(Box box) {
		this.box = box;
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(80);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			box.put();
		}
	}
}

class Consumer extends Thread{
	Box box;
	public Consumer(Box box) {
		this.box = box;
	}
	
	@Override
	public void run() {
		while(true) {
			box.get();
			try {
				Thread.sleep(120);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class MyApp {

	public static void main(String[] args) {
		Box box  = new Box();
		Producer producer = new Producer(box);
		Consumer consumer = new Consumer(box);
		
		producer.start();
		consumer.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Main Terminated...");

	}

}
