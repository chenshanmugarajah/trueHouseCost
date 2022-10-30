package com.chenshanmugarajah.truehousecost.service;

import org.springframework.stereotype.Service;

@Service
public class LawyerService {
	
	public double calculateLawyerFees(int purchasePrice, boolean isNewBuild, boolean isGovernmentScheme, boolean isHelpToBuyISA, boolean isLifetimeISA, boolean isRightToBuyScheme, boolean isAuction, boolean isLeaseHold, boolean isEngland) {
		
		double finalFee = purchasePrice * 0.0025;
		
		System.out.println("Lawyer fees are: " + finalFee);
		
		int telegraphicTransferFee = 35;
		int stampDutyFee = 95;
		int newBuildFee = 200;
		int helpToBuyFee = 750;
		int helpToBuyIsaFee = 50;
		int lifetimeIsaFee = 50;
		int rightToBuyFee = 0;
		int auctionPropertyFee = 0;
		int leaseholdFee = 350;
		int idChecksAndVerificationFee = 25;
		
		int os1 = 3;
		int k17 = 2;
		int landRegistryFee = 150;
		int searchFee = 350;
		
		finalFee += telegraphicTransferFee;
		finalFee += idChecksAndVerificationFee;
		finalFee += os1;
		finalFee += k17;
		finalFee += landRegistryFee;
		finalFee += searchFee;
		finalFee += stampDutyFee;
		
		finalFee += isNewBuild ? newBuildFee : 0;
		finalFee += isGovernmentScheme ? helpToBuyFee : 0;
		finalFee += isHelpToBuyISA ? helpToBuyIsaFee : 0;
		finalFee += isLifetimeISA ? lifetimeIsaFee : 0;
		finalFee += isRightToBuyScheme ? rightToBuyFee : 0;
		finalFee += isAuction ? auctionPropertyFee : 0;
		finalFee += isLeaseHold ? leaseholdFee : 0;
		
		return finalFee *= 1.10;
	}

}
