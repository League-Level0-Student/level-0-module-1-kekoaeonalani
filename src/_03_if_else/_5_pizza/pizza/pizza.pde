PImage pepperoni;
PImage mushroom;
void setup() {
    size(600, 600);
    pepperoni = loadImage("pepperoni.png");
    mushroom = loadImage("mushroom.png");
    noStroke();
    fill(209,158, 17);
    ellipse(300, 300, 200, 200);
}
void draw() {
  
    if (mousePressed && (mouseButton == LEFT)){
    pepperoni.resize(30, 30);
    image(pepperoni, random  (200, 350) , random (200, 330));
    }
    if (mousePressed && (mouseButton == RIGHT)){
      mushroom.resize(30,30);
      image(mushroom, random (200, 350) , random (200, 330));

    }
}
