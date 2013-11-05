public class PandigitalPrime
{
    public PandigitalPrime() {
    }

    public void findAndPrintHighestPandigital() {
        int highestPandigitalPrime = 0;

        for(int i = 3; i < 9876543210; i += 2) {
            if(checkPrime(i)) {
                if(checkPandigital(Integer.toString(i))) {
                    highestPandigitalPrime = i;
                }
            }
        }
        System.out.printf("The highest prime pandigital is %d",
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

    private boolean checkPrime(int checkNum) {
        int i = 2;
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
