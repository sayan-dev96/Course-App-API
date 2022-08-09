package io.javabrains.springbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
// Singleton
	
	// Immutable list; Values cannot be add/edited/deleted
//	private List<Topic> topics = Arrays.asList(
//			new Topic("1", "Spring", "Spring Description"),
//			new Topic("2", "Spring MVC", "Spring MVC Description"),
//			new Topic("3", "Spring Boot", "Spring Boot Description")
//			);
	
	// Mutable; The prev list is passed as argument to the ArrayList constructor
	// So a copy of the immutable list is created which can now be edited
	private List<Topic> topics = new ArrayList<>(Arrays.asList(
			new Topic("1", "Spring", "Spring Description"),
			new Topic("2", "Spring MVC", "Spring MVC Description"),
			new Topic("3", "Spring Boot", "Spring Boot Description")
			));
	
	public List<Topic> getAllTopics() {
		return topics;	// Only one copy initialized
	}
	
	public Topic getTopic(String id) {
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}
	
	public void addTopic(Topic topic) {
		topics.add(topic);
	}

	public void updateTopic(String id, Topic topic) {
		for (int i=0; i < topics.size(); i++) {
			Topic t = topics.get(i);
			if (t.getId().equals(id)) {
				topics.set(i, topic);
				return;
			}
		}
		
	}

	public void deleteTopic(String id) {
		topics.removeIf(t -> t.getId().equals(id));
		return;
	}
	
}
