package br.edu.fatecpg.service;
import br.edu.fatecpg.db.*;
import br.edu.fatecpg.model.*;
import com.google.gson.Gson;

public class DbService {

    public void cadastrarFornecedor(String cnpjDigitado){

        String cnpjLimpo = cnpjDigitado.replaceAll("[^0-9]", "");

        try{
            System.out.println("Buscando na Api...");

            String jsonRetornado = ConsomeApi.buscarCnpj(cnpjLimpo);

            Gson gson = new Gson();
            Empresa empresa = gson.fromJson(jsonRetornado, Empresa.class);

            if(empresa != null && empresa.getCnpj() != null){
                DbCnpj banco = new DbCnpj();
                banco.salvar(empresa);
            } else {
                System.out.println("CNPJ não encontrado.");
            }

        } catch (Exception e) {
            System.out.println("Erro em alguma coisa: " + e.getMessage());
        }
    }
}