package org.acme.${{values.java_package_name}};

import javax.enterprise.context.ApplicationScoped;

import org.apache.camel.builder.RouteBuilder;

import static java.lang.String.format;

@ApplicationScoped
public class TimerRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {

        from("timer:foo?period={{timer.period}}")
                .log("Fire timer!")
                .to("log:timer");
    }
}

