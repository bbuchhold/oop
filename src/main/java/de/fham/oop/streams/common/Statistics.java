package de.fham.oop.streams.common;

public class Statistics {
	
	private int count;
	private long sum;
	private int min;
	private int max;
	
	public Statistics(int count, long sum, int min, int max) {
		this.count = count;
		this.sum = sum;
		this.min = min;
		this.max = max;
	};
	
	public int getCount() {
		return this.count;
	}
	
	public long getSum() {
		return this.sum;
	}
	
	public int getMin() {
		return this.min;
	}
	
	public int getMax() {
		return this.max;
	}
	
	public double getAverage() {
		return this.sum / this.count;
	}
}