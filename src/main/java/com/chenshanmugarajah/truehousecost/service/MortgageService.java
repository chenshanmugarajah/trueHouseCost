package com.chenshanmugarajah.truehousecost.service;
import org.springframework.stereotype.Service;

@Service
public class MortgageService {

	public double getMonthlyPayment(int mortgageTerm, double interestRate, int deposit, int price) {
		// TODO Auto-generated method stub
		double monthlyInterestRate = (interestRate/100) / 12;
		int mortgageAmount = price - deposit;
		int numberOfPayments = mortgageTerm * 12;
		
		double topHalf = 0.0;
		topHalf = mortgageAmount * monthlyInterestRate;
		topHalf = topHalf * Math.pow(1 + monthlyInterestRate, numberOfPayments);
		double bottomHalf = Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1;
		
		double payments = topHalf / bottomHalf;
		
		return payments;
	}

}
