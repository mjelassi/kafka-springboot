package com.sb.kafka;

import java.util.Arrays;
import java.util.Collection;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/logs")
public class LogstashController {
	
	Logger logger = LogManager.getLogger(LogstashController.class);
	
	public LogstashController() {}
	
    @GetMapping("/send")
    public Collection<String> send(@RequestParam(required = false) String message) {
    	String msg = (message != null && !message.isEmpty() ? message : "");
    	logger.trace("A TRACE Message");
        logger.debug("A DEBUG Message");
        logger.info("An INFO Message");
        logger.warn("A WARN Message");
        logger.error("An ERROR Message");
        return Arrays.asList("Send hello to kafka!", msg);
    }
    
}
