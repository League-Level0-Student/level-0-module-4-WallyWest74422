PImage donkey;
PImage tail;
int donkeytailposition1 = (image(tail));
int donkeytailposition2 = (mouseY);
void setup() {


size(857, 1024); 
donkey = loadImage("donkey.jpg");      //change the file name if you need to
tail = loadImage("cooltail.jpg");  
donkey.resize(width,height);
tail.resize(100, 100);     //replace width, height with your tail's dimensions
image(tail, mouseX-10, mouseY-20);
}

void draw() {
   println(mouseX,mouseY);
background (donkey);
rect(0, 0, 100, 100);
rect(590,698,150,150);
image(tail, mouseX, mouseY);
if(mousePressed){
  image(tail, donkeytailposition1, donkeytailposition2);
}}
