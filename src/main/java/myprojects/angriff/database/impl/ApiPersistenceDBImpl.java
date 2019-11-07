package myprojects.angriff.database.impl;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import myprojects.angriff.service.api.ApiPersistenceAPI;
import myprojects.angriff.service.hibbean.LoginHIBBean;

public class ApiPersistenceDBImpl implements ApiPersistenceAPI{
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ApiPersistenceDBImpl.class);
	private String url = "jdbc:mysql://localhost:3306/Aplik";
	private String driver = "com.mysql.cj.jdbc.Driver";
	private String username ="root";
	private String password= "b77ITm0d"; 
	private int id=5;
	
	@Override
	public void register(LoginHIBBean registrationValue) {
		Connection connection = null;
		try {
			Class.forName(driver).newInstance();
			connection = DriverManager.getConnection(url, username, password);
			
			Statement stmt = connection.createStatement();
			String query = "INSERT INTO Aplik.user (id, email, lastname, name, password, role, username) "
					+ "VALUES (" + id + ", '" + registrationValue.getEmail() + "', '" + registrationValue.getLastname() + "', '" 
					+ registrationValue.getName() + "', '" + registrationValue.getPassword() + "', '" + registrationValue.getRole()
					+ "', '" + registrationValue.getUsername() +"')";
			stmt.executeUpdate(query);
			id++;
			connection.close();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
			LOGGER.error(e.getMessage(), e);
		}
	}

	public String getDriver() {
		return driver;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUrl() {
		return url;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	@Override
	public String login(LoginHIBBean loginValue) {
		Connection connection = null;
		try {
			Class.forName(driver).newInstance();
			connection = DriverManager.getConnection(url, username, password);
			
			Statement stmt = connection.createStatement();
			String query = "SELECT * from Aplik.user where username='" + loginValue.getUsername() + "' AND password='" + loginValue.getPassword() +"'";
			ResultSet executeQuery = stmt.executeQuery(query);
			if(executeQuery.first()) {
				return executeQuery.getString("role");
			}
			return "";
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
			LOGGER.error(e.getMessage(), e);
		}finally {
			try {
				connection.close();
			} catch (SQLException e) {
				LOGGER.error(e.getMessage(), e);
			}
		}
		return "";
		
	}
	
	

}
