
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    /**
     * returns a new Money object that has a value equal to the sum of 
     * the object for which the method was called and the object given as parameter.
     * @param added
     * @return a new Money object
     */
    public Money plus(Money added){
        int sumEuros = euros + added.euros();
        int sumCents = cents + added.cents();
        
        if(sumCents > 100){
            sumEuros++;
            sumCents-=100;
        }
        
        Money sum = new Money(sumEuros, sumCents);
        
        return sum;
    }
    
    // Compares two money objects
    public boolean less(Money compared) {
        return euros < compared.euros() || 
                (euros == compared.euros() && cents < compared.cents());
    }
    
    public Money minus(Money decremented){
        
        int sumEuros = euros - decremented.euros();
        int sumCents = cents - decremented.cents();
        
        if(sumCents < 0){
            sumEuros--;
            sumCents+=100;
        }
        
        if(sumEuros < 0){
            sumEuros = 0;           
            sumCents = 0;
        }
        
        Money sum = new Money(sumEuros, sumCents);
        
        return sum;
    }
    
    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

}
