package com.sonata.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sonata.model.Topic;

@RestController
public class TopicController {
	@Autowired
	private TopicService topicService;
	
	@RequestMapping("/display")
	public List<Topic> displayData(){
		return topicService.getTopic();
	}
	
	@RequestMapping("/topic/{id}")
	public Topic getTopic(@PathVariable String id){
		return topicService.getSingleTopic(id);
	}
	@RequestMapping(method=RequestMethod.POST,value="/topics")
	public void addTopics(@RequestBody Topic topic) {
		topicService.addTopic(topic);
	}
	
}
