package kz.project.avenue.controller;

import kz.project.avenue.json.MenuJson;
import kz.project.avenue.service.impl.MenuServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping(value = "api/menu/v1")
public class MenuController {

    @Autowired
    private MenuServiceImpl menuService;


    @GetMapping
    public List<MenuJson> getMenuList(){
        return menuService.getMenuList();
    }

    @GetMapping("/{cafeId}")
    public MenuJson getMenu(@PathVariable(value = "cafeId") Long cafeId) {
        return menuService.getMenu(cafeId);
    }

}
