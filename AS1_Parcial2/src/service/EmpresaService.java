package service;

import java.util.*;
import model.EmpresaEntity;

public class EmpresaService {

    public EmpresaService() {
    }

    public void createCompany(EmpresaEntity company) { 
    }

    public void deleteCompany(int id) {
    }

    public List<EmpresaEntity> getAllCompany() {
        List<EmpresaEntity> companyEntity = new ArrayList<>();
        return companyEntity;
    }

    public EmpresaEntity getCompany(int id) {
        EmpresaEntity companyEntity = new EmpresaEntity();
        return companyEntity;
    }

    public double requestUniqueCode(int id) {
        double aleatorio = Math.random()*50000+1;
        return aleatorio;
        //Esto va a generar un ID al azar, para asignar a la empresa registrada.
    }
}