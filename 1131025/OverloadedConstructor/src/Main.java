class CashCard {
    private String number = "A0000";
    private int balance;
    private int bonus;

    public  CashCard(String number, int balance, int bonus) {
        setNumber(number);
        this.balance = balance;
        this.bonus = bonus;
    }

    void store(int money) {
        if (money > 0) {
            balance += money;
            if (money >= 1000) {
                bonus += money/1000;
            }
        }
        else {
            System.out.println("儲值金額為負，來亂的!");

        }
    }
    void charge(int money) {
        if (money > 0) {
            if (money <= balance) {
                balance -= money;
            } else {
                System.out.println("餘額不足，可憐啊!");
            }
        }
        else {
            System.out.println("扣除金額為負，來亂的!");
        }
    }

    int exchange(int bonus) {
        if (bonus > 0) {
            bonus -= bonus;
        }
        return this.bonus;

    }
}