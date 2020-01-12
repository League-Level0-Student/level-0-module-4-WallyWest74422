PImage donkey;
PImage tail;
int donkeytailposition1 = (mouseX);
int donkeytailposition2 = (mouseY);
import ddf.minim.*;          //at the very top of your sketch
AudioSample woohooSound;          //at the top of your sketch
boolean playSound = true;          //at the top of your sketch
void setup() {
textSize(24);
text("try to pin the tail on the Donkey!",100,20);

size(857, 1024); 
donkey = loadImage("donkey.jpg");      //change the file name if you need to
tail = loadImage("cooltail.jpg");  
donkey.resize(width,height);
tail.resize(100, 100);     //replace width, height with your tail's dimensions
image(tail, mouseX-10, mouseY-20);
Minim minim = new Minim(this);     //In the setup method
woohooSound = minim.loadSample("homer-woohoo.wav");     //In setup. Change the file name if you need to
}

void draw() {
   println(mouseX,mouseY);
background (donkey);
rect(0, 0, 100, 100);
rect(590,698,150,150);
image(tail, mouseX, mouseY);
if(dist(0, 0, mouseX, mouseY) < 100){
  background (donkey);
}else{
  background(#00D7FF);}

if(mousePressed){
  image(tail, donkeytailposition1, donkeytailposition2);
  



// put these lines where you want the sound to play
if (playSound) {
     woohooSound.trigger();
     playSound = false;
}
}}
