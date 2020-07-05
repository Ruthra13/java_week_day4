package utility;
import controller.*;
import model.User;

public class EligibiltyCheck extends BasicEligibility implements EligibilityInterface{
	
	
	
	public boolean basicEligibilityCheck(User user) {
		// TODO Auto-generated method stub
		if(checkUser(user))
		{
		return true;
		}
		else
		{
		return false;
		}
	}
	
	public boolean checkUser(User user) {
		// TODO Auto-generated method stub
		int age = user.getAge();
		int height = user.getHeight();
		int weight = user.getWeight();
		String country = user.getCountry();
		if((age>=18 && age<=35)  && (height>=155 && height<=170) && (weight>=55 && weight<=90) && (country=="ProGrad") )
		{
			return true;
		}
		else
		return false;
	}

	
	public boolean checkQuizAnswer(String points) {
		// TODO Auto-generated method stub
		int point = Integer.parseInt(points);
		if(point>80)
			return true;
		else
		return false;
	}
	
	
}






