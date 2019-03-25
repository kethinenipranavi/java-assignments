package com.capgemini.training.model;

public class PublicTraining extends Training{

	private int participents;

	public PublicTraining() {
		super();
			}

	public PublicTraining(int id, String subject, double fees,int participents) {
		super(id, subject, fees);
		this.participents=participents;
	}
	
	public int getParticipents() {
		return participents;
	}

	public void setParticipents(int participents) {
		this.participents = participents;
	}

	@Override
	public double getOrderValue() {
		
		return getFees()*getParticipents();
	}

}
