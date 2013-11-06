public class PandigitalPrime
{
    public PandigitalPrime() {
    }

    public void findAndPrintHighestPandigital() {
        long highestPandigitalPrime = 0;

        for(long i = 3L; i < 1000000001L; i += 2) {
            if(checkPandigital(Long.toString(i))) {
                if(checkPrime(i)) {
                    highestPandigitalPrime = i;
                }
            }
        }
        System.out.printf("The highest prime pandigital is %d\n",
                          highestPandigitalPrime);
    }

    private boolean checkPandigital(String checkPan) {
        char[] checkArray = checkPan.toCharArray();
        int counter = 0;

        for(char checkChar : checkArray) {
            for(int i = 0; i < checkPan.length(); i++) {
                if(checkChar == checkPan.charAt(i)) {
                    counter++;
                }
            }
            if(counter > 1) {
                return false;
            }
            else {
                counter = 0;
            }
        }
        return true;
    }

    private boolean checkPrime(long checkNum) {
        long i = 2;
        double maxCheck;

        if(checkNum == 1) {
            return false;
        }

        maxCheck = Math.sqrt((double) checkNum);

        while(i <= maxCheck) {
            if(checkNum % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }
}
