package com.riwi.persistences.imodel;

import com.riwi.entities.EntityVuelo;

public interface IVueloModel {
    EntityVuelo create(EntityVuelo request);

    boolean delete(Integer id);

    Object read(Integer id);

    EntityVuelo update(EntityVuelo entityVuelo, Integer id);
}
