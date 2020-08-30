package com.docker.demo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@GetMapping("/allname")
	public static Map<String,HashMap<String,String>> getName() {
		HashMap<String,String> nameMap=new HashMap<String,String>();
		Map<String,HashMap<String,String>> nameIdMap=new HashMap<String,HashMap<String,String>>();
		nameMap.put("Shivansh", "IT");
		nameMap.put("Honey", "Software");
		nameMap.put("Ginni", "IHM");
		nameMap.put("Shivangi", "Hotel Management");
		nameIdMap.put("list", nameMap);
		return nameIdMap;
	}
	
	@PostMapping("/memberdetails")
	public static Integer postName(@RequestBody HashMap<String,String> member) {
		Integer response =0;
		int size = member.size();
		if(size>0)
			response+=size;
		return response;
	}
}
