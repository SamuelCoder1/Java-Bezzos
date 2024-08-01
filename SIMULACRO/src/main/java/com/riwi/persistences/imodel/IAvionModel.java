package com.riwi.persistences.imodel;

import com.riwi.entities.EntityAvion;
import com.riwi.persistences.crud.CreateModel;
import com.riwi.persistences.crud.DeleteModel;
import com.riwi.persistences.crud.ReadModel;
import com.riwi.persistences.crud.UpdateModel;

public interface IAvionModel extends
        CreateModel<EntityAvion>,
        DeleteModel<Integer>,
        UpdateModel<EntityAvion, Integer>,
        ReadModel<Integer> {
}
