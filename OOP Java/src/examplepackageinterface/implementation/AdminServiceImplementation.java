package examplepackageinterface.implementation;

import examplepackageinterface.entity.Admin;
import examplepackageinterface.service.AdminService;

public class AdminServiceImplementation implements AdminService {


    @Override
    public void save(Admin admin) {
        System.out.println("Admin details saved...");
    }

    @Override
    public Admin getAdminDetailsByName(String name) {
        if(name.equals("VP")){
            return new Admin("Rimesh Sapkota",20,"Biratnagar","Male",02143567);
        }else{
            return null;
        }
    }

    @Override
    public Integer getAdminAgeByName(String name) {
        if (name.equals("Kaushal")){
            Admin adm = new Admin("Principal",45,"Biratnagar","Female", 02144567);
            return adm.getAge();
        }else{
            return null;
        }
    }
}
