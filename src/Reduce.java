public class Reduce {
    public static void main(String[] args) {
        Integer steps;
        Integer n;
        steps = 0;
        n = 100;
        while (n != 0){
            if (n % 2 == 0){
                n = n / 2;
            } else {
                n = n - 1;
            }
            steps = steps + 1;
        }
        System.out.println(steps);
    }
}
