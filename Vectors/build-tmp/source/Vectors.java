import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Vectors extends PApplet {

float x = 100;
float y = 100;
float xspeed = 1;
float yspeed = 3.3f;

public void setup() {
	size(640, 360);
	background(255);
}

public void draw() {
	background(255);

	x += xspeed;
	y += yspeed;

	if ((x > width) || (x < 0)) {
		xspeed *= -1;
	}

	if ((y > height) || (y < 0)) {
		yspeed *= -1;
	}

	stroke(0);
	fill(175);
	ellipse(x, y, 16, 16);
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Vectors" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
