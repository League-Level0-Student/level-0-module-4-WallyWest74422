PImage face;
void setup() {
  face = loadImage("googlyeyes.png");
  size(800,300);
    face.resize(800,300);
   
}

void draw() {
   background(face);
   if(mouseX>131){
     mouseX=131;
   }if(mouseX<106){
     mouseX=106;
   }if(mouseY>138){
     mouseY=138;
   }if(mouseY<96){
     mouseY=96;}
     
     
fill(#FFFFFF);
  ellipse(118.5,117,25,42);
    ellipse(194,117,25,42);
  fill(#AA5A2B);
  ellipse(mouseX,mouseY,15,30);
ellipse(mouseX+75,mouseY,15,30);
  
}
