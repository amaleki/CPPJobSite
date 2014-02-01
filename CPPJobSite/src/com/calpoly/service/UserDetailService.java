package com.calpoly.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.dao.DataAccessException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.calpoly.model.Account;

public class UserDetailService implements UserDetailsService {

	@Resource(name="accountService")
	private AccountService accountService;
	
	@Override
	public UserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException, DataAccessException {
		Account account = accountService.findbyEmail(username);
		
		if(account!=null){
			//logger.info(username + "exists");
			return new User(account.getEmail(), account.getPassword(), true, true, true, true, getAuthorities(true));
			
		}else{
			//logger.info(username + " doesn't exist");
			return null;
		}
		
	}
	
    private List<GrantedAuthority> getAuthorities(boolean isAdmin) {
        List<GrantedAuthority> authList = new ArrayList<GrantedAuthority>(2);
        authList.add(new SimpleGrantedAuthority("ROLE_USER"));
        if (isAdmin) {
            authList.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
        }
        return authList;
    }
 
}
