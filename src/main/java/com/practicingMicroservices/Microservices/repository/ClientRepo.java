package com.practicingMicroservices.Microservices.repository;


import com.practicingMicroservices.Microservices.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepo extends JpaRepository<Client,Integer> {
}
