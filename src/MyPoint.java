public class MyPoint {
    private int xVal;
    private int yVal;

    // Setters and Getters

    public void setxVal(int xVal) {
        this.xVal = xVal;
    }

    public int getxVal() {
        return xVal;
    }

    public void setyVal(int yVal) {
        this.yVal = yVal;
    }

    public int getyVal() {
        return yVal;
    }

    // No argument constructor
    public MyPoint() {
        this.xVal = 0;
        this.yVal = 0;
    }

    // 2 argument constructor
    public MyPoint(int xVal, int yVal) {
        setxVal(xVal);
        setyVal(yVal);
    }

    public String toString() {
        return "xVal: " + xVal + "\nyVal: " + yVal;

    }

    public int moveHorizontally(int value)
    {
       // String moveXValue;
       // int newXVal;


        //newXVal = Integer.parseInt(moveXValue);

        //xVal += newXVal;

        return xVal;

    }

}






