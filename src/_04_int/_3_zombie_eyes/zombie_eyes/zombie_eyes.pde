
void setup() {
  size(500, 500);
PImage face = loadImage("zombie.jpeg");
face.resize(500,500);
image(face, 0, 0);
}
void draw() {
fill(mouseX,mouseY,mouseY);
ellipse(185,258,60,60);
fill(mouseY,mouseY,mouseX);
ellipse(323,258,60,60);
fill(#000000);
ellipse(185,258,5,5);
ellipse(323,258,5,5);



if(mousePressed){
 System.out.println(mouseX + " " + mouseY);//mouseX

 
}


}
