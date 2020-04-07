package com.github.mathan26.spring5receipeapp.services;

import com.github.mathan26.spring5receipeapp.commands.UnitOfMeasureCommand;

import java.util.Set;

public interface UnitOfMeasureService {
    Set<UnitOfMeasureCommand> listAllUoms();
}
