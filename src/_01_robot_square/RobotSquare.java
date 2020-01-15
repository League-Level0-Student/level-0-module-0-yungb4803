package _01_robot_square;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import org.jointheleague.graphical.robot.Robot;

// This recipe draws a square using the Robot

public class RobotSquare {
    public static void main(String[] args) throws Exception {
 
    	// 1. Make a new Robot
    	Robot steve = new Robot();


        // 3. Put the robot's pen down
    	steve.penDown();
    	


        // 6. Make the robot move as fast as possible
    	steve.setSpeed(100000);


        // 5. Do everything below here 4 times
    	steve.move(200);
    	steve.turn(90);
    	steve.move(200);
    	steve.turn(90);
    	steve.move(200);
    	steve.turn(90);
    	steve.move(200);
    	steve.turn(90);

        //         2. Move your robot 200 pixels
    	steve.move(200);


        //         4. Turn the robot 90 degrees to the right (90 degrees)
    	steve.turn(90);


    }
}
