public class SingleDigit {
    public static void main(String[] args) {
        for(int i =0; i<=20; i++) {
            int num = (int)Math.floor(Math.random() * 10)%9+1;
            System.out.println(num);
        }
    }
}
