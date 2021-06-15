package com.apirest.webflux;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import java.util.UUID;
import com.apirest.webflux.document.Playlist;
import com.apirest.webflux.repository.PlaylisyRepository;

import reactor.core.publisher.Flux;

//@Component
//public class DummyData implements CommandLineRunner {
//
//	private final PlaylisyRepository playlisyRepository;
//	
//	public DummyData(PlaylisyRepository playlisyRepository) {
//		this.playlisyRepository = playlisyRepository;
//	}
//	
//	@Override
//  public void run(String... args) throws Exception {
//
//		playlisyRepository.deleteAll()
//              .thenMany(
//                      Flux.just("API REST Spring Boot", "Deploy de uma aplicação java no IBM Cloud", "Java 8",
//                              "Github", "Spring Security", "Web Service RESTFULL", "Bean no Spring Framework")
//                              .map(nome -> new Playlist(UUID.randomUUID().toString(), nome))
//                              .flatMap(playlisyRepository::save))
//              .subscribe(System.out::println);
//  }
//}
