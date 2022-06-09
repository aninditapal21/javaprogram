package org.exception.pack;

class CompanyJobRepository {
	static String getJobPrediction(int age, String highestQualification) throws NotEligibleException{
		if(age>=26 && (highestQualification.equals("M.S")||highestQualification.equals("PhD")))
			return "We have openings for senior developer";
		
		if(age>=21 && highestQualification.equals("B.E"))
			return "We have openings for junior developer";
		
		if(age>=19 && !(highestQualification.equals("B.E")||highestQualification.equals("M.S")||highestQualification.equals("PhD")))
			throw new NotEligibleException("We do not have any job that matches your qualifications");

			if(age<19)
				throw new NotEligibleException("You are underage for any job");
		return "Sorry we have no openings for now";
	}
}

public class JobAgency {
	public String searchForJob(int age,String highestQualification) throws NotEligibleException{
			if(age>=200 || age<=0)
				throw new NotEligibleException("The age entered is not typical for a human being");
			return CompanyJobRepository.getJobPrediction(age,highestQualification);

		 }
	public static void main(String args[] )  {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT */
		 
	}
}
class NotEligibleException extends Exception {
	public NotEligibleException(String msg){
		super(msg);
	}
}
