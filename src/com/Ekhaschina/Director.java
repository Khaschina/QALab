package com.Ekhaschina;


public class Director extends Chiefs implements Runnable{


	volatile int project = 0;

	@Override
	 int salary() {
		return 50000;
	}

	@Override
	public void run() {
		//Workers.createdWorkers(whomGiveTask(randomTask()),project);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
	@Override
	public String toString() {
		return "Director";
	}
}
