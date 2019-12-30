package metho_project;

public class StubIntValidator implements IntValidator {

	@Override 
	public String validate(int value) {
		if(value < 0) {
			return "negative number is not valid";
		}
		return null;
	}

}
