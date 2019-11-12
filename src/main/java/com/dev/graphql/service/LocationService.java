package com.dev.graphql.service;


import com.dev.graphql.entity.Location;

import java.util.List;
import java.util.Optional;

public interface LocationService {
    List<Location> retrieveLocations();
    void saveLocation(Location location);
    void deleteLocation(Long id);
    Optional<Location> findLocationById(Long id);
}
