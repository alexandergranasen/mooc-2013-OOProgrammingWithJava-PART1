
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int pv, int kk, int vv) {
        this.day = pv;
        this.month = kk;
        this.year = vv;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

    /**
     * calculates the difference in years of the object for which the
     * method is called and the object given as parameters.
     * @param comparedDate
     * @return 
     */
    public int differenceInYears(MyDate comparedDate) {
        int differenceInDays = (this.day + this.month * 30 + this.year * 365) - (comparedDate.day + comparedDate.month * 30 + comparedDate.year * 365); 
        return Math.abs(differenceInDays / 365);
    }
}
