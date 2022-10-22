PImage face;
void setup() {
  face = loadImage("face.jpeg");
face.resize(800,500);
size(800,500);
}
void draw() {
  noStroke();
image(face, 0,0);
fill(mouseY + mouseX,mouseX,mouseY);

ellipse(320,190, 50,50);
ellipse(470,170, 50,50);

fill(0,0,0);

ellipse(320,190, 25,25);
ellipse(470,170, 25,25);


}
