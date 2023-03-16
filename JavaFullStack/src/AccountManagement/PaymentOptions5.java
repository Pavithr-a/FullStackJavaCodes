package AccountManagement;


public class PaymentOptions5 extends AccountManage2 implements Display1{
		void DisplayOptions() {
		System.out.println(ANSI_BLACKBG+ANSI_WHITE+"------------------------------------"+ANSI_RESET);
		System.out.println(ANSI_BLACKBG+ANSI_WHITE+"|"+ANSI_RESET+ANSI_RED+"1.Deposit            		  "+ANSI_BLACKBG+ANSI_WHITE+" |"+ANSI_RESET);
		System.out.println(ANSI_BLACKBG+ANSI_WHITE+"|"+ANSI_RESET+ANSI_RED+"2.Withdrawal                     "+ANSI_BLACKBG+ANSI_WHITE+" |"+ANSI_RESET);
		System.out.println(ANSI_BLACKBG+ANSI_WHITE+"|"+ANSI_RESET+ANSI_RED+"3.Balance                        "+ANSI_BLACKBG+ANSI_WHITE+" |"+ANSI_RESET);
		System.out.println(ANSI_BLACKBG+ANSI_WHITE+"|"+ANSI_RESET+ANSI_RED+"4.Transaction statements         "+ANSI_BLACKBG+ANSI_WHITE+" |"+ANSI_RESET);
		System.out.println(ANSI_BLACKBG+ANSI_WHITE+"|"+ANSI_RESET+ANSI_RED+"5.Print Transactions             "+ANSI_BLACKBG+ANSI_WHITE+" |"+ANSI_RESET);
		System.out.println(ANSI_BLACKBG+ANSI_WHITE+"|"+ANSI_RESET+ANSI_RED+"6.Fixed Deposit                  "+ANSI_BLACKBG+ANSI_WHITE+" |"+ANSI_RESET);
		System.out.println(ANSI_BLACKBG+ANSI_WHITE+"|"+ANSI_RESET+ANSI_RED+"7.Feedback or Complaint Section  "+ANSI_BLACKBG+ANSI_WHITE+" |"+ANSI_RESET);
		System.out.println(ANSI_BLACKBG+ANSI_WHITE+"|"+ANSI_RESET+ANSI_RED+"8.Exit                           "+ANSI_BLACKBG+ANSI_WHITE+" |"+ANSI_RESET);
		System.out.println(ANSI_BLACKBG+ANSI_WHITE+"------------------------------------"+ANSI_RESET);
	}

		@Override
		public void display() {
			System.out.println(ANSI_CYAN+ANSI_BLACKBG+"                         *********Welcome to DXC Bank*********                         "+ANSI_RESET);
			
		}

}
