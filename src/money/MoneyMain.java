package money;

public class MoneyMain {

	public static void main(String[] args) {
		Money five = Money.dollar(5);
		 System.out.println(five.times(2).amount);
		 System.out.println("OK !");

	}

}
