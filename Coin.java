/*
This is the Coin class
It is the blueprint for how to make a coin object
*/

public class Coin{
  //----------------------------------------------------------------------------

  /*
  These are the declarations for the attributes (instance variables) of a coin
  */
  private int face;

  private final int HEADS = 0; //Constants defining heads and tails
  private final int TAILS = 1;

  //----------------------------------------------------------------------------

  /*
  The Coin constructor that defines what happens when a coin object is made
  When a new Coin is made it gets flipped
  */
  public Coin(){
    flip();
  }

  //----------------------------------------------------------------------------

  /*
  This is the section of the class containing the methods (behanviors) of a Coin
  */

  //The accessor method for the face variable (a getter)
  public int getFace(){
    return face;
  }

  //The mutator method for the face variable (a setter) *Setters are always void
  public void setFace(int faceInput){
    face = faceInput;
  }

  //The flip method assigns a randomly chosen value to the face of the Coin
  public void flip(){
    face = (int) (Math.random() * 2);
  }

  //The isHeads method tells us if the coin's face is a heads or not
  public boolean isHeads(){
    return (face == HEADS);
  }

  //Prints out information about the current state of a Coin
  public String toString(){
    String result = "";
    if (face == HEADS){
      result = "Heads";
    }
    else {
      result = "Tails";
    }
    return result;
  }

  //----------------------------------------------------------------------------
}
