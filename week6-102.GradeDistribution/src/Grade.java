/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alexandergranasen
 */
public class Grade {
    private int five;
    private int four;
    private int three;
    private int two;
    private int one;
    private int zero;
    private double getTotal;

    public double getTotal() {
        double acceptance = (five+four+three+two+one);
        double totalGrade = (five+four+three+two+one+zero);
        
        getTotal = 100*(acceptance/totalGrade);
        
        return getTotal;
    }  

    public String getFive() {
        String stars = "";
        for(int i = 0; i < five; i++){
            stars += "*";
        }
        return stars;
    }

    public void setFive(int five) {
        this.five += five;
    }

    public String getFour() {
        String stars = "";
        for(int i = 0; i < four; i++){
            stars += "*";
        }
        return stars;
    }

    public void setFour(int four) {
        this.four += four;
    }

    public String getThree() {
        String stars = "";
        for(int i = 0; i < three; i++){
            stars += "*";
        }
        return stars;
    }

    public void setThree(int three) {
        this.three += three;
    }

    public String getTwo() {
        String stars = "";
        for(int i = 0; i < two; i++){
            stars += "*";
        }
        return stars;
    }

    public void setTwo(int two) {
        this.two += two;
    }

    public String getOne() {
        String stars = "";
        for(int i = 0; i < one; i++){
            stars += "*";
        }
        return stars;
    }

    public void setOne(int one) {
        this.one += one;
    }

    public String getZero() {
        String stars = "";
        for(int i = 0; i < zero; i++){
            stars += "*";
        }
        return stars;
    }

    public void setZero(int zero) {
        this.zero += zero;
    }
    
    public void calculateGrade(int tempGrade){
        
        if(tempGrade >= 0 && tempGrade <= 29){
            setZero(1);
        }
        if(tempGrade >= 30 && tempGrade <= 34){
            setOne(1);
        }        
        if(tempGrade >= 35 && tempGrade <= 39){
            setTwo(1);
        }
        if(tempGrade >= 40 && tempGrade <= 44){
            setThree(1);
        }
        if(tempGrade >= 45 && tempGrade <= 49){
            setFour(1);
        }
        if(tempGrade >= 50 && tempGrade <= 60){
            setFive(1);
        }       
    }
}
