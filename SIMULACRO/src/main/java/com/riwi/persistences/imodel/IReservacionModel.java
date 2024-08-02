package com.riwi.persistences.imodel;

import com.riwi.entities.EntityPasajero;
import com.riwi.entities.EntityReservacion;
import com.riwi.persistences.crud.CreateModel;
import com.riwi.persistences.crud.DeleteModel;
import com.riwi.persistences.crud.ReadModel;
import com.riwi.persistences.crud.UpdateModel;

public interface IReservacionModel extends
        CreateModel<EntityReservacion>,
        DeleteModel<Integer>,
        UpdateModel<EntityReservacion, Integer>,
        ReadModel<Integer> {
}
