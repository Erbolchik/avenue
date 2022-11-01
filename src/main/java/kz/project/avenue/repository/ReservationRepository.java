package kz.project.avenue.repository;

import kz.project.avenue.domain.Reservation;
import kz.project.avenue.domain.ReservationStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long> {
    public List<Reservation> findByCafeIdAndStatus(Long cafeId, ReservationStatus status);

    public List<Reservation> findByCafeIdAndWaiterId(Long cafeId, Long waiterId);

}
