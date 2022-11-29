package com.xworkz.things.boot;

import com.xworkz.things.bridge.*;
import com.xworkz.things.rules.*;

public class RulesRunner {
	public static void main(String[] args) {
		System.out.println("Created instance using class type");
		AnushasHouseRules ref = new AnushasHouseRules();
		ref.birds();
		ref.people();
		ref.pets();
		ref.time();
		ref.veg();
		System.out.println("Created instance using interface type");
		HomeRule ref2 = new AnushasHouseRules();
		ref2.birds();
		ref2.people();
		ref2.pets();
		ref2.time();
		ref2.veg();

		System.out.println("Created instance using class type");
		MyMummyRules ref3 = new MyMummyRules();
		ref3.DontEatJunkFood();
		ref3.DontPlanTrips();
		ref3.DontTalkTooMuch();
		ref3.DontUsePhone();
		ref3.EatHealty();
		System.out.println("Created instance using interface type");
		MummyRules ref4 = new MyMummyRules();
		ref4.DontEatJunkFood();
		ref4.DontPlanTrips();
		ref4.DontTalkTooMuch();
		ref4.DontUsePhone();
		ref4.EatHealty();

		System.out.println("Created instance using class type");
		VeenaPG ref5 = new VeenaPG();
		ref5.bed();
		ref5.electricity();
		ref5.laundry();
		ref5.ProvidingFood();
		ref5.wifi();
		System.out.println("Created instance using interface type");
		PGRules ref6 = new VeenaPG();
		ref6.bed();
		ref6.electricity();
		ref6.laundry();
		ref6.ProvidingFood();
		ref6.wifi();

		System.out.println("Created instance using class type");
		MyFaceBook ref7 = new MyFaceBook();
		ref7.NOBlockingAdmin();
		ref7.NoExternalLinks();
		ref7.NoGooglePicture();
		ref7.PaypalService();
		ref7.GraminPostsOnly();
		System.out.println("Created instance using interface type");
		FaceBookRules ref8 = new MyFaceBook();
		ref8.NOBlockingAdmin();
		ref8.NoExternalLinks();
		ref8.NoGooglePicture();
		ref8.PaypalService();
		ref8.GraminPostsOnly();

		System.out.println("Created instance using class type");
		DegreeExam ref9 = new DegreeExam();
		ref9.NoTalking();
		ref9.NoCommunicationDevice();
		ref9.NoCheating();
		ref9.NoBags();
		ref9.Id();
		System.out.println("Created instance using interface type");
		ExamRules ref10 = new DegreeExam();
		ref10.NoTalking();
		ref10.NoCommunicationDevice();
		ref10.NoCheating();
		ref10.NoBags();
		ref10.Id();
		
		System.out.println("Created instance using class type");
		SBIBank ref11 = new SBIBank();
		ref11.Pan();
		ref11.AbharCard();
		ref11.MinCash();
		ref11.MaxCash();
		ref11.Photo();	;
		System.out.println("Created instance using interface type");
		BankRules ref12 = new SBIBank();
		ref12.Pan();
		ref12.AbharCard();
		ref12.MinCash();
		ref12.MaxCash();
		ref12.Photo();	;
	}
}
