package com.sd.emperialfleet;

public class TieFighter {

	private String model;
	private float speed ;
	private float range;
	private double price;
	
	public TieFighter(String model, float speed, float range, double price)
	{
		this.model = model;
		this.speed = (speed * 0.00131f);
		this.range = range;
		this.price = price;
	}
	
	public String getModel() {
		return model;
	}




	public void setModel(String model) {
		this.model = model;
	}




	public float getSpeed() {
		return speed;
	}




	public void setSpeed(float speed) {
		this.speed = speed * 0.00131f;
	}




	public float getRange() {
		return range;
	}




	public void setRange(float range) {
		this.range = range;
	}




	public double getPrice() {
		return price;
	}




	public void setPrice(double price) {
		this.price = price;
	}




//	public  String ConvertToMach(){
//		float convo = (speed *0.00131f);
//		String con = String.format("%.02f", convo);
//		
//		return con;
	
	}
		


