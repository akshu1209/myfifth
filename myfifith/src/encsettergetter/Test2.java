package encsettergetter;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Account acc= new Account();
acc.setAcc_no(12334559696L);
acc.setName("Akshay dhumal");
acc.setEmail("akshaydhumal.ad95");
acc.setAmountl(400000f);

System.out.print(acc.getAcc_no()+" "+acc.getNmae()+" "+acc.getEmail()+"  "+acc.getAmount());
	}

}

