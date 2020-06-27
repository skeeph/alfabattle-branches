package io.khabib.repositories;

import io.khabib.entities.Branch;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BranchesRepository extends JpaRepository<Branch, Long> {
}
