package com.raphael.pi.senac.models;

public enum FileNameEnum {
    ALUNOS("alunos.txt",Aluno.class),
    PROFESSORES("professores.txt", Professor.class),
    FORNECEDORES("fornecedores.txt", Fornecedor.class);

    String fileName;
    Class clazz;

    FileNameEnum(String fileName, Class clazz) {
        this.fileName = fileName;
        this.clazz = clazz;
    }

    public String getFileName() {
        return fileName;
    }

    public static FileNameEnum findByClass(Class clazz){
        for(FileNameEnum e : values()){
            if( e.clazz.equals(clazz)){
                return e;
            }
        }
        return null;
    }
}
