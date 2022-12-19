package com.xworkz.Crud.service;

import com.xworkz.Crud.dto.TheatreDTO;
import com.xworkz.Crud.exception.InvalidNameDataException;
import com.xworkz.Crud.repository.TheatreRepository;

public class TheatreServiceImpl implements TheatreService {
	private TheatreRepository theatreRepository;
	
	public TheatreServiceImpl(TheatreRepository theatreRepository) {
		super();
		this.theatreRepository = theatreRepository;
	}

	@Override
	public boolean saveAndValidate(TheatreDTO dto) throws InvalidNameDataException {
		System.out.println("Validating and saving theatre dto.."+dto);
		String name=dto.getName();
		String area=dto.getArea();
		int noOfShow=dto.getNoOfShow();
		String movie=dto.getMovie();
		

		boolean validName = false;
		boolean validNoOfShows = false;
		boolean validArea = false;
		boolean validMovie = false;
		
		if (name != null && name.length() >= 4 && name.length() <= 20) {
			System.out.println("valid name");
			validName = true;

		} else {
			System.err.println("Invalid name");
		}

		if (movie != null && movie.length() >= 4 && movie.length() <= 20) {
			System.out.println("valid movie");
			validMovie = true;
		} else {
			System.err.println("Invalid movie");
		}
		

		if (area != null && area.length() > 4 && area.length() < 20) {
			System.out.println("valid area");
			validArea = true;
		} else {
			System.err.println("Invalid area");
		}

		if (noOfShow > 0) {
			System.out.println("valid noOfShow");
			validNoOfShows = true;
		} else {
			System.err.println("Invalid noOfShow");
		}
		
		if (validName && validNoOfShows && validArea && validMovie) {
			System.out.println("Data is valid can store");
			boolean saved = this.theatreRepository.save(dto);
			System.out.println("Data Saved sucess" + saved);
			return saved;
		}
		throw new InvalidNameDataException("Check the data you have passed");


		//return false;
	}

}
