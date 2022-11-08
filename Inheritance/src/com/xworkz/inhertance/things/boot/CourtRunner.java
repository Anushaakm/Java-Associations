package com.xworkz.inhertance.things.boot;

import com.xworkz.inhertance.things.casting.Court;
import com.xworkz.inhertance.things.casting.child.*;

public class CourtRunner {

	public static void main(String[] args) {
				Highcourt highCourt = new Highcourt();
				System.out.println(highCourt.location);
				System.out.println(highCourt.judge);
				System.out.println(highCourt.judgeName);
				System.out.println(highCourt.noOfCases);

				Court ref = new Highcourt();
				System.out.println(ref.location);
				System.out.println(ref.judge);
				Highcourt court = (Highcourt) ref;// casting
				System.out.println(court.judgeName);
				System.out.println(court.noOfCases);
				System.out.println(court.location);
				System.out.println(court.judge);

				Supremecourt supremeCourt = new Supremecourt();
				System.out.println(supremeCourt.location);
				System.out.println(supremeCourt.noOfJudge);
				System.out.println(supremeCourt.judge);
				System.out.println(supremeCourt.noOfLawyers);

				Court ref1 = new Supremecourt();
				System.out.println(ref1.location);
				System.out.println(ref1.judge);
				Supremecourt court1 = (Supremecourt) ref1;// casting
				System.out.println(court1.judge);
				System.out.println(court1.noOfLawyers);
				System.out.println(court1.location);
				System.out.println(court1.noOfJudge);

				DistrictCourt districtCourt = new DistrictCourt();
				System.out.println(districtCourt.location);
				System.out.println(districtCourt.judge);
				System.out.println(districtCourt.judgeName);
				System.out.println(districtCourt.noOfLawyers);

				Court ref2 = new DistrictCourt();
				System.out.println(ref2.location);
				System.out.println(ref2.judge);
				DistrictCourt court2 = (DistrictCourt) ref1;// casting
				System.out.println(court2.judgeName);
				System.out.println(court2.noOfLawyers);
				System.out.println(court2.location);
				System.out.println(court2.judge);

			}


	}

