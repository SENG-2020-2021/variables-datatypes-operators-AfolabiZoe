class Main {
  public static void main(String[] args) {
    long daysTheDebtor = 60;
    long amountPayPerDay = 100;
    long amountPaid =2700;

    long dayPaid = amountPaid/amountPayPerDay;
    long totalAmount = amountPayPerDay * daysTheDebtor;
    long amountLeft = totalAmount - amountPaid;
    long daysLeft = daysTheDebtor - dayPaid;
    long incompleteAmount = amountPaid % amountPayPerDay;

    System.out.println("The total debit is # "+ totalAmount);
    System.out.println("He has paid #" + amountPaid);
    System.out.println("Amount the client is left to pay is # " + amountLeft);
    System.out.println(" the amount whose day was not captured because the amount was incomplete " + incompleteAmount);
    System.out.println("He has paid for  " + dayPaid +  "days");
    System.out.println("Days incomplete due to insufficient funds are  " + daysLeft + "days");
  }
}