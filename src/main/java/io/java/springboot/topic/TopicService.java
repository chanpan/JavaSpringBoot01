package io.java.springboot.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	private List<Topic> topics = Arrays.asList(
		new Topic("Spring","Spring Framework", "Spring Framework Discription"),	
		new Topic("Java","Core Java", "Core Java Discription"),	
		new Topic("JavaScript","Core JavaScript", "Core JavaScript Discription")	
					
	);
	public List<Topic> getAllTopics(){
		return topics;
	}
	
	public Topic getTopic(String id) {
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}
	
	public void addTopic(Topic topic) {
		topics.add(topic);
	}
}
















