import processing.core.PApplet;
import java.util.Random;

/**
* 
* A program to draw a smiley face that is in a random position everytime you run the code. The position decides whether the face is mad, sad, or happy!
* @author: R. Kabak
*
*/

public class Sketch extends PApplet {

  // Generate Random coordinates for the smiley face drawn later on
  Random Random = new Random();
	int SmileyX = Random.nextInt((600 - 50) + 1) + 50;
  int SmileyY = Random.nextInt((600 - 50) + 1) + 50;

  // Settings
  public void settings() {
    // Window size
    size(800, 800);
  }

  // Setup for the background
  public void setup() {
    // If statement for background color
    if ((SmileyX < 200) || (SmileyX > 500)) {
      background(43, 47, 119); 
    } else if (SmileyX > 200 && SmileyX < 300)  {
      background(135, 206, 235); 
    } else if (SmileyX > 300 && SmileyX < 500) {
      background(250, 214, 165);
    }
  }

  // Draw the scene
  public void draw() {
    // Grass
    fill(0,255,0);
    rect(0,700,800,100);

    // Flower stems on grass
    line(30,700,30,650);
    line(120,700,120,650);
    line(190,700,190,650);
    line(300,700,300,650);
    line(390,700,390,650);
    line(480,700,480,650);
    line(550,700,550,650);
    line(640,700,640,650);
    line(730,700,730,650);
    line(780,700,780,650);

    // Petals
    fill(255,0,0);
    ellipse(30,650,30,30);
    fill(0,0,255);
    ellipse(120,650,30,30);
    fill(0,100,255);
    ellipse(190,650,30,30);
    fill(0,100,0);
    ellipse(300,650,30,30);
    fill(100,100,0);
    ellipse(390,650,30,30);
    fill(100,100,100);
    ellipse(480,650,30,30);
    fill(100,256,100);
    ellipse(550,650,30,30);
    fill(256,256,0);
    ellipse(640,650,30,30);
    fill(256,0,256);
    ellipse(730,650,30,30);
    fill(256,100,100);
    ellipse(780,650,30,30);

    // Draw smiley face at the random X & Y Coordinates
    fill(255, 255, 0);
    ellipse(SmileyX, SmileyY, 180, 180);

    // If statement to decide whether smiley face is angry, sad, or happy and random coordinates for the face
    if (SmileyY >= 0 && SmileyY < 300) {
      fill(0, 0, 0);
      line(SmileyX, SmileyY + 20, SmileyX - 50, SmileyY + 50);
      line(SmileyX, SmileyY + 20, SmileyX + 50, SmileyY + 50);
      fill(255, 0, 0);
    } else if (SmileyY >= 300 && SmileyY < 500) {
      fill(0, 0, 0);
      line(SmileyX - 65, SmileyY + 20, SmileyX, SmileyY + 20);
      line(SmileyX + 65, SmileyY + 20, SmileyX, SmileyY + 20);
      fill(0, 0, 255);
    } else {
      fill(0, 0, 0);
      line(SmileyX - 65, SmileyY + 20, SmileyX, SmileyY + 50);
      line(SmileyX + 65, SmileyY + 20, SmileyX, SmileyY + 50);
      fill(0, 0, 0);
    }

    // Eyes of Smiley Face
    ellipse(SmileyX - 25, SmileyY - 30, 30, 30);
    ellipse(SmileyX + 25, SmileyY - 30, 30, 30);

  }
}