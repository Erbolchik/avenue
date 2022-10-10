package kz.project.avenue.domain;

public class Reservation {
    private Long id;
    private Long tableId;
    private Long waiterId;
    private ReservationStatus status;
}

enum ReservationStatus {
    WAITING(0), CANCEL(1), SUCCESS(2);

    private int value;

    ReservationStatus(int value) {
        this.value = value;
    }
}
