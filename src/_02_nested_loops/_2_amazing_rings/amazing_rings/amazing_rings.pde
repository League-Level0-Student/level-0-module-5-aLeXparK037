int xOne = 600;
int xTwo = 200;
void setup() {
  size (800,800);
  
  
}

void draw() {
  background(#124DDE);
  for (int i = 0; i < 25; i++){
    noFill();
  ellipse(xOne,400, 5+i*10,5+i*10);
  ellipse(xTwo+1,400, 5+i*10,5+i*10);
  }
  xOne -- ;
  xTwo ++ ;
  

  
  if (xOne == 0) {
    xOne = 800;

  }
  if (xTwo == 800) {
    xTwo = 0;
  }
  
 
  // Go to the recipe to run the demonstration before starting this program
  
  /*
  Use the code from your Bullseye program to draw the rings shown in this recipe.
  You can use the noFill() command to make your ellipses transparent.
  Make the rings move past each other.
  When the rings hit the side of the sketch, make them reverse their direction.
  */
}
