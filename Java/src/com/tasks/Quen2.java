package com.tasks;

import java.util.function.Function;
class SensorData{
	private double temparature;
	private double humidity;

	public SensorData(double temparature,double humidity) {
		this.temparature=temparature;
		this.humidity=humidity;
	}
	
	public double getTemp() {
		return temparature;
	}
	
	public double getHumidity() {
		return humidity;
	}

	public void setHumidity(double humidity) {
		this.humidity = humidity;
	}

	public double setTemp(double temparature) {
		return this.temparature=temparature;
	}

}
public class Quen2 {

	public static void main(String[] args) {
		SensorData data= new SensorData(30.5,65.5);
		double threshold=25.0;
		Function<SensorData, Double> getTemp= new Function<SensorData, Double>(){

			@Override
			public Double apply(SensorData t) {
				return t.getTemp();
			}
		};
		double temparature =getTemp.apply(data);
		System.out.println(temparature);
		Function<Double, Boolean> checkTemp =new Function<Double, Boolean>(){

			@Override
			public Boolean apply(Double temp) {
				return temp>threshold;
			}
		};
		
		boolean res=checkTemp.apply(temparature);
		System.out.println(res);
	}

}
