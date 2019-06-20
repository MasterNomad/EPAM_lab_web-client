package com.web.service.server.SOPARESTwebclient;

import com.web.service.server.SOPARESTwebclient.connector.SOAPConnector;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import user.wsdl.ReadUserRequest;
import user.wsdl.ReadUserResponse;

import java.math.BigInteger;

@SpringBootApplication
public class SopaRestWebClientApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(SopaRestWebClientApplication.class, args);
	}

}
