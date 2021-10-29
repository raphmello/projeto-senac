package com.raphael.pi.senac;

import com.raphael.pi.senac.service.MenuService;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        MenuService menuService = new MenuService();
        menuService.inicio();
    }

}
