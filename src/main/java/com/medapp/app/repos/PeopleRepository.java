package com.medapp.app.repos;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.medapp.app.model.People;

public interface PeopleRepository extends PagingAndSortingRepository<People, Long> {
	Page<People> findAll(Pageable pagable);
}
