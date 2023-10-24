package com.dagnerchuman.springbootmicroservice5Negocio.service;

import com.dagnerchuman.springbootmicroservice5Negocio.model.Negocio;
import com.dagnerchuman.springbootmicroservice5Negocio.repository.NegocioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class NegocioServiceImpl implements NegocioService {

    private final NegocioRepository negocioRepository;

    @Autowired
    public NegocioServiceImpl(NegocioRepository negocioRepository) {
        this.negocioRepository = negocioRepository;
    }

    @Override
    public List<Negocio> getAllNegocios() {
        return negocioRepository.findAll();
    }

    @Override
    public Negocio getNegocioById(Long id) {
        return negocioRepository.findById(id).orElse(null);
    }

    @Override
    public Negocio createNegocio(Negocio negocio) {

        negocio.setFechaCreacion(LocalDateTime.now());

        return negocioRepository.save(negocio);
    }

    @Override
    public Negocio updateNegocio(Long id, Negocio negocio) {
        negocio.setId(id); // Set the ID of the existing entity
        return negocioRepository.save(negocio);
    }

    @Override
    public void deleteNegocio(Long id) {
        negocioRepository.deleteById(id);
    }
}
