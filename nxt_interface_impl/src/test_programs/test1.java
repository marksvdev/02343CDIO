package test_programs;

import nxt_control.INXTControl;
import nxt_control.NXTControl;

public class test1 {

	public static void main(String[] args) throws InterruptedException {
		INXTControl inc = new NXTControl();

		while (true) {
			inc.setSpeed(200, 200);
			inc.turnLeftInPlace();
			Thread.sleep(2000);
			inc.moveForward();
			Thread.sleep(2000);
			inc.setSpeed(200, 150);
			inc.moveForward();
			Thread.sleep(5000);
			inc.setSpeed(200, 200);
			inc.moveForward();
			Thread.sleep(6000);
			inc.stop();
		}
	}

}
