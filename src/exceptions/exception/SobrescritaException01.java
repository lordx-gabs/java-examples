package exceptions.exception;

import exceptions.exception.domain.Funcionario;
import exceptions.exception.domain.Pessoa;

import java.io.FileNotFoundException;

public class SobrescritaException01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();
        try {
            funcionario.salvar();
        } catch (LoginInvalidException e) {
            throw new RuntimeException(e);
        }

        try {
            pessoa.salvar();
        } catch (LoginInvalidException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
