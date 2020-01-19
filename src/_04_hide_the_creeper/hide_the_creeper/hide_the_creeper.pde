import javax.swing.*;

PImage creeper;     //at the top of your program
PImage minecraft;
int creperx = 255;
int crepery = 35;

void setup() {

  size(500, 500); //in setup method
  minecraft = loadImage("creper.jpg");     //in setup method
  minecraft.resize(500, 500);          //in setup method
  //in setup method
  creeper=loadImage("creeper.png");     //in setup method
  creeper.resize(3, 3);     //in setup method
}

void draw() {

  background(minecraft);     
  image(creeper, creperx, crepery);  //in draw method  
  fill(#FF0009);
  if (mousePressed) {
    if(isNear(mouseX, creperx)&& isNear(mouseY,crepery)){
      fill(#00FF01);
      JOptionPane.showMessageDialog(null,"Congrats! You found a creper!");
  creperx=(int)random(width);
crepery=(int)random(width);
    }}
}
boolean isNear(int a, int b) {
  if (abs(a - b) < 10)
    return true;
  else
    return false;
}
