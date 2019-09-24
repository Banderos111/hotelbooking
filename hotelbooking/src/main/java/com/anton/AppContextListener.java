package com.anton;

import com.anton.dao.entity.Role;
import com.anton.dao.repository.RoleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AppContextListener  {
    private final RoleRepository roleRepository;

    @EventListener
    public void handleContextRefreshEvent(ContextStartedEvent ctxStartEvt) {
        System.out.println("Context Start Event received.");
        createRole("admin");
        createRole("user");
    }

    private Role createRole(String name) {
        Role role = new Role();
        role.setName(name);
        roleRepository.save(role);
        return role;
    }
}
