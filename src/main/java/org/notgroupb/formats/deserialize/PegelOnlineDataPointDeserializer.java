package org.notgroupb.formats.deserialize;

import java.util.Map;

import org.apache.kafka.common.serialization.Deserializer;
import org.notgroupb.formats.PegelOnlineDataPoint;

import com.fasterxml.jackson.databind.ObjectMapper;

// Taken from https://dzone.com/articles/kafka-sending-object-as-a-message
public class PegelOnlineDataPointDeserializer implements Deserializer<PegelOnlineDataPoint> {
	
	public void configure(Map<String, ?> arg0, boolean arg1) {}

	public PegelOnlineDataPoint deserialize(String arg0, byte[] arg1) {
		ObjectMapper mapper = new ObjectMapper();
		PegelOnlineDataPoint data = null;

		try {
			data = mapper.readValue(arg1, PegelOnlineDataPoint.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return data;
	}

	public void close() {}
}
