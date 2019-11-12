package com.dev.graphql.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.dev.graphql.entity.Location;
import com.dev.graphql.service.LocationService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Query implements GraphQLQueryResolver {

    private LocationService locationService;

    public Query(LocationService locationService) {
        this.locationService = locationService;
    }

    public List<Location> findAllLocations(){
        return locationService.retrieveLocations();
    }
}
