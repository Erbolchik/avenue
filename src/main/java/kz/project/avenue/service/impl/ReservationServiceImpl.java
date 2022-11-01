package kz.project.avenue.service.impl;

import kz.project.avenue.domain.Cafe;
import kz.project.avenue.domain.Reservation;
import kz.project.avenue.domain.ReservationStatus;
import kz.project.avenue.json.CafeJson;
import kz.project.avenue.json.ReservationResponseJson;
import kz.project.avenue.repository.CafeRepository;
import kz.project.avenue.repository.ReservationRepository;
import kz.project.avenue.service.api.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class ReservationServiceImpl implements ReservationService {

    @Autowired
    private CafeRepository cafeRepository;

    @Autowired
    private ReservationRepository reservationRepository;


    @Override
    public ReservationResponseJson reservation(Long cafeId, Long tableId) {
        Cafe cafe = cafeRepository.findById(cafeId).get();

        try {

            if (cafe != null) {
                Reservation reservation = new Reservation();
                reservation.setCafeId(cafeId);
                reservation.setStatus(ReservationStatus.WAITING);
                reservation.setTableId(tableId);
                reservationRepository.save(reservation);

                ReservationResponseJson responseJson = new ReservationResponseJson();
                responseJson.setName(cafe.getName());
                responseJson.setStreet(cafe.getStreet());
                responseJson.setCloseTime(new Date());
                responseJson.setReservationId(reservation.getId());
                return responseJson;
            }

        } catch (Exception e) {
            throw new RuntimeException("Error");
        }
        throw new RuntimeException("Error");
    }
}
