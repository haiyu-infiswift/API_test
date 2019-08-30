package com.example.RestAPI;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface restRepositoryOneHourStatus extends CrudRepository<OneHourStatus, Integer> {

}

