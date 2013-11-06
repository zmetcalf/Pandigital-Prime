public class PandigitalPrime
{
    public PandigitalPrime() {
    }

    public void findAndPrintHighestPandigital() {
        long highestPandigitalPrime = 0;

        for(long i = 3L; i < 1234567890L; i += 2) {
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
        for(int i = 1; i <= checkPan.length(); i++) {
            if(checkPan.contains(Integer.toString(i)) == false) {
                return false;
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

        while(i <=maxCheck) {
            if(checkNum % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }
}
