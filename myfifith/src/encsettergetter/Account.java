package encsettergetter;
      // its has only four field with setter and getter; it has private data member
public class Account {
	
	private long Acc_no;
	private String name,email;
	private float amount;   // private data member
	// public getter setter method
	
	public long getAcc_no()
	{
		return Acc_no;
	}
	
     public void setAcc_no(Long Acc_no) {
    	 this.Acc_no=Acc_no;
     }
     public String getNmae() {
    	 return name;
     }
     public void setName(String name) {
    	 this.name=name;
     }
     public String getEmail() {
    	 return email;
     }
     public void setEmail(String email) {
    	 this.email=email;
}
     public float getAmount() {
    	 return amount;
     }
     public void setAmountl(float amount) {
    	 this.amount=amount;
}
}


