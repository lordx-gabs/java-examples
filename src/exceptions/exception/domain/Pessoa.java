package exceptions.exception.domain;

import exceptions.exception.LoginInvalidException;

import java.io.FileNotFoundException;

public class Pessoa {

    public void salvar() throws LoginInvalidException, FileNotFoundException {
        System.out.println("Salvando pessoa");
    }
}
