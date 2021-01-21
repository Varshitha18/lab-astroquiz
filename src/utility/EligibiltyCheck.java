package utility;

import model.User;

public class EligibiltyCheck extends BasicEligibility implements EligibilityInterface {
	public boolean basicEligibilityCheck (User user) {
		return checkUser(user);
	}

	@Override
	public boolean checkUser(User user) {
		if((18 <= user.getAge() && user.getAge() <= 35) && (155 <= user.getHeight() && user.getHeight() <=170) && (55 <= user.getWeight() && user.getWeight() <= 90) && user.getCountry() == "ProGrad")
			return true;
		else
			return false;
	}

	@Override
	public boolean checkQuizAnswer(String points) {
		int p = Integer.parseInt(points);
		if(p > 80)
			return true;
		else
			return false;
	}
}






