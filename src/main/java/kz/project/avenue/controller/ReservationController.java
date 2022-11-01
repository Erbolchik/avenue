package kz.project.avenue.controller;

import kz.project.avenue.dto.Message;
import kz.project.avenue.json.ReservationResponseJson;
import kz.project.avenue.service.api.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/reservation/v1")
public class ReservationController {

    @Autowired
    private ReservationService reservationService;

    @Autowired
    private SimpMessagingTemplate messagingTemplate;

    @PostMapping("reservation/{cafeId}/{tableId}")
    public ReservationResponseJson reservation(@PathVariable(required = true, value = "cafeId") Long cafeId,
                                               @PathVariable(required = true, value = "tableId") Long tableId) {
        return reservationService.reservation(cafeId, tableId);
    }

    @MessageMapping("/ws")
    public void reservation(@Payload Message message) {
    }
}
