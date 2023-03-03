public class Account{
    private int accountNumber;
    private String name;
    private String address;
    private int phoneNumber;
    private int balance;
	public void setAccountNumber(int accountNumber){
		this.accountNumber=accountNumber;
	}
	public int getAccountNumber(){
		return accountNumber;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setAddress(String address){
		this.address=address;
	}
	public String getAddress(){
		return address;
	}
	public void setPhoneNumber(int phoneNumber){
		this.phoneNumber=phoneNumber;
	}
	public int getPhoneNumber(){
		return phoneNumber;
	}
	public void setBalance(int balance){
		this.balance=balance;
	}
	public int getBalance(){
		return balance;
	}
	public Account(int accountNumber,String name,String address,int phoneNumber,int balance){
		this.accountNumber=accountNumber;
		this.name=name;
		this.address=address;
		this.phoneNumber=phoneNumber;
		this.balance=balance;
	}
	public Account(){
	}
	public void closeAccount(){
		System.out.println("close account method of Account class");
	}
}