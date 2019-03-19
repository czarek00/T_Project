
class WorkC {


    private void checkIfPierwsza(int p_number) {
        int flag = 1;
        if (p_number == 1 || p_number == 0) {
            System.out.println("to nie jest liczba pierwsza bo liczy 1 i 2 nie są liczbami pierwszymi");
            flag++;
        } else {
            for (int i = 2; i < p_number - 1; i++) {
                if ((p_number % i) > 0)
                    flag = 0;
                else {
                    flag++;
                }

            }
        }
        if (flag > 0)
            System.out.println("to nie jest liczba pierwsza ");
        else
            System.out.println("to  jest liczba pierwsza ");


    }

    void chech_primes(int p_to_number) {
        for (int i = 0; i < p_to_number; i++) {
            System.out.println("Liczba" + i);
            checkIfPierwsza(i);

        }
    }
}
