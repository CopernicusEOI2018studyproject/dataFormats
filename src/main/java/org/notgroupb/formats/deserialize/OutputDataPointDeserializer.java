package org.notgroupb.formats.deserialize;

import java.util.Map;

import org.apache.kafka.common.serialization.Deserializer;
import org.notgroupb.formats.OutputDataPoint;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

// Taken from https://dzone.com/articles/kafka-sending-object-as-a-message
public class OutputDataPointDeserializer implements Deserializer<OutputDataPoint> {
	
	public void configure(Map<String, ?> arg0, boolean arg1) {}

	public OutputDataPoint deserialize(String arg0, byte[] arg1) {
		ObjectMapper mapper = new ObjectMapper();
		mapper.registerModule(new JavaTimeModule());
		OutputDataPoint data = null;

		try {
			data = mapper.readValue(arg1, OutputDataPoint.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return data;
	}

	public void close() {}
}
