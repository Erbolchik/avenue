package kz.project.avenue.service.impl;

import kz.project.avenue.domain.Reservation;
import kz.project.avenue.domain.ReservationStatus;
import kz.project.avenue.json.TableJson;
import kz.project.avenue.repository.ReservationRepository;
import kz.project.avenue.repository.TableRepository;
import kz.project.avenue.service.api.CafeService;
import liquibase.pro.packaged.A;
import liquibase.pro.packaged.O;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CafeServiceImpl implements CafeService {

    @Autowired
    private ReservationRepository reservationRepository;

    @Autowired
    private TableRepository tableRepository;



    @Override
    public List<TableJson> getMyTables() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        List<Reservation> reservationList = reservationRepository.findByCafeIdAndWaiterId(1L, 1L);
        List<TableJson> tableJsons = new ArrayList<>();
        for (Reservation reservation : reservationList) {
            TableJson tableJson = new TableJson();
            tableJson.setTableId(reservation.getTableId());
            tableJson.setNumber(tableRepository.findById(reservation.getTableId()).get().getNumber());
            tableJsons.add(tableJson);
        }
        return tableJsons;
    }

    @Override
    public List<TableJson> getWaitingTables() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        List<Reservation> reservationList = reservationRepository.findByCafeIdAndStatus(1L, ReservationStatus.WAITING);
        List<TableJson> tableJsons = new ArrayList<>();
        for (Reservation reservation : reservationList) {
            TableJson tableJson = new TableJson();
            tableJson.setTableId(reservation.getTableId());
            tableJson.setNumber(tableRepository.findById(reservation.getTableId()).get().getNumber());
            tableJsons.add(tableJson);
        }
        return tableJsons;
    }

}
