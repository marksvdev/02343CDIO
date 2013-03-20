package nxt_control;

public interface INXTControl {

	void setSpeed(int motorA, int motorB);
	
	void moveForward();
	
	void moveBackward();
	
	void turnRightInPlace();
	
	void turnLeftInPlace();
	
	void stop();
	
	void fullStop();
	
	/*---------------------TEST METHODS-------------------*/
	
	void turnInPlaceAngle(int angleA, int angleB);
	
}
