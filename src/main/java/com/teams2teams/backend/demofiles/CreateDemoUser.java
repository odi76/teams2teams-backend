package com.teams2teams.backend.demofiles;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.teams2teams.backend.loginapi.controller.RegistrateApiDelegateImpl;
import com.teams2teams.backend.openapi.model.RegistrationData;



@RestController
@RequestMapping("/createdemouser")
public class CreateDemoUser {
     
    

    @GetMapping()
    public void Demousers()
    {
        //@Autowired
       
        System.out.println("Demo userek létrehozása");
        
        RegistrateApiDelegateImpl registrateApiDelegateImpl; 
        registrateApiDelegateImpl = new RegistrateApiDelegateImpl();
        
        RegistrationData u1;
        u1 = new RegistrationData();
        u1.setEmail("admin@email.hu");
        u1.setPassword("1111");
        registrateApiDelegateImpl.registrate(u1);

        System.out.println("U1 user létrehozva");

        RegistrationData u2;
        u2 = new RegistrationData();
        u2.setEmail("istvan@email.hu");
        u2.setPassword("1111");
        registrateApiDelegateImpl.registrate(u2);

        System.out.println("U2 user létrehozva");


    
    }
}
    

