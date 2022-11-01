package kz.project.avenue.json;

import lombok.Data;

import java.util.Date;

@Data
public class CafeJson {
    private String name;
    private String street;
    private Date closeTime;
}
