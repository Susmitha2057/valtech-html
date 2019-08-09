package com.med.model;

public class Login {

		String userName;
		String password;

		public String getUsername() {
			return userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		@Override
		public String toString() {
			return "Login [userName=" + userName + ", password=" + password + "]";
		}
}