package io.khabib.repositories;

import io.khabib.entities.Branch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface BranchesRepository extends CrudRepository<Branch, Long> {
}
