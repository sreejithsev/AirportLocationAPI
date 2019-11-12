package com.dev.graphql.mutator;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.dev.graphql.entity.Location;
import com.dev.graphql.exception.LocationNotFoundException;
import com.dev.graphql.service.LocationService;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class Mutation implements GraphQLMutationResolver {

    private LocationService locationService;

    public Mutation(LocationService locationService) {
        this.locationService = locationService;
    }

    public Location newLocation(String name, String address) {
        Location location = new Location(name, address);
        locationService.saveLocation(location);
        return location;
    }
    public boolean deletionLocation(Long id) {
        locationService.deleteLocation(id);
        return true;
    }
    public Location updateLocationName(String newName, Long id) {
        Optional<Location> optionalLocation = locationService.findLocationById(id);

        if(optionalLocation.isPresent()) {
            Location location = optionalLocation.get();
            location.setName(newName);
            locationService.saveLocation(location);
            return location;
        } else {
            throw new LocationNotFoundException("Location Not Found", id);
        }
    }
}
