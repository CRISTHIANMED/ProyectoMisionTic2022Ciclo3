package proyectov1.agendalab.service;

import java.util.List;
import java.util.Optional;

import proyectov1.agendalab.controller.dto.SeccionDto;

public interface SeccionService {
    
    List<SeccionDto> getSecciones();
    
    Optional<SeccionDto> getSeccionById(Integer id);

    String getNombre(Integer id);


}