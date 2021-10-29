package com.raphael.pi.senac.service;

import com.raphael.pi.senac.models.*;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TxtService {

    private final String SAVE_FILE_PATH = "C:\\workspace\\";

    public void salvarClasseEmTxt(SalvavelEmTxt classeParaSalvar) throws IOException {
        String str = classeParaSalvar.toString();
        FileNameEnum fileNameEnum = FileNameEnum.findByClass(classeParaSalvar.getClass());
        escreverNoArquivoTxt(str, fileNameEnum.getFileName());
    }

    private void escreverNoArquivoTxt(String str, String fileName) throws IOException {
        FileWriter fileWriter = criarFileWriter(fileName);
        fileWriter.write(str + "\n");
        fileWriter.close();
    }

    private FileWriter criarFileWriter(String fileName) throws IOException {
        File f = new File(SAVE_FILE_PATH + fileName);
        if(f.exists() && !f.isDirectory()) {
            return new FileWriter(SAVE_FILE_PATH + fileName,true);
        }
        return new FileWriter(SAVE_FILE_PATH + fileName,false);
    }

    public void listar(Class clazz) {
        FileNameEnum fileNameEnum = FileNameEnum.findByClass(clazz);
        final String FILE_NAME = fileNameEnum.getFileName();
        try(FileReader fileReader = new FileReader(SAVE_FILE_PATH + FILE_NAME)) {
            int content;
            while ((content = fileReader.read()) != -1) {
                System.out.print((char) content);
            }
        } catch (IOException ex) {
            System.out.printf("Nenhum %s cadastrado.%n", clazz.getSimpleName().toLowerCase());
        }
    }
}
