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
  
  mouse.multi(0.5);
  
  translate(width/2, height/2);
  line(0, 0, mouse.x, mouse.y);
}
