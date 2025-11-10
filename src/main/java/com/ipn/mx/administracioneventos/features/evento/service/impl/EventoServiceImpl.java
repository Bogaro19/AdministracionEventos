package com.ipn.mx.administracioneventos.features.evento.service.impl;

import com.ipn.mx.administracioneventos.core.domain.Evento;
import com.ipn.mx.administracioneventos.features.evento.repository.EventoRepository;
import com.ipn.mx.administracioneventos.features.evento.service.EventoService;
import io.micrometer.observation.annotation.Observed;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.ByteArrayInputStream;
@Service
public class EventoServiceImpl implements EventoService {
    @Autowired
    private EventoRepository eventoRepository;



    @Override
    public List<Evento> findAll() {
        return null;
    }

    @Override
    public Evento findById(long id) {
        return null;
    }

    @Override
    public Evento save(Evento evento) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public ByteArrayInputStream reportePDF() {
        return null;
    }
}
