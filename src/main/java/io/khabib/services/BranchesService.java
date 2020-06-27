package io.khabib.services;

import io.khabib.entities.Branch;
import io.khabib.model.Branches;
import io.khabib.repositories.BranchesRepository;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class BranchesService {
    private final BranchesRepository branchesRepository;

    public BranchesService(BranchesRepository branchesRepository) {
        this.branchesRepository = branchesRepository;
    }

    public Optional<Branches> getBranch(Long id){
        Branch branch = branchesRepository.findOne(id);
        if (branch==null) return Optional.empty();
        return Optional.of(branchToDto(branch));
    }

    private Branches branchToDto(Branch branch){
        Branches branches = new Branches();
        branches.setId(branch.getId());
        branches.setAddress(branch.getAddress());
        branches.setLat(branch.getLat());
        branches.setLon(branch.getLon());
        branches.setTitle(branch.getTitle());
        return branches;
    }

    public Branches getNearest(Double lat, Double lon){
        List<Branch> branches = branchesRepository.findAll();
        Map<Double, Branch> branchesMap =branches.stream().collect(Collectors.toMap(branch -> distance(lat, branch.getLat(), lon, branch.getLon()), branch -> branch));
        Optional<Double> min = branchesMap.keySet().stream().min(Comparator.comparingDouble(x -> x));
        Double minDistance = min.get();
        Branches result = branchToDto(branchesMap.get(minDistance));
        result.setDistance(Math.round(minDistance*1000));
        return result;
    }

    public static double distance(double lat1,
                                  double lat2, double lon1,
                                  double lon2)
    {

        // The math module contains a function
        // named toRadians which converts from
        // degrees to radians.
        lon1 = Math.toRadians(lon1);
        lon2 = Math.toRadians(lon2);
        lat1 = Math.toRadians(lat1);
        lat2 = Math.toRadians(lat2);

        // Haversine formula
        double dlon = lon2 - lon1;
        double dlat = lat2 - lat1;
        double a = Math.pow(Math.sin(dlat / 2), 2)
                + Math.cos(lat1) * Math.cos(lat2)
                * Math.pow(Math.sin(dlon / 2),2);

        double c = 2 * Math.asin(Math.sqrt(a));

        // Radius of earth in kilometers. Use 3956
        // for miles
        double r = 6371;

        // calculate the result
        return(c * r);
    }
}
