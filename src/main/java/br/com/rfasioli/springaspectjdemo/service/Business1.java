package br.com.rfasioli.springaspectjdemo.service;

import br.com.rfasioli.springaspectjdemo.aop.TrackTime;
import br.com.rfasioli.springaspectjdemo.repository.Dao1;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class Business1 {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    private final Dao1 dao1;

    public Business1(Dao1 dao1) {
        this.dao1 = dao1;
    }

    @TrackTime
    public String calculateSomething() {
        String value = dao1.retrieveSomething();
        logger.info("In Business - {}", value);
        return value;
    }
}