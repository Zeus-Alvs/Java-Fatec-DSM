package br.edu.fatecpg.db;
import br.edu.fatecpg.model.Empresa;
import br.edu.fatecpg.model.Socio;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DbCnpj {

    public void salvar(Empresa empresa){
        String sqlEmpresa = "INSERT INTO empresa(cnpj, razao_social, nome, logradouro) VALUES (?,?,?,?)";
        String sqlSocio = "INSERT INTO socio(cnpj_empresa, nome_socio, documento_socio, qualificacao) VALUES (?,?,?,?)";

        try (Connection conn = Conexao.pegarConexao()){

            PreparedStatement stmtEmpresa = conn.prepareStatement(sqlEmpresa);
            stmtEmpresa.setString(1, empresa.getCnpj());
            stmtEmpresa.setString(2, empresa.getRazao_social());
            stmtEmpresa.setString(3, empresa.getNome_fantasia());
            stmtEmpresa.setString(4, empresa.getLogradouro());

            stmtEmpresa.executeUpdate();
            stmtEmpresa.close();

            if(empresa.getQsa() != null) {
                for (Socio socio : empresa.getQsa()){
                    PreparedStatement stmtSocio = conn.prepareStatement(sqlSocio);

                    stmtSocio.setString(1, empresa.getCnpj());
                    stmtSocio.setString(2, socio.getNome_socio());
                    stmtSocio.setString(3, socio.getDocumento_socio());
                    stmtSocio.setString(4, socio.getQualificacao());

                    stmtSocio.executeUpdate();
                    stmtSocio.close();
                }
            }

            System.out.println("Empresa e socios salvos com sucesso!");

        } catch (SQLException e){
            System.out.println("Erro ao salvar no banco!" + e.getMessage());
        }
    }
}
