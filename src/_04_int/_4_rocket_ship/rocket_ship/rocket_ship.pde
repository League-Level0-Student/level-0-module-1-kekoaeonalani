int x = 400; 
int y = 600; 

void setup() {
    size(800, 800);
    
}

void draw() {
  noStroke();
  // rocket ship drawing
    background(0, 0, 40); 
    fill(random(255), 0, 0);
    ellipse(x, y + 130, 90, 90);
    fill(248, 128, 0);
    ellipse(x, y + 115, 70, 70);
    fill(255, 153, 0);
    ellipse(x, y + 95, 35, 35);
    fill(100, 100, 100);
    triangle(x, y + 10, x + 50, y + 100, x - 50, y + 100);
    
    //move the rocket ship up
y -= 10;

//drawing the moon
fill(200,200,200);
ellipse(100,100, 100,100);

//the grey dots on the moon
fill(150,150,150);
// biggest one on the bottom right
ellipse(125,117, 40,40);
//second biggest one on the bottom left
ellipse(80,105, 30,30);
//smallest one on the top
ellipse(110,70, 15,15);
//stars
ellipse(237, 388, 5,5);
ellipse(799, 253, 5,5);
ellipse(678, 345, 5,5);
ellipse(199, 154, 5,5);
ellipse(735, 363, 5,5);
ellipse(524, 267, 5,5);
ellipse(736, 756, 5,5);
}
