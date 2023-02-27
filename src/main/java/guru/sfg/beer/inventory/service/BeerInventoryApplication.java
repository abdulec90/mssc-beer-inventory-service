package guru.sfg.beer.inventory.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class BeerInventoryApplication {

    public static void main(String[] args) {
        SpringApplication.run(BeerInventoryApplication.class, args);
    }

}
