
package com.solesasia.portfolio.service;

import com.solesasia.portfolio.dto.PortfolioDTO;
import com.solesasia.portfolio.model.Persona;
import java.util.Optional;


public interface IPortfolioService {
    
    //Lectura persona
    public Persona getPersona();
    
    //Modificar persona
    public boolean editarPersona(Persona perso);
   
    //Lectura porfolio
    public PortfolioDTO getPortfolio();
    
}
