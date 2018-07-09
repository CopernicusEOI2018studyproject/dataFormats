package org.notgroupb.formats.serialize;

import java.util.Map;

import org.apache.kafka.common.serialization.Serializer;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

// Taken from https://dzone.com/articles/kafka-sending-object-as-a-message
public class DataPointSerializer<T> implements Serializer<T> {
	

	public void configure(Map<String, ?> map, boolean b) {}

	public byte[] serialize(String arg0, T arg1) {
		byte[] retVal = null;
		ObjectMapper mapper = new ObjectMapper();
		mapper.registerModule(new JavaTimeModule());
		
		try {
			retVal = mapper.writeValueAsString(arg1).getBytes();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return retVal;
	}

	public void close() {}
}