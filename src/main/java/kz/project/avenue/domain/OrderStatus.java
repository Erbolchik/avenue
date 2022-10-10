package kz.project.avenue.domain;

public enum OrderStatus {
    IN_PROCESS(0), CANCEL(1), SUCCESS(2);

    private int value;

    OrderStatus(int value) {
        this.value = value;
    }
}
