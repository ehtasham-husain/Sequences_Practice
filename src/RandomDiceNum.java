public class RandomDiceNum {

    public static void main(String[] args) {
        int temp = 0;
            for (int i = 1;  i<=2; i++){
            int dice = (int) Math.floor(Math.random() * 10) % 6 + 1;
                System.out.println("Dice"+i+" = "+dice);
            temp += dice;
        }
        System.out.println("Addition of Two Random Dice = "+temp);
    }
}
