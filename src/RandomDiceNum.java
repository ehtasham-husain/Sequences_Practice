public class RandomDiceNum {

    public static void main(String[] args) {
        int i=0;
        while (i < 20){
            int dice = (int) Math.floor(Math.random() * 10) % 6 + 1;
            System.out.println(dice);
            i++;
        }
    }
}
