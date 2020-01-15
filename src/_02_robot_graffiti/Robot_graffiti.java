package _02_robot_graffiti;

import org.jointheleague.graphical.robot.Robot;

public class Robot_graffiti {
public static void main(String[] args) {
	
	Robot Ben = new Robot();
	Ben.penDown();
	Ben.setSpeed(1000);
	Ben.move(200);
	Ben.turn(60);
	for (int i = 0; i < 25; i++) {
		Ben.move(10);
		Ben.turn(10);
	}
	

	Ben.turn(60);
	Ben.turn(-270);
	Ben.move(35);

	for (int i = 0; i <20; i++) {
		Ben.move(10);
		Ben.turn(10);
	}
	
	
	
	
	
	
	
	
	
}
}
