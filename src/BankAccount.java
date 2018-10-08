public class BankAccount {
        private String accNum;
        private double balance;
        private Person customer;

        // Accessor and Mutators
        public void setAccNum(String accNum)
        {
            this.accNum = accNum;
        }

        public String getAccNum()
        {
            return accNum;
        }

        public void setBalance(double balance)
        {
            this.balance = balance;
        }

        public double getBalance()
        {
            return balance;
        }

        public void setCustomer(Person customer)
        {
            this.customer = customer;
        }

        public Person getCustomer()
        {
            return customer;
        }
        // Constructors
        public BankAccount()
        {
            this.accNum = "No Account Number";
            this.balance = 0.00;
            this.customer = new Person("Unknown");
        }
        public BankAccount(String accNum, double balance, Person customer)
        {
            setAccNum(accNum);
            setBalance(balance);
            setCustomer(customer);
        }
        // to String method
        public String toString()
        {
            return "Account Number: " + accNum +
                    "\nBalance: " + balance +
                    "\nAccount Holder: " + customer.toString();
        }


}
