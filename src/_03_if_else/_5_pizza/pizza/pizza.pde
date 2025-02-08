PImage pepperoni;
PImage mushroom;
PImage olive;
void setup() {
    size(300,300);
    pepperoni = loadImage("pepperoni.png");
    mushroom = loadImage("mushroom.png");
    olive = loadImage("olive.png");
    olive.resize(60,60);
}
void draw() {
    fill(#987E4E); 
    ellipse(150,150,300,300);  
    
    if(mousePressed){
    image(pepperoni,120,200);
    image(pepperoni,80,70);
    image(pepperoni,150,120);
    image(mushroom,70,200);
    image(mushroom,110,190);
    image(mushroom,205,70);
    image(mushroom,65,120);
    image(olive,30,100);
    image(olive,80,155);
    image(olive,40,70);
    image(olive,170,90);
    image(olive,110,50); 
    }
     
} 
