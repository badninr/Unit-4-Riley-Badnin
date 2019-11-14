public class Die{
    private int side;

    public Die(){
        side = 1;
    }

    public int getSide(){
        return side;
    }

    public void roll(){
        side = (int) ((Math.random() * 6) + 1);
    }

    public String toString(){
        String result = "Face value = " + side;
        return result;
    }
}
