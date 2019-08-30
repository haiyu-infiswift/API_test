package com.example.RestAPI;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface restRepositoryOnDemandBackfillTrigger extends JpaRepository<OnDemandBackfillTrigger, Integer> {
	List<OnDemandBackfillTrigger> findAllById(int id);
}