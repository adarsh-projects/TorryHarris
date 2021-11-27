package example;

import org.springframework.jdbc.core.JdbcTemplate;

public class UserDAO {
	private JdbcTemplate jdbctemp;
	
	public JdbcTemplate getJdbctemp() {
		return jdbctemp;
	}
	public void setJdbctemp(JdbcTemplate jdbctemp) {
		this.jdbctemp = jdbctemp;
	}
	
	public int saveUser(User user) {
		String query = "insert into user values("+user.getId()+",\'"+user.getUsername()+"\'"+",\'"+user.getPassword()+"\')";
		return jdbctemp.update(query);
	}
	public int updateUser(User user) {
		String query = "update user set username = \'"+user.getUsername()+"\', password = \'"+user.getPassword()+"\' where id = "+ user.getId() +")";
		return jdbctemp.update(query);
	}
	public int deleteUser(User user) {
		String query = "delete from user where id = "+user.getId()+")";
		return jdbctemp.update(query);
	}
}
