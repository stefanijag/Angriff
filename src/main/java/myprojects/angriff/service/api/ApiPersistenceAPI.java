package myprojects.angriff.service.api;

import org.springframework.stereotype.Service;

import myprojects.angriff.service.hibbean.LoginHIBBean;

@Service
public interface ApiPersistenceAPI {
	void register(LoginHIBBean registrationValue);
	String login(LoginHIBBean loginValue);
}
