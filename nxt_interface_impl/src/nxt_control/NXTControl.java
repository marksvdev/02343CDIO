package nxt_control;

import lejos.nxt.Motor;

public class NXTControl implements INXTControl {

	@Override
	public void setSpeed(int speedA, int speedB) {
		Motor.A.setSpeed(speedA);
		Motor.B.setSpeed(speedB);
	}

	@Override
	public void moveForward() {
		Motor.A.forward();
		Motor.B.forward();
		Motor.A.backward();
	}

	@Override
	public void moveBackward() {
		Motor.A.backward();
		Motor.B.backward();
	}

	@Override
	public void turnRightInPlace() {
		Motor.A.forward();
		Motor.B.backward();
	}

	@Override
	public void turnLeftInPlace() {
		Motor.A.backward();
		Motor.B.forward();
	}

	@Override
	public void stop() {
		Motor.A.flt();
		Motor.B.flt();
	}
	@Override

	public void fullStop() {
		Motor.A.stop();
		Motor.B.stop();
	}

	@Override
	public void turnInPlaceAngle(int angleA, int angleB) {
		Motor.A.rotateTo(angleA);
		Motor.B.rotateTo(angleB);
	}

}
