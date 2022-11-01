package kz.project.avenue.json;

import lombok.Data;

import java.util.Date;

@Data
public class ReservationResponseJson {
    private String name;
    private String street;
    private Date closeTime;
    private Long reservationId;
}
