public class RandomDiceNum {

    public static void main(String[] args) {
        int temp = 0;
            for (int i = 1;  i<=5; i++){
            int dice = (int) Math.floor(Math.random() * 100) % 90 + 10;
                System.out.println("Dice"+i+" = "+dice);
            temp += dice;
        }
        System.out.println("Addition of five Random Dice = "+temp);
        System.out.println("Average of 5 random dice number = "+temp/5);
    }
}
