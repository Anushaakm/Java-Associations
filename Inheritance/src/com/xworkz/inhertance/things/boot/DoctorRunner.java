package com.xworkz.inhertance.things.boot;

import com.xworkz.inhertance.things.casting.Doctor;
import com.xworkz.inhertance.things.casting.child.Cordiologist;
import com.xworkz.inhertance.things.casting.child.Dentist;
import com.xworkz.inhertance.things.casting.child.ENT;

public class DoctorRunner {

	public static void main(String[] args) {
		Dentist dentist = new Dentist();
		System.out.println(dentist.dentistHospitalNames);
		System.out.println(dentist.dentistLocation);
		System.out.println(dentist.name);
		System.out.println(dentist.specialist);
		

		Doctor ref = new Dentist();
		System.out.println(ref.specialist);
		System.out.println(ref.name);
		Dentist doctor1 = (Dentist) ref;// casting
		System.out.println(doctor1.dentistHospitalNames);
		System.out.println(doctor1.dentistLocation);
		System.out.println(doctor1.name);
		System.out.println(doctor1.specialist);
	

		ENT ent = new ENT();
		System.out.println(ent.entHospitalNames);
		System.out.println(ent.entLocaton);
		System.out.println(ent.name);
		System.out.println(ent.name);
		System.out.println(ent.specialist);

		Doctor ref1 = new ENT();
		System.out.println(ref1.name);
		System.out.println(ref1.specialist);
		ENT doctor2 = (ENT) ref1;// casting
		System.out.println(doctor2.entHospitalNames);
		System.out.println(doctor2.entLocaton);
		System.out.println(doctor2.name);
		System.out.println(doctor2.specialist);
		

		Cordiologist cardiologist = new Cordiologist();
		System.out.println(cardiologist.cordiologistHospitalNames);
		System.out.println(cardiologist.cordiologistLocaton);
		System.out.println(cardiologist.name);
		System.out.println(cardiologist.specialist);
		
		Doctor ref2 = new Cordiologist();
		System.out.println(ref2.name);
		System.out.println(ref2.specialist);
		
		Cordiologist doctor3 = (Cordiologist) ref2;// casting
		System.out.println(doctor3.cordiologistHospitalNames);
		System.out.println(doctor3.cordiologistLocaton);
		System.out.println(doctor3.name);
		System.out.println(doctor3.specialist);

	}


	}


