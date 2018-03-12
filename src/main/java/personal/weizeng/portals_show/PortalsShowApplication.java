package personal.weizeng.portals_show;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class PortalsShowApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		ApplicationContext app = SpringApplication.run(PortalsShowApplication.class, args);
	}
}
