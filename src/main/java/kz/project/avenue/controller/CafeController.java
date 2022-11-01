package kz.project.avenue.controller;

import kz.project.avenue.json.TableJson;
import kz.project.avenue.service.api.CafeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping(value = "api/cafe/v1")
public class CafeController {

    @Autowired
    private CafeService cafeService;

    @GetMapping("tables/waiting")
    public List<TableJson> getWaitingTables() {
        return cafeService.getWaitingTables();
    }
    @GetMapping("tables")
    public List<TableJson> getMyTables() {
        return cafeService.getMyTables();
    }

}
