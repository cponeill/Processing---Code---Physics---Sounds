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

public class two extends PApplet {

class Walker {
	float x, y;

	float tx, ty;

	Walker() {
		tx = 0;
		ty = 10000;
	}

	public void step() {
		x = map(noise(tx), 0, 1, 0, width);
		y = map(noise(ty), 0, 1, 0, height);

		tx += 0.01f;
		ty += 0.01f;
	}
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "two" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
