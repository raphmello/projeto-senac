package com.raphael.pi.senac.service;

import com.raphael.pi.senac.models.FileNameEnum;
import com.raphael.pi.senac.models.SalvavelEmTxt;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TxtService {

    public static String SAVE_FILE_PATH = "C:\\workspace\\";

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
        if (!SAVE_FILE_PATH.endsWith("\\")){
            throw new IOException("Caminho espeficificado deve terminar com '\\'");
        }
        File f = new File(SAVE_FILE_PATH + fileName);
        if(f.exists() && !f.isDirectory()) {
            return new FileWriter(SAVE_FILE_PATH + fileName,true);
        }

        return new FileWriter(SAVE_FILE_PATH + fileName,false);
    }

    public void listar(Class<? extends SalvavelEmTxt> clazz) {
        FileNameEnum fileNameEnum = FileNameEnum.findByClass(clazz);
        final String FILE_NAME = fileNameEnum.getFileName();
        try(FileReader fileReader = new FileReader(SAVE_FILE_PATH + FILE_NAME)) {
            int content;
            System.out.print("------> ");
            while ((content = fileReader.read()) != -1) {
                System.out.print((char) content);
                if (content == 10) {
                    System.out.print("------> ");
                }
            }
            System.out.print("FIM DO ARQUIVO\n\n");
        } catch (IOException ex) {
            System.out.printf("------> Nenhum %s cadastrado.\n\n", clazz.getSimpleName().toLowerCase());
        }

    }
}
