package org.notgroupb.formats;

import java.time.LocalDateTime;

public abstract class BasicDataPoint {

	private String name;
	private double lon;
	private double lat;
	private double measurement;
	private LocalDateTime recordTime;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getLon() {
		return lon;
	}

	public void setLon(double lon) {
		this.lon = lon;
	}

	public double getLat() {
		return lat;
	}

	public void setLat(double lat) {
			this.lat = lat;
	}

	public double getMeasurement() {
		return measurement;
	}

	public void setMeasurement(double measurement) {
		this.measurement = measurement;
	}

	public LocalDateTime getRecordTime() {
		return recordTime;
	}

	public void setRecordTime(LocalDateTime recordingTime) {
		this.recordTime = recordingTime;
	}

}