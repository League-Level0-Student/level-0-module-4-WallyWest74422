import ddf.minim.*;
Minim minim = new Minim(this); 
AudioSample doh;
AudioSample woohoo;

void setup() {
  PImage waldo = loadImage("findwaldo.jpg"); // Change this to match your file name.
  size(1000, 700);
  image(waldo, 0, 0);
  doh = minim.loadSample("homer-doh.wav"); //drag and drop from project onto sketch
  woohoo = minim.loadSample("homer-woohoo.wav"); //drag and drop from project onto sketch }
}

void draw() {
  // Use this print statement to find out the coordinates of Waldo
  //println(492+"   "+528+"   "+mouseX + "   "+507+"   "+512+ "   "+ mouseY); 
  // If the mouse is on Waldo, print “Waldo found!”
  if (mouseX>492&&mouseX<528) {
    if (mouseY>319&&mouseY<368) {
      //println("Waldo found");
    }
  }
  if (mousePressed) {
    if (mouseX>492&&mouseX<528) {
      if (mouseY>319&&mouseY<368) {
        playWoohoo();
      }
    }
  }
      if(mousePressed){
      if (mouseX<492&&mouseX>528) {
      if (mouseY<319&&mouseY>368) {
    playDoh();
      }
      }
      }
    
  // If Waldo is found, also use the method below to play “Woohoo”
  // Change the name of the sound file if you need to 
  // If the mouse is pressed and they’re not on Waldo, play “Doh”
  // Change the name of the sound file if you need to
}

void playWoohoo() {
  woohoo.stop();
  woohoo.trigger();
}

void playDoh() {
  doh.stop();
  doh.trigger();
}
