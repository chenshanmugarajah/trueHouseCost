package com.chenshanmugarajah.truehousecost.dto;

public class ResponseOrderDTO {
	
	private double mortgageMonthlyPayment;
	private double stampDuty;
	private double carInsurance;
	private String cityMapperData;
	private double lawyerFees;
	private double totalFees;
	
	public ResponseOrderDTO() {
		super();
	}

	public ResponseOrderDTO(double mortgageMonthlyPayment, double stampDuty, double councilTax, String cityMapperData, double lawyerFees, double totalFees) {
		super();
		this.mortgageMonthlyPayment = mortgageMonthlyPayment;
		this.stampDuty = stampDuty;
		this.carInsurance = councilTax;
		this.cityMapperData = cityMapperData;
		this.lawyerFees = lawyerFees;
		this.totalFees = totalFees;
	}	

	public String getCityMapperData() {
		return cityMapperData;
	}

	public void setCityMapperData(String cityMapperData) {
		this.cityMapperData = cityMapperData;
	}

	public double getCarInsurance() {
		return carInsurance;
	}

	public void setCarInsurance(double carInsurance) {
		this.carInsurance = carInsurance;
	}

	public double getMortgageMonthlyPayment() {
		return mortgageMonthlyPayment;
	}

	public void setMortgageMonthlyPayment(double mortgageMonthlyPayment) {
		this.mortgageMonthlyPayment = mortgageMonthlyPayment;
	}

	public double getStampDuty() {
		return stampDuty;
	}

	public void setStampDuty(double stampDuty) {
		this.stampDuty = stampDuty;
	}

	public void setLawyerFees(double lawyerFees) {
		// TODO Auto-generated method stub
		this.lawyerFees = lawyerFees;
	}
	
	public double getLawyerFees() {
		return lawyerFees;
	}

	public double getTotalFees() {
		return totalFees;
	}

	public void setTotalFees(double totalFees) {
		this.totalFees = totalFees;
	}

}
