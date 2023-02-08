package com.packt.cardatabase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.packt.cardatabase.domain.Car;
import com.packt.cardatabase.domain.CarRepository;
import com.packt.cardatabase.domain.Owner;
import com.packt.cardatabase.domain.OwnerRepository;

@SpringBootApplication
public class CardatabaseApplication {
	@Autowired
	private CarRepository repository;
	
	@Autowired
	private OwnerRepository orepository;
	public static void main(String[] args) {
		SpringApplication.run(CardatabaseApplication.class, args);
	}
	@Bean
	CommandLineRunner runner() {
		return args -> {
			Owner owner1 = new Owner("Jamueltom", "Angelim");
			Owner owner2 = new Owner("Rônald", "Macário");
			orepository.save(owner1);
			orepository.save(owner2);
			repository.save(new Car("Ford", "Ka", "Vermelho", "ADF-1121", 2017, 42000, owner1));
			repository.save(new Car("Honda", "Civic", "Preto", "ABC-0007", 1997, 15000, owner1));
			repository.save(new Car("Toyota", "Corolla", "Prata", "ASD-5526", 2022, 130000, owner2));
			
		};
	}

}
