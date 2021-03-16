class Bank {
    private int accountno;
    private double balance;
    private string name;

    public void deposit(int amount) {
        balance = balance + amount;
        System.out.println("NEW BALANCE IS " + balance);
    }

    public void withdraw(int amount) {
        if (balance < amount) {
            System.out.println("OUT OF BALANCE");
        } 
        else {
            balance = amount - balance;
        }

    }

}
