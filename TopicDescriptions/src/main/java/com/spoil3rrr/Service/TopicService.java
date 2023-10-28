package com.spoil3rrr.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spoil3rrr.Dao.TopicsRepo;
import com.spoil3rrr.Entity.Topics;

@Service
public class TopicService {
	@Autowired
	private TopicsRepo repo;
	
	
	public List<Topics> getTopics(){
		return repo.findAll();
	}
	
	public List<Topics> saveTopics(List<Topics> topics) {
		return repo.saveAll(topics);
	}
}
