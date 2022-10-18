package kz.project.avenue.controller;

import kz.project.avenue.json.MenuJson;
import kz.project.avenue.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping(value = "api/v1/menu")
public class MenuController {

    @Autowired
    private MenuService menuService;


    @GetMapping
    public List<MenuJson> getMenuList(){
        return menuService.getMenuList();
    }

    @GetMapping("/{id}")
    public void getMenu(@RequestParam(value = "id") Long id){

    }

    @DeleteMapping("/{id}")
    public void delete(@RequestParam(value = "id") Long id){

    }

    @PostMapping()
    public void create(){

    }





}
