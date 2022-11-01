package kz.project.avenue.service.api;

import kz.project.avenue.json.ReservationResponseJson;

public interface ReservationService {
    public ReservationResponseJson reservation(Long cafeId, Long tableId);
}
