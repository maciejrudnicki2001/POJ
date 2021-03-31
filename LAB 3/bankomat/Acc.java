package pjatk.bankomat;

class Acc {
    private final int id;
    private double money = 100;

    double getmoney(){

        return this.money;
    }
    Acc(int id) {

        this.id = id;
    }
    int getid(){
        return this.id;
    }
     boolean withdraw(double withdraw){
        if (this.money - withdraw < 0) {
            return false;
        }
        money = money - withdraw;
        return true;

    }
    void deposit(double deposit){
        this.money = money + deposit;
    }

}
