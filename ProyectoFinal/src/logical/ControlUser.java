package logical;

import java.io.Serializable;
import java.util.ArrayList;

public class ControlUser implements Serializable{
    
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ArrayList<User> misUsers;
	private static ControlUser control;
	private static User loginUser;
	private static boolean firstTime;
	
	private ControlUser() {
		misUsers = new ArrayList<>();
	}
	
	public static ControlUser getInstance(){
		if(control == null){
			control = new ControlUser();
		}
		return control;
	}

	public ArrayList<User> getMisUsers() {
		return misUsers;
	}

	public void setMisUsers(ArrayList<User> misUsers) {
		this.misUsers = misUsers;
	}

	public static ControlUser getControl() {
		return control;
	}

	public static void setControl(ControlUser control) {
		ControlUser.control = control;
	}

	public static User getLoginUser() {
		return loginUser;
	}

	public static void setLoginUser(User loginUser) {
		ControlUser.loginUser = loginUser;
	}

	public void regUser(User user) {
		misUsers.add(user);
		
	}

	public static boolean isFirstTime() {
		return firstTime;
	}

	public static void setFirstTime(boolean firstTime) {
		ControlUser.firstTime = firstTime;
	}
	

	public boolean confirmLogin(String text, String text2) {
		boolean login = false;
		for (User user : misUsers) {
			if(user.getUserName().equals(text)){
				loginUser = user;
				login = true;
			}
		}
		return login;
	}

}