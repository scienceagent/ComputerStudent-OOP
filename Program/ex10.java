public class ex10 {
    public static void main(String[] args) {
        int n = 15;
        int sum = 0;

        for(int i=1;i<=n;i++) {
            if(i%2!=0) {
                sum+=i;
            }
        }
        System.out.println("Suma impare "+sum);
    }
}
