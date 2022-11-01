package kz.project.avenue.repository;

import kz.project.avenue.domain.CafeTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TableRepository extends JpaRepository<CafeTable,Long> {
}
