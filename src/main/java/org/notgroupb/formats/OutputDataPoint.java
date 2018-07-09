package org.notgroupb.formats;

import java.time.LocalDateTime;

public class OutputDataPoint {
	
	private String name; 
	
	private double lat;
	
	private double lon;
	
	private double score;
	
	private LocalDateTime recordTime;

	public double getLat() {
		return lat;
	}

	public void setLat(double lat) {
		this.lat = lat;
	}

	public double getLon() {
		return lon;
	}

	public void setLon(double lon) {
		this.lon = lon;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	public LocalDateTime getRecordTime() {
		return recordTime;
	}

	public void setRecordTime(LocalDateTime recordTime) {
		this.recordTime = recordTime;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	// Converts Object into JSON String
	public String toString()
    {
        return"{ \"station\":" +"\"" +this.name +"\","+
                " \"recordTime\":\"" +this.recordTime +"\","+
                " \"lat\":" +this.lat +","+
                " \"lon\":" +this.lon +","+
                " \"score\":" +this.score +" }";
    }

}
