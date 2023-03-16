package AccountManagement;

import java.util.Date;
import java.util.InputMismatchException;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
class Transaction{
	
	@Override
	public String toString() {
		return "Transaction [date=" + date + ", type=" + type + ", amount=" + amount + "]";
	}
	private Date date;
	private String type;
	private double amount;
	
	public Transaction(Date date, String type, Double amount) {
		this.date=date;
		this.type=type;
		this.amount=amount;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public Date getDate() {
		return date;
	}
	public String getType() {
		return type;
	}
	
}

public class MainClass{
public static final String ANSI_RESET = "\u001B[0m";
public static final String ANSI_YELLOW = "\u001B[33m";
public static final String ANSI_RED ="\u001B[31m" ;
public static final String ANSI_CYAN = "\u001B[36m";
public static final String ANSI_GREEN="\u001B[32m";
public static final String ANSI_PURPLE="\u001B[35m";
public static final String ANSI_BLUE="\u001B[34m";
public static final String ANSI_BLACK="\u001B[30m";
public static final String ANSI_WHITE = "\u001B[37m";
public static final String ANSI_BLACKBG="\u001B[40m";
public static final String ANSI_CYANBG = "\u001B[46m";
public static final String ANSI_WHITEBG = "\u001B[47m";
	
	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		List<Transaction> transactions=new ArrayList<>();
		Insert7 in=new Insert7();
		MainClass dis=new MainClass();
		SelectAcc8 sel=new SelectAcc8();
		PaymentOptions5 pay=new PaymentOptions5();
		pay.display();
		Accounts3 accDetails=new Accounts3();
		try {
			int choice;
			while(true) {
			System.out.println(ANSI_BLUE+"1 Login\n2 New Account\n3 Delete Account\n4 Update Account Details"+ANSI_RESET);
			choice=sc.nextInt();
			Double CurrentBalance = null, CurrentBalance1=null,CurrentBalance2;
			ComplaintsSection4 complains=new ComplaintsSection4();
			switch(choice) {
			case 1:
				int PinNum;
				long AccountNum;
				System.out.println("Enter Account number:");
				AccountNum=sc.nextLong();
				System.out.println("Enter pin:");
				PinNum=sc.nextInt();
				for(Accounts3 account:sel.list) {
					if(AccountNum==account.getAccountNumber()&&PinNum==account.getUserPin()) {
						System.out.println("Hi "+account.getUserName());
						System.out.println("Initial balance:"+account.getBalance());
						while(true) {
						pay.DisplayOptions();
						int select;
						System.out.println("Enter from 1 to 7");
						select=sc.nextInt();
						if(select==1) {
							System.out.println("------------------------------------------");
							System.out.println("DEPOSIT");
							System.out.println("Enter deposit amount:");
							Double DepositAmount =sc.nextDouble();
							CurrentBalance=account.getBalance();
							try {
								if(account.getBalance()<=DepositAmount ||account.getBalance()>=DepositAmount) {
									CurrentBalance+=DepositAmount;
									transactions.add(new Transaction(new Date(),"Deposit",DepositAmount));
									System.out.println("1 for Online 2 for Offline");
									int payMode=sc.nextInt();
									if(payMode==1) {
										Random randNumber=new Random();
											
											int otp=randNumber.nextInt(8999)+1000;
											System.out.println("VERIFICATION:");
											for(int i=0;i<3;i++) {
												System.out.println("VERIFICATION CODE:"+otp);
												System.out.println("Enter given OTP:");
												int verify=sc.nextInt();
												if(verify==otp) {
													System.out.println(ANSI_GREEN+"****VERIFICATION SUCCESSFUL****"+ANSI_RESET);
													break;
												}else {
													System.out.println("Enter the correct OTP");
												}
												
											}
										System.out.println(ANSI_PURPLE+"Your account has credited "+DepositAmount+" your New Balance is:"+CurrentBalance+" via online"+ANSI_RESET);
										System.out.println("------------------------------------------");
									}
									else if(payMode==2) {
										System.out.println(ANSI_RED+"SMS ALERT"+ANSI_RESET);
										System.out.println(ANSI_PURPLE+"Your account has credited "+DepositAmount+" your New Balance is:"+CurrentBalance+ANSI_RESET);
										System.out.println("------------------------------------------");
									}
								}
								else {
									System.out.println("Insufficient funds");
								}
							} catch (InputMismatchException e) {
								System.out.println("Invalid character or number"+e);
							}
						}//1 if DEPOSIT
							else if(select==2) {
								System.out.println("------------------------------------------");
								System.out.println("WITHDRAWAL");
								System.out.println("Enter Withdrawal amount:");
								CurrentBalance1= CurrentBalance;
								Double withdrawAmt =sc.nextDouble();
								
								
								try {
									if(withdrawAmt>=20000) {
										System.out.println("Your withdrawal limits has exceeded!");
										CurrentBalance1=CurrentBalance;
										System.out.println("------------------------------------------");
									}
									
									else if(account.getBalance()>=withdrawAmt) {
										CurrentBalance1=account.getBalance();
										CurrentBalance1=CurrentBalance;
										CurrentBalance1-=withdrawAmt;
										transactions.add(new Transaction(new Date(),"Withdrawal",withdrawAmt));
										System.out.println("1 for Online 2 for Offline");
										int payMode=sc.nextInt();
										if(payMode==1) {
											Random randNumber=new Random();
												
												int otp=randNumber.nextInt(8999)+1000;
												System.out.println("VERIFICATION:");
												for(int i=0;i<3;i++) {
													System.out.println("VERIFICATION CODE:"+otp);
													System.out.println("Enter given OTP:");
													int verify=sc.nextInt();
													if(verify==otp) {
														System.out.println(ANSI_GREEN+"****VERIFICATION SUCCESSFUL****"+ANSI_RESET);
														break;
													}
													
												}
											System.out.println("Your account has debited "+withdrawAmt+" your New Balance is:"+CurrentBalance1+" via online");
											System.out.println("------------------------------------------");
										}
										else if(payMode==2) {
											System.out.println(ANSI_RED+"SMS ALERT"+ANSI_RESET);
											System.out.println(ANSI_PURPLE+"Your account has debited "+withdrawAmt+" your New Balance is:"+CurrentBalance1+ANSI_RESET);
											System.out.println("------------------------------------------");
										}
									}
									else {
										System.out.println("Insufficient funds");
									}
								} catch (InputMismatchException e) {
									System.out.println("Invalid character or number"+e);
								}
							}//2 if WITHDRAWAL
							else if(select==3) {
								System.out.println("------------------------------------------");
								CurrentBalance2=account.getBalance();
								CurrentBalance2 = CurrentBalance1;
								System.out.println(ANSI_PURPLE+"Your balance is "+CurrentBalance2+ANSI_RESET);
								System.out.println("------------------------------------------");
							}//3 IF BALANCE
							else if(select==4) {
								System.out.println("------------------------------------------");
								System.out.println("Transaction statements ");
								System.out.println("Customer Name:"+account.getUserName());
								for(Transaction trans:transactions) {
									System.out.println(trans.getDate()+" "+trans.getType()+" "+trans.getAmount());
									System.out.println("------------------------------------------");
								}
							}//4 if TRANSACTION STATEMENT PRINT
							else if (select==5) {
								System.out.println("------------------------------------------");
								System.out.println("Do you need to download transaction statement?y for yes any char for no");
								char choose=sc.next().charAt(0);
								if(choose=='y') {
									System.out.println(ANSI_GREEN+"*****Your statement is downloaded successfully*****"+ANSI_RESET);
									FileWriter file=new FileWriter("transactions.txt");
									BufferedWriter bout=new BufferedWriter(file);
									PrintWriter writer=new PrintWriter(file);
									for(Transaction transact1:transactions) {
										String CopyTransaction=transact1.toString()+"\n";
										writer.println(CopyTransaction);
									}
									writer.close();
								}
								else{
									System.out.println("****Okay****");
								}
								
							}//5 if DOWNLOAD TRANSACTION STATEMENT
							else if(select==6) {
								System.out.println("------------------------------------------");
								System.out.println("How much amount for FD?");
								double amount=sc.nextDouble();
								System.out.println("How many years?");
								float years=sc.nextFloat();
								System.out.println("Rate of interest?");
								float rate=sc.nextFloat();
								System.out.println("------------------------------------------");
								double FdAmount=amount*years*rate;
								System.out.println("You will receive "+FdAmount+" of interest "+rate+ " in "+years+" years.");
								System.out.println("------------------------------------------");
							}
							else if(select==7) {
								System.out.println("-----------------");
								System.out.println("|1.Feedback      |");
								System.out.println("|2.Complaints    |");
								System.out.println("-----------------");
								int query=sc.nextInt();
								if(query==1) {
									Scanner scanner=new Scanner(System.in);
									System.out.println("------------------------------------------");
									System.out.println("How is our online banking service or live banking services?");
									String customerFeedBack=scanner.nextLine();
									System.out.println("Rate us from 1 to 5");
									int rateUs=sc.nextInt();
									if(rateUs<=3) {
										System.out.println("We will improve our service.Thank you for your feedback");
									}
									else {
										System.out.println(ANSI_YELLOW+"Thank you for "+rateUs+" stars."+ANSI_RESET);
									}
								}
								else if(query==2) {
									complains.SolveComplaints();
								}
								
							}
							else if(select==8) {
								System.out.println(ANSI_BLACKBG+"You are our valuable customer.Thank you for choosing our service."+ANSI_RESET);
							}
							
					}//while
					}//if
					
						
			}//foreach
				System.out.println("Invalid pin or accountNumber");	
				
				break;
			case 2:
				in.InsertDetails();
				break;
			case 3:
				DeleteAccount10 del=new DeleteAccount10();
				System.out.println("Do you need to delete your account?y or n");
				char choose;
				choose=sc.next().charAt(0);
				if(choose=='y') {
					del.AccountDelete();
				}
				else if(choose=='n') {
					break;
				}
				else {
					System.out.println("Invalid character");
				}
			break;
			case 4:
				UpdateAccount11 update=new UpdateAccount11();
				System.out.println("Do you need to update your account?");
				char choose1;
				choose1=sc.next().charAt(0);
				if(choose1=='y') {
					update.AccountUpdates();
				}
				else if(choose1=='n') {
					break;
				}
				else {
					System.out.println("Invalid character");
				}
				break;
			/*case 5:
				System.out.println("Customer Details");
				sel.SelectAllDetails();
				break;*/
				
			}//switch
			}//while
		} catch (Exception e) {
			System.out.println("Exception"+e);
		}
		
	}

	

	
	
	

}
