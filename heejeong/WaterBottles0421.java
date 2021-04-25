package heejeong;

public class WaterBottles0421 {
    public int numWaterBottles(int numBottles, int numExchange) {
        int drink = numBottles;
        while (numBottles >= numExchange){
            drink += numBottles / numExchange;
            numBottles = numBottles / numExchange + numBottles % numExchange;
        }
        return drink;
    }

    public static void main(String[] args) {
        WaterBottles0421 w = new WaterBottles0421();
        System.out.println("solution = "+w.numWaterBottles(9,3));
    }
}
