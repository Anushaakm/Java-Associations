package com.xworkz.Crud.service;

import com.xworkz.Crud.dto.BuildingDTO;
import com.xworkz.Crud.exception.InvalidNameDataException;

public interface BuildingService {
boolean SaveAndValidate(BuildingDTO dto) throws InvalidNameDataException;
}
