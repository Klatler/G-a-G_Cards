import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import controlP5.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Grow_a_Game extends PApplet {



String[] actionsArr;
String[] challengesArr;
String[] gamesArr;
String[] goalsArr;
  
public void setup(){
  
  
  PImage actions = loadImage("Actions.png");
  PImage challenges = loadImage("Challenges.png");
  PImage games = loadImage("Games.png");
  PImage goals = loadImage("Goals.png");
  
  actionsArr = loadStrings("Actions.txt");
  challengesArr = loadStrings("Challenges.txt");
  gamesArr = loadStrings("Games.txt");
  goalsArr = loadStrings("Goals.txt");
  
  noStroke(); //BACKGROUND
  fill(0xffffc300);
  rect(0,0,1200,100);
  fill(0xffc70039);
  rect(0,100,300,500);
  fill(0xffff5733);
  rect(300,100,300,500);
  fill(0xff008080);
  rect(600,100,300,500);
  fill(0xff900c3f);
  rect(900,100,300,500);
  
  textSize(50);
  fill(255);
  textAlign(CENTER,CENTER);
  text("GROW-A-GAME-CARDS",600,50);
  
  image(actions,225,110,50,50);
  image(challenges,525,110,50,50);
  image(games,825,110,50,50);
  image(goals,1125,110,50,50);
  
  textAlign(LEFT,CENTER);
  textSize(30);
  fill(255);
  text("ACTIONS",25,135);
  text("CHALLENGES",325,135);
  text("GAMES",625,135);
  text("GOALS",925,135);
  
  fill(255);
  rect(0,170,1200,5);
}

public void draw(){
}

public void mouseClicked(){
  if(mouseY>100){
    if(mouseX<300){drawAction();}
    else if(mouseX<600){drawChallenge();}
    else if(mouseX<900){drawGame();}
    else{drawGoals();}
  } else {
    drawAction();
    drawChallenge();
    drawGame();
    drawGoals();
  }
}

public void drawAction(){
  fill(0xffc70039);
  rect(0,175,300,600);
  fill(255);
  textAlign(CENTER,CENTER);
  textSize(40);
  text(actionsArr[PApplet.parseInt(random(0,actionsArr.length))],150,350);
}

public void drawChallenge(){
  fill(0xffff5733);
  rect(300,175,300,600);
  fill(255);
  textAlign(CENTER,CENTER);
  textSize(30);
  String[] s = split(challengesArr[PApplet.parseInt(random(0,challengesArr.length))],';');
  text(s[0],450,225);
  textSize(15);
  textAlign(CENTER,TOP);
  text(s[1],325,275,250,150);
  text(s[2],325,400,250,100);
}

public void drawGame(){
  fill(0xff008080);
  rect(600,175,300,600);
  fill(255);
  textAlign(CENTER,TOP);
  textSize(30);
  String[] s = split(gamesArr[PApplet.parseInt(random(0,gamesArr.length))], ';');
  text(s[0],625,215,250,100);
  textSize(15);
  textAlign(CENTER,TOP);
  text(s[1],625,315,250,150);
}

public void drawGoals(){
  fill(0xff900c3f);
  rect(900,175,300,600);
  fill(255);
  textAlign(CENTER,CENTER);
  textSize(35);
  text(goalsArr[PApplet.parseInt(random(0,goalsArr.length))],1050,350);
}
  public void settings() {  size(1200,600); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Grow_a_Game" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
