public class Multiples {
    public static void main(String[] args) {
        Integer count;
        count = 0;
        for (Integer i = 1; i < 1000; i++){
            if (i % 3 == 0 | i % 5 == 0){
                count += 1;
            }
        }
        System.out.println(count);
    }
}
