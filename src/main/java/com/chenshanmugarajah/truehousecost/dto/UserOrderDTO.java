package com.chenshanmugarajah.truehousecost.dto;

public class UserOrderDTO {

	private int mortgageTerm;
	private double mortgageRate;
	private int purchasePrice;
	private int deposit;
	private Boolean isFirstTimeBuyer;
	private Boolean isAdditionalProperty;
	private String councilName;
	private boolean isNewBuild;
	private boolean isGovernmentScheme;
	private boolean isHelpToBuyISA; 
	private boolean isLifetimeISA; 
	private boolean isRightToBuyScheme; 
	private boolean isAuction; 
	private boolean isLeaseHold;
	private boolean isEngland;
	
	
	public UserOrderDTO() {
		// TODO Auto-generated constructor stub
	}

	public UserOrderDTO(int mortgageTerm, double mortgageRate, int purchasePrice, int deposit, Boolean isFirstTimeBuyer,
			Boolean isAdditionalProperty, String councilName, boolean isNewBuild, boolean isGovernmentScheme,
			boolean isHelpToBuyISA, boolean isLifetimeISA, boolean isRightToBuyScheme, boolean isAuction,
			boolean isLeaseHold, boolean isEngland) {
		super();
		this.mortgageTerm = mortgageTerm;
		this.mortgageRate = mortgageRate;
		this.purchasePrice = purchasePrice;
		this.deposit = deposit;
		this.isFirstTimeBuyer = isFirstTimeBuyer;
		this.isAdditionalProperty = isAdditionalProperty;
		this.councilName = councilName;
		this.isNewBuild = isNewBuild;
		this.isGovernmentScheme = isGovernmentScheme;
		this.isHelpToBuyISA = isHelpToBuyISA;
		this.isLifetimeISA = isLifetimeISA;
		this.isRightToBuyScheme = isRightToBuyScheme;
		this.isAuction = isAuction;
		this.isLeaseHold = isLeaseHold;
		this.isEngland = isEngland;
	}



	public String getCouncilName() {
		return councilName;
	}

	public void setCouncilName(String councilName) {
		this.councilName = councilName;
	}

	public Boolean getIsFirstTimeBuyer() {
		return isFirstTimeBuyer;
	}

	public void setIsFirstTimeBuyer(Boolean isFirstTimeBuyer) {
		this.isFirstTimeBuyer = isFirstTimeBuyer;
	}

	public Boolean getIsAdditionalProperty() {
		return isAdditionalProperty;
	}

	public void setIsAdditionalProperty(Boolean isAdditionalProperty) {
		this.isAdditionalProperty = isAdditionalProperty;
	}

	public int getMortgageTerm() {
		return mortgageTerm;
	}

	public void setMortgageTerm(int mortgageTerm) {
		this.mortgageTerm = mortgageTerm;
	}

	public double getMortgageRate() {
		return mortgageRate;
	}

	public void setMortgageRate(double mortgageRate) {
		this.mortgageRate = mortgageRate;
	}

	public int getPurchasePrice() {
		return purchasePrice;
	}

	public void setPurchasePrice(int purchasePrice) {
		this.purchasePrice = purchasePrice;
	}

	public int getDeposit() {
		return deposit;
	}

	public void setDeposit(int deposit) {
		this.deposit = deposit;
	}

	public boolean isNewBuild() {
		return isNewBuild;
	}

	public void setNewBuild(boolean isNewBuild) {
		this.isNewBuild = isNewBuild;
	}

	public boolean isGovernmentScheme() {
		return isGovernmentScheme;
	}

	public void setGovernmentScheme(boolean isGovernmentScheme) {
		this.isGovernmentScheme = isGovernmentScheme;
	}

	public boolean isHelpToBuyISA() {
		return isHelpToBuyISA;
	}

	public void setHelpToBuyISA(boolean isHelpToBuyISA) {
		this.isHelpToBuyISA = isHelpToBuyISA;
	}

	public boolean isLifetimeISA() {
		return isLifetimeISA;
	}

	public void setLifetimeISA(boolean isLifetimeISA) {
		this.isLifetimeISA = isLifetimeISA;
	}

	public boolean isRightToBuyScheme() {
		return isRightToBuyScheme;
	}

	public void setRightToBuyScheme(boolean isRightToBuyScheme) {
		this.isRightToBuyScheme = isRightToBuyScheme;
	}

	public boolean isAuction() {
		return isAuction;
	}

	public void setAuction(boolean isAuction) {
		this.isAuction = isAuction;
	}

	public boolean isLeaseHold() {
		return isLeaseHold;
	}

	public void setLeaseHold(boolean isLeaseHold) {
		this.isLeaseHold = isLeaseHold;
	}

	public boolean isEngland() {
		return isEngland;
	}

	public void setEngland(boolean isEngland) {
		this.isEngland = isEngland;
	}

}
