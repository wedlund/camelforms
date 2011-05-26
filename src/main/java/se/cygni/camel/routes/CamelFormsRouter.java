package se.cygni.camel.routes;

import org.apache.camel.spring.SpringRouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class CamelFormsRouter extends SpringRouteBuilder {

	@Override
	public void configure() throws Exception {

//		from().to(activemq:queue);
		
	}

}
