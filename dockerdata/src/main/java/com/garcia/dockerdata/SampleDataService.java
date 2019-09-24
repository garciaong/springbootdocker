package com.garcia.dockerdata;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

@Service
public class SampleDataService {

	public SampleData getSampleData(SampleData request) {
		List<SampleData> dataList = Arrays.asList(new SampleData(1,"First information"),new SampleData(2,"Second information"),
				new SampleData(3,"Third information"));
		List<SampleData> result = dataList.stream().filter(data -> data.getId() == request.getId()).collect(Collectors.toList());
		if(result.size()==1) {
			return result.get(0);
		} else {
			return null;
		}
	}
	
}
