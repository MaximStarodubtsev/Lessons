package Lesson6;



public class Bankomat {
    private int twentyBills;
    private int fiftyBills;
    private int oneHundredBills;

    public int getTwentyBills() {
        return twentyBills;
    }

    public int getFiftyBills() {
        return fiftyBills;
    }

    public int getOneHundredBills() {
        return oneHundredBills;
    }

    public Bankomat(int x, int y, int z){
        twentyBills = x;
        fiftyBills = y;
        oneHundredBills= z;
    }

    public boolean addMoney(int twentyBills, int fiftyBills, int oneHundredBills) {
            this.oneHundredBills += oneHundredBills;
            this.fiftyBills += fiftyBills;
            this.twentyBills += twentyBills;
            return true;
    }
    public void withdrawMoney(int money){
            int sum = 0;
            int countOfFiftyBills = 0;
            int countOfTwentyBills =0;
            int countOfOneHundredBills = 0;
            while (sum <= money && oneHundredBills >0) {
                sum += 100;
                if (sum>money){
                    sum -= 100;
                    break;
                }
                oneHundredBills--;
                countOfOneHundredBills++;
            }
            while (sum <= money && fiftyBills>0) {
                sum += 50;
                if (sum>money){
                    sum -= 50;
                    break;
                }
                fiftyBills--;
                countOfFiftyBills++;
            }
            if (money%100 == 60 || money%100 == 80){
                sum -= 50;
                countOfFiftyBills--;
            }
        while (sum != money && twentyBills>0) {
            sum += 20;
            if (sum>money){
                sum-=20;
                break;
            }
            twentyBills--;
            countOfTwentyBills++;

        }

            System.out.println("Count of one hundred bills: "+ countOfOneHundredBills+
                    "\nCount of fifty bills: "+ countOfFiftyBills +
                    "\nCount of twenty bills: " + countOfTwentyBills);
        }

}
