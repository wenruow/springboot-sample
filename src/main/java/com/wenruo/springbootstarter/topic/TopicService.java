package com.wenruo.springbootstarter.topic;

import java.util.List;
import java.util.Arrays;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	List<Topic> topics = Arrays.asList(
			new Topic("spring","Spring Framework","Spring Framework description"),
			new Topic("Play","Play Framework","Play Framework description"),
			new Topic("Django","Django Framework","Django Framework description")
			);
	
	public List<Topic> getTopics() {
		return topics;
	}
	
	public Topic getTopic(String id) {
		for (Topic topic : topics) {
			if (topic.getId().equalsIgnoreCase(id)) {
				return topic;
			}
		}
		return null;
	}
}
