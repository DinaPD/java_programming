package chapter6;

public class PhoneBillCalculator {

    public static void main(String args[]){
        PhoneBill bill = new PhoneBill(123456);
        bill.setUsedMinutes(1000);
        bill.printItemizedBill();
    }

}
