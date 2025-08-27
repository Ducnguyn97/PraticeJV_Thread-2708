public class testSync {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        Thread t1 = new Thread(() -> bankAccount.withdraw("luong 1", 70));
        Thread t2 = new Thread(() -> bankAccount.withdraw("luong 2", 70));
        t1.start();

        t2.start();


    }
}
