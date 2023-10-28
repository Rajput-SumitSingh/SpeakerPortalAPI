package com.spoil3rrr.Controll3r;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spoil3rrr.Entity.Topics;
import com.spoil3rrr.Service.ExternalAPIService;
import com.spoil3rrr.Service.TopicService;

@RestController
public class SpeakerControll3r {
	@Autowired
	private TopicService service;

	
	private ExternalAPIService externalAPIService ;
	
	public SpeakerControll3r(ExternalAPIService externalAPIService) {
        this.externalAPIService = externalAPIService;
    }
	
	@GetMapping("/")
	public ResponseEntity<?> getAllTopics(){
		return new ResponseEntity<>(service.getTopics(), HttpStatus.OK);
	}
	
	@PostMapping("/savetopic")
	public ResponseEntity<?> Topics(@RequestBody List<Topics> topics){
		return new ResponseEntity<>(service.saveTopics(topics), HttpStatus.CREATED);
	}

    @GetMapping("/getExternalData")
    public String getExternalData() {
        return externalAPIService.getExternalData();
    }
	
}
