package ss15.bai_tap;

public class IllegalTraingle {
    private double firstEdge;
    private double secondEdge;
    private double thirdEdge;
    public IllegalTraingle(double firstEdge, double secondEdge, double thirdEdge){
        this.firstEdge = firstEdge;
        this.secondEdge = secondEdge;
        this.thirdEdge = thirdEdge;
    }

    public void setFirstEdge(double firstEdge) {
        this.firstEdge = firstEdge;
    }
    public void setSecondEdge(double secondEdge) {
        this.secondEdge = secondEdge;
    }
    public void setThirdEdge(double thirdEdge) {
        this.thirdEdge = thirdEdge;
    }
    private void checkTraingle () throws IllegalArgumentException{
        if (firstEdge <= 0 || secondEdge <= 0 || thirdEdge <= 0) {
            throw new IllegalArgumentException("The edge must be greater than 0");
        }
            double sum1 = firstEdge + secondEdge;
            double sum2 = thirdEdge + secondEdge;
            double sum3 = firstEdge + thirdEdge;
            if (sum1 < thirdEdge && sum2 < firstEdge && sum3 < secondEdge) {
                throw new IllegalArgumentException ("The sum of two edges is greater than the other edge");
            }
    }
}
