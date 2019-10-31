//Creates instances of Coin class and tests attributes and behaiviors

public class CoinTester {
  public static void main(String[] args){
    Coin myCoin = new Coin();

    final int NUM_FLIPS = 10;
    int headsCount = 0;
    
    for (int i = 0; i < NUM_FLIPS; i++){
      myCoin = new Coin();
      System.out.println(myCoin);
      if (myCoin.isHeads()){
        headsCount++;
      }
    }

    System.out.println(headsCount);

  }
}
