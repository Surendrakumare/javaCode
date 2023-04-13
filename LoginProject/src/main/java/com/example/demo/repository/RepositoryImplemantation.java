package com.example.demo.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.dtopackage.UserDto;

@Repository
public class RepositoryImplemantation implements RepositoryInterface {
	@Autowired
	private JdbcTemplate jdbctemplate;
	@Autowired
	private NamedParameterJdbcTemplate namedparameter;

	@Override
	public Integer getPassword(String userName, String password) {
		return jdbctemplate.queryForObject(
				"select count(*) from users where username='" + userName + "' and password ='" + password + "' limit 1",
				Integer.class);

	}

	@Override
	public UserDto getUser(String userName) {
		List<UserDto> usetDto = jdbctemplate.query("select * from users where username='" + userName + "' limit 1",
				new MyRowmapper());
		return usetDto.isEmpty() ? null : usetDto.get(0);
	}

	@Override
	public List<UserDto> getAllUsers() {
		String sql = "select * from users";
		return jdbctemplate.query(sql, new MyRowmapper());
	}

	@Override
	public ResponseEntity<Object> insertvalues(UserDto user) {

		String sql = "insert into users(username,password,fullname) values(?,?,?)";
		jdbctemplate.update(sql, user.getUsername(), user.getPassword(), user.getFullname());
		return new ResponseEntity<Object>("success", HttpStatus.ACCEPTED);
	}

	@Override
	public ResponseEntity<Object> insertvaluesusingnamedparameters(UserDto user) {
		String sql = "insert into users(username,password,fullname) values(:username,:password,:fullname)";
		MapSqlParameterSource namedparameter1 = new MapSqlParameterSource("username", user.getUsername())
				.addValue("password", user.getPassword()).addValue("fullname", user.getUsername());
		this.namedparameter.update(sql, namedparameter1);
		return ResponseEntity.ok("success");

	}
}

class MyRowmapper implements RowMapper<UserDto> {
	public UserDto mapRow(ResultSet rs, int rowNum) throws SQLException {
		UserDto user = new UserDto();
		user.setUid(rs.getInt(1));
		user.setUsername(rs.getString(2));
		user.setPassword(rs.getString(3));
		user.setFullname(rs.getString(4));
		return user;
	}
}