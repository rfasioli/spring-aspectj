package br.com.rfasioli.springaspectjdemo;

import br.com.rfasioli.springaspectjdemo.service.Business1;
import br.com.rfasioli.springaspectjdemo.service.Business2;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringAspectjDemoApplicationTests {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private Business1 business1;

	@Autowired
	private Business2 business2;

	@Test
	void contextLoads() {
	}

	@Test
	public void invokeAOPStuff() {
		logger.info(business1.calculateSomething());
		logger.info(business2.calculateSomething());
	}
}
