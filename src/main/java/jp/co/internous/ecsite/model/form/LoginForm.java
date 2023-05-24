package jp.co.internous.ecsite.model.form;

import java.io.Serializable;
//import org.springframework.web.bind.annotation.PostMapping;
//import jp.co.internous.ecsite.model.form.LoginForm;
//import org.springframework.ui.Model;
//import org.springframework.data.jpa.repository.JpaRepository;
//import jp.co.internous.ecsite.model.entity.User;
//import java.util.List;
//import jp.co.internous.ecsite.model.entity.Goods;
//import org.springframework.beans.factory.annotation.Autowired;
//import jp.co.internous.ecsite.model.dao.UserRepository;
//import jp.co.internous.ecsite.model.dao.GoodsRepository;



public class LoginForm implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String userName;
	private String password;
	
	public String getUserName() {
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
}
