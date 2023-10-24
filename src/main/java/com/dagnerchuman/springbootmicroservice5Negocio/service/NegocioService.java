package com.dagnerchuman.springbootmicroservice5Negocio.service;

import com.dagnerchuman.springbootmicroservice5Negocio.model.Negocio;

import java.util.List;

public interface NegocioService {
    List<Negocio> getAllNegocios();
    Negocio getNegocioById(Long id);
    Negocio createNegocio(Negocio negocio);
    Negocio updateNegocio(Long id, Negocio negocio);
    void deleteNegocio(Long id);
}
