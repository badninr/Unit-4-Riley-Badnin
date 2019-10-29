//Creates instances of Coin class and tests attributes and behanviors

public class CoinTester {
  public static void main(String[] args){
    Coin myCoin = new Coin();

    int headsCount;
    for (int i=0; i<10; i++){
      myCoin = myCoin.Coin();
      System.out.println(myCoin);
      if (myCoin.isHeads()){
        headsCount++;
      }
    }

    System.out.println(headsCount);
  }
}
