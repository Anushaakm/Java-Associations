package com.xworkz.Crud.service;

import com.xworkz.Crud.dto.PlaceDTO;
import com.xworkz.Crud.exception.InvalidNameDataException;

public interface PlaceService {
boolean saveAndValidate(PlaceDTO dto) throws InvalidNameDataException ;
}
