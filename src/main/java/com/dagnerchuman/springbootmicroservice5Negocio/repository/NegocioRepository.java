package com.dagnerchuman.springbootmicroservice5Negocio.repository;

import com.dagnerchuman.springbootmicroservice5Negocio.model.Negocio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NegocioRepository extends JpaRepository<Negocio, Long> {
    // Puedes agregar métodos personalizados aquí si es necesario
}