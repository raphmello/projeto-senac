package com.raphael.pi.senac;

import com.raphael.pi.senac.service.MenuService;
import com.raphael.pi.senac.service.TxtService;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try{
            MenuService menuService = new MenuService();
            menuService.inicio();
        } catch (IOException ex) {
            System.out.print( "\n------> Pode ser que o caminho especificado na classe TxtService não exista ou não tenha autorização.\n" +
                                "------> Caminho especificado atual: " + TxtService.SAVE_FILE_PATH + "\n" +
                                "------> Dica: troque o caminho na classe TxtService. Evite utilizar a raiz do sistema operacional e/ou tente criar uma pasta.\n");
            System.out.print("------> ERRO:" + ex.getMessage() + "\n\n");
        }
    }

}
