package com.riwi.persistences.imodel;

import com.riwi.entities.EntityPasajero;
import com.riwi.persistences.crud.CreateModel;
import com.riwi.persistences.crud.DeleteModel;
import com.riwi.persistences.crud.ReadModel;
import com.riwi.persistences.crud.UpdateModel;

public interface IPasajeroModel extends
        CreateModel<EntityPasajero>,
        DeleteModel<Integer>,
        UpdateModel<EntityPasajero, Integer>,
        ReadModel<Integer> {
}
