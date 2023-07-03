public class Bank {
    int money;
    float percentSaving;
    float percentCredit;
    Bank(int money, float percentCredit, float percentSaving)
    {
        this.money = money;
        this.percentSaving = percentSaving;
        this.percentCredit = percentCredit;
    }
    public void giveCredit(int money, Human human)
    {
        this.money -= money;
        human.setCredits(money);
        human.cnangeMoney(money);
    }
    public void giveSavings(int money, Human human)
    {
        this.money -= money;
        human.setSavings(money);
        human.cnangeMoney(money);
    }
}
