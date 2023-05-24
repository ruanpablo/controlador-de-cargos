package com.springdata.spring.data;

import com.springdata.spring.data.model.Cargo;
import com.springdata.spring.data.repository.CargoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

	private final CargoRepository cargoRepository;//precisa inicializar

	public Application(CargoRepository cargoRepository) {
		this.cargoRepository = cargoRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Cargo cargo = new Cargo();
		cargo.setDescricao("DESENVOLVEDOR DE SOFTWARE");
		cargoRepository.save(cargo);
	}
}
