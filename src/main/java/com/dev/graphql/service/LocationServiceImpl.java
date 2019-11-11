package com.dev.graphql.service;

import com.dev.graphql.entity.Location;
import com.dev.graphql.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationServiceImpl implements LocationService {

    @Autowired
    LocationRepository locationRepository;

    @Override
    public List<Location> retrieveLocations() {
        return (List<Location>)locationRepository.findAll();
    }
}
