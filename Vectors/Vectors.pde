/* I still have a lot to add to this code. */

PVector location;
PVector velocity;

void setup() {
  size(640, 360);
  location = new PVector(100, 100);
  veloctiy = new PVector(2.5, 5);
}

void sub(PVector, v) {
  x -= v.x
  y -= y.x;
}

void draw() {
  background(255);
  
  PVector mouse = new PVector(mouseX, mouseY);
  PVector center = new PVector(width/2, height/2);
  
  mouse.sub(center);
  translate(width/2,height/2);
  
  location.add(velocity);
  
  if ((location.x > width) || (location.x < 0)) {
  	velocity.x *= -1;
  }
  if ((location.y > height) || (location.y < 0)) {
  	velocity.y *= -1;
  }
  
  stroke(0);
  fill(175);
  ellipse(location.x, location.y, 16, 16);
}
