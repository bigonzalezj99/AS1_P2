package dao;

import java.util.*;
import model.EmpresaEntity;

public class EmpresaDao {

    public EmpresaDao() {
    }

    public void createCompany(EmpresaEntity company) {  
    }

    public void deleteCompany(int id) {
    }

    public EmpresaEntity readCompanyById(int id) {
        EmpresaEntity theCompany = new EmpresaEntity();
        // Conexion a todos los datos.
        return theCompany;
    }
    
    public List<EmpresaEntity> readAllCompany() {
        List<EmpresaEntity> companyEntity = new ArrayList<>();
        return companyEntity;
    }

    public double requestUniqueCode(int id) {
        double aleatorio = Math.random()*50000+1;
        return aleatorio;
        //Esto va a generar un ID al azar, para asignar a la empresa registrada.
    }
}