public class Main {
    private static WorkC workC = new WorkC();
    private static WorkC2 workC2 = new WorkC2();

    public static void main(String[] args) {
        // write your code here
     //   System.out.println("test1");
    //    workC.chech_primes(20);
        for (int i = 1; i <101 ; i++) {
            workC2.checkIfPierwsza2(i);
        }


    }
}