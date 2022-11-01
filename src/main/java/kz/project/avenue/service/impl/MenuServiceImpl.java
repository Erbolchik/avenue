package kz.project.avenue.service.impl;

import kz.project.avenue.domain.Menu;
import kz.project.avenue.json.MenuJson;
import kz.project.avenue.repository.MenuRepository;
import kz.project.avenue.service.api.MenuService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MenuServiceImpl implements MenuService {

    @Autowired
    private MenuRepository menuRepository;

    public List<MenuJson> getMenuList() {
        List<Menu> menuList = menuRepository.findAll();
        List<MenuJson> menuJsonList = new ArrayList<>();
        BeanUtils.copyProperties(menuJsonList, menuList);
        return menuJsonList;
    }

    public MenuJson getMenu(Long cafeId) {
        Menu menu = menuRepository.findByCafeId(cafeId);
        MenuJson menuJson = new MenuJson();
        BeanUtils.copyProperties(menu, menuJson);
        return menuJson;
    }

}
