package io.java.springboot.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		return Arrays.asList(
			new Topic("Spring","Spring Framework", "Spring Framework Discription"),	
			new Topic("Java","Core Java", "Core Java Discription"),	
			new Topic("JavaScript","Core JavaScript", "Core JavaScript Discription")	
				
		);
	}
	
	
}
