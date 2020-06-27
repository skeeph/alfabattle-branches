package io.khabib.services;

import io.khabib.entities.Branch;
import io.khabib.model.Branches;
import io.khabib.repositories.BranchesRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BranchesService {
    private final BranchesRepository branchesRepository;

    public BranchesService(BranchesRepository branchesRepository) {
        this.branchesRepository = branchesRepository;
    }

    public Optional<Branches> getBranch(Long id){
        Branch branch = branchesRepository.findOne(id);
        if (branch==null) return Optional.empty();
        Branches branches = new Branches();
        branches.setId(branch.getId());
        branches.setAddress(branch.getAddress());
        branches.setLat(branch.getLat());
        branches.setLon(branch.getLon());
        branches.setTitle(branch.getTitle());
        return Optional.of(branches);
    }
}
