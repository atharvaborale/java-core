package com.ps6;

public class BankAccount {

	    private int accNo;
	    private String custName;
	    private String accType;
	    private float balance;
	    
	    

//	    public int getAccNo() {
//			return accNo;
//		}
//
//		public void setAccNo(int accNo) {
//			this.accNo = accNo;
//		}
//
//		public String getCustName() {
//			return custName;
//		}
//
//		public void setCustName(String custName) {
//			this.custName = custName;
//		}
//
//		public String getAccType() {
//			return accType;
//		}
//
//		public void setAccType(String accType) {
//			this.accType = accType;
//		}
//
//		public void setBalance(float balance) {
//			this.balance = balance;
//		}

		
		
		
		
		@Override
		public String toString() {
			return "BankAccount [accNo=" + accNo + ", custName=" + custName + ", accType=" + accType + ", balance="
					+ balance + "]";
		}

		public BankAccount() {
			super();
			// TODO Auto-generated constructor stub
		}

		public BankAccount(int accNo, String custName, String accType, float balance) throws NegativeAmountException, LowBalanceException {
	        this.accNo = accNo;
	        this.custName = custName;
	        this.accType = accType;
	        if (balance < 0) {
	            throw new NegativeAmountException("Negative amount is not allowed");
	        }
	        if ((accType.equals("Saving") && balance < 1000) || (accType.equals("Current") && balance < 5000)) {
	            throw new LowBalanceException("Balance is less than the minimum required balance");
	        }
	        this.balance = balance;
	    }

	    public void deposit(float amt) throws NegativeAmountException {
	        if (amt < 0) {
	            throw new NegativeAmountException("Negative amount is not allowed");
	        }
	        balance += amt;
	    }

	    public float getBalance() throws LowBalanceException {
	        if ((accType.equals("Saving") && balance < 1000) || (accType.equals("Current") && balance < 5000)) {
	            throw new LowBalanceException("Balance is less than the minimum required balance");
	        }
	        return balance;
	    }
	    class NegativeAmountException extends Exception {
		    public NegativeAmountException(String message) {
		        super(message);
		    }
		}

		class LowBalanceException extends Exception {
		    public LowBalanceException(String message) {
		        super(message);
		    }
		}
		
	}

