package com.dev.graphql.repository;

import com.dev.graphql.entity.Location;
import org.springframework.data.repository.CrudRepository;

public interface LocationRepository extends CrudRepository<Location, Long> {
}
