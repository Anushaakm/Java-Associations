package com.xworkz.abstraction.boot;

import com.xworkz.abstraction.follower.Readers;
import com.xworkz.abstraction.governor.Librarian;
import com.xworkz.abstraction.rules.LibraryRules;

public class LibrarianRunner {
	
		public static void main(String[] args) {

			LibraryRules library = new Readers();
			Librarian librarian = new Librarian(library);
			librarian.reading();

		}
}
