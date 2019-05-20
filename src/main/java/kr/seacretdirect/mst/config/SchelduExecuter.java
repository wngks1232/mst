package kr.seacretdirect.mst.config;

import java.util.Date;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.messaging.converter.StringMessageConverter;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import kr.seacretdirect.mst.data.service.DataSelectServiceImplements;

@Component
public class SchelduExecuter {
	private static final Logger logger = LoggerFactory.getLogger(SchelduExecuter.class);
	
	@Inject
	private DataSelectServiceImplements service;
	
	@Inject
	private SimpMessagingTemplate mess;
	
	@Scheduled(fixedDelay = 3000)
	private void schedul() {
		try {
			mess.setMessageConverter(new StringMessageConverter());
			mess.convertAndSend("/subscribe/notice",new Date().toString()+" / test");	
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
}
