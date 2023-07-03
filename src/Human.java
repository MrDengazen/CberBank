import java.util.Random;
import java.util.random.RandomGenerator;

public class Human {
    int money;
    float age;
    String name;
    int spendingMoney;
    int gettingMoney;
    int savings = 0;
    int credits = 0;
    Human(int money, float age, String name){
        this.money = money;
        this.age = Math.max(age, 18);
        this.name = name;
        this.spendingMoney = ((int) this.age) * 500;
        this.gettingMoney = ((int) this.age) * 1000;
    }
    public void work(){
        money += gettingMoney;
        gettingMoney += (-5 + RandomGenerator.getDefault().nextInt(11)) * 1000;
        age += 0.083;
    }
    public void walk(){
        money += spendingMoney;
        spendingMoney+= (-4 + RandomGenerator.getDefault().nextInt(10)) * 1000;
        age -= ((float) RandomGenerator.getDefault().nextInt(11)) / 200;
    }
    public void cnangeMoney(int money){
        this.money += money;
    }
    public void setSavings(int savings){
        this.savings = savings;
    }
    public void addSavings(int savings){
        this.savings += savings;
    }
    public void setCredits(int credits){
        this.savings = credits;
    }
    public void addCredits(int credits){
        this.savings += credits;
    }
}
