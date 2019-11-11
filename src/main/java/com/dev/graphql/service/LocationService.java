package com.dev.graphql.service;


import com.dev.graphql.entity.Location;

import java.util.List;

public interface LocationService {
    List<Location> retrieveLocations();
}
