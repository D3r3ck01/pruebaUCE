/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package uce.edu.ec.cuentas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uce.edu.ec.cuentas.model.Persona;

/**
 *
 * @author artur
 */
public interface PersonaRepository extends JpaRepository <Persona, Long> {
    
}
