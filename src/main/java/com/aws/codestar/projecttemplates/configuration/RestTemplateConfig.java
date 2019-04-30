package com.aws.codestar.projecttemplates.configuration;

import java.io.IOException;

import org.apache.http.impl.client.CloseableHttpClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.http.client.support.BasicAuthorizationInterceptor;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfig {

	class AuthObj {

		private String date;
		private String token;

		public AuthObj() {
			super();
			this.date = String.valueOf(System.currentTimeMillis());
			try {
				this.token = com.aws.codestar.projecttemplates.suppot.Skein512Small.hash(date);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		public String getDate() {
			return date;
		}

		public String getToken() {
			return token;
		}
	}
	
	@Autowired
	CloseableHttpClient httpClient;

	@Bean
	public RestTemplate restTemplate() {
		RestTemplate restTemplate = new RestTemplate(clientHttpRequestFactory());	
//		restTemplate = restTemplateWithSalt(restTemplate);
		return restTemplate;
	}	
	
	private RestTemplate restTemplateWithSalt(RestTemplate restTemplate) {
        restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("Authorization", "Basic XXXXXXXXXXXXXXXX=");
        HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
        AuthObj authObj = new AuthObj();
        restTemplate.getInterceptors().add(new BasicAuthorizationInterceptor(authObj.getDate(), authObj.getToken()));
		return restTemplate;
		
	}

	@Bean
	public HttpComponentsClientHttpRequestFactory clientHttpRequestFactory() {
		HttpComponentsClientHttpRequestFactory clientHttpRequestFactory = new HttpComponentsClientHttpRequestFactory();
		clientHttpRequestFactory.setHttpClient(httpClient);
		return clientHttpRequestFactory;
	}

	@Bean
	public TaskScheduler taskScheduler() {
		ThreadPoolTaskScheduler scheduler = new ThreadPoolTaskScheduler();
		scheduler.setThreadNamePrefix("poolScheduler");
		scheduler.setPoolSize(50);
		return scheduler;
	}

}
