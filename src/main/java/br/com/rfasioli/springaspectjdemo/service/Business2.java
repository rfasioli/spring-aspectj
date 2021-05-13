package br.com.rfasioli.springaspectjdemo.service;

import br.com.rfasioli.springaspectjdemo.repository.Dao2;
import org.springframework.stereotype.Service;

@Service
public class Business2 {

    private final Dao2 dao2;

    public Business2(Dao2 dao2) {
        this.dao2 = dao2;
    }

    public String calculateSomething() {
        //Business Logic
        return dao2.retrieveSomething();
    }
}
