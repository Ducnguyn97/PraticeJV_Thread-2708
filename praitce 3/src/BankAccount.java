public class BankAccount {
    private int balance = 100;

    public synchronized void withdraw(String threadName, int amount) {
        if(balance >= amount) {
            System.out.println(threadName + " dang rut " + amount);
            balance -= amount;
            System.out.println(threadName + " rut thanh cong. So dư " + balance);
        }else{
            System.out.println(threadName + " Khong dủ tien de rut");
        }
    }
}
