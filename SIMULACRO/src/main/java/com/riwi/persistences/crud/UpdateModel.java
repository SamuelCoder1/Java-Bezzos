package com.riwi.persistences.crud;

public interface UpdateModel<Entity,ID>{

    public Entity update(Entity request, ID id);
}
