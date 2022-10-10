package kz.project.avenue.domain;

public enum ReservationStatus {
    WAITING(0), CANCEL(1), SUCCESS(2);

    private int value;

    ReservationStatus(int value) {
        this.value = value;
    }
}
