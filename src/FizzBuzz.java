/**
 * Solve the FizzBuzz challenge.
 */
class FizzBuzz {

    public static void main(String[] args) {

//        for (int i = 1; i < 100; i++) {
//
//            // Find out which numbers divide i.
//            boolean divisibleBy3 = i % 3 == 0;
//            boolean divisibleBy5 = i % 5 == 0;
//
//            // Print our appropriate result.
//            if (divisibleBy3 && divisibleBy5) {
//
//                System.out.println("Fizz Buzz");
//
//            } else if (divisibleBy3) {
//
//                System.out.println("Fizz");
//
//            } else if (divisibleBy5) {
//
//                System.out.println("Buzz");
//
//            } else {
//
//                System.out.println(i);
//
//            }
//        }
        Integer i;
        String s;
        i = 0;
        while (i < 100){
            i = doFizzBuzz(i);
        }
    }

    private static Integer doFizzBuzz(Integer i) {
        String s;
        s = "";
        if (i % 3 == 0){
            s = s + "Fizz";
        }
        if (i % 5 == 0){
            s = s + "Buzz";
        }
        if (s.isEmpty()){
            System.out.println(i);
        } else {
            System.out.println(s);
        }
        i += 1;
        return i;
    }
}
