import javax.swing.*;

PImage creeper;     //at the top of your program
PImage minecraft;
int creperx = 255;
int crepery = 35;
int creperxx = 422;
iny creperyy = 333;
void setup() {
  size(500, 500); //in setup method
  minecraft = loadImage("creper.jpg");     //in setup method
  minecraft.resize(500, 500);          //in setup method
  //in setup method
  creeper=loadImage("creeper.png");     //in setup method
  creeper.resize(5, 5);     //in setup method
}

void draw() {
  background(minecraft);     
  image(creeper, creperx, crepery);  //in draw method
  image(creeper, creperxx, crepery);   
  fill(#FF0009);
  if (mousePressed) {
    if(isNear(mouseX, creperx)&& isNear(mouseY,crepery)){
      fill(#00FF01);
      JOptionPane.showMessageDialog(null,"Congrats! You found the creper!");
    }
    ellipse(mouseX, mouseY, 5, 5);

  }
}
boolean isNear(int a, int b) {
  if (abs(a - b) < 10)
    return true;
  else
    return false;
}
