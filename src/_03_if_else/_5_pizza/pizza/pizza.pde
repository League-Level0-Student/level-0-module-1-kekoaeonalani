PImage pepperoni;
PImage mushroom;
void setup() {
    size(600, 600);
    pepperoni = loadImage("pepperoni.png");
    
}
void draw() {
  noStroke();
    fill(209,158, 17);
    ellipse(300, 300, 200, 200);
    pepperoni.resize(30, 30);
    image(pepperoni, 200, 200);
}
