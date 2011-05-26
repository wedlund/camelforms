package se.cygni.camel.routes;

import org.apache.camel.spring.SpringRouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class CamelFormsRouter extends SpringRouteBuilder {

	@Override
	public void configure() throws Exception {

//		from("servlet:///hello").to("activemq:queue:destinationQueue").transform().constant("OK");
		from("servlet:///camelform").transform().constant("You prefer camelforms");
		from("servlet:///hello").transform().constant("You prefer hello");
		
	}

}
