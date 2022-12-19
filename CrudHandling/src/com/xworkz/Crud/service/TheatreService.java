package com.xworkz.Crud.service;

import com.xworkz.Crud.dto.TheatreDTO;
import com.xworkz.Crud.exception.InvalidNameDataException;

public interface TheatreService {
boolean saveAndValidate(TheatreDTO dto) throws InvalidNameDataException;
}
