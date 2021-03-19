package examplepackageinterface.service;

import examplepackageinterface.entity.Admin;

public interface AdminService {

    void save(Admin admin);

    Admin getAdminDetailsByName(String name);

    Integer getAdminAgeByName(String name);



}
