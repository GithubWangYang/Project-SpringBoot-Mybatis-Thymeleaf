package com.wy.shiro.config;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

/**
 * 
* <p>Title: AuthRealm.java</p>  
* <p>Description: </p>  
* <p>Copyright: enso Copyright (c) 2018</p>  
* <p>email: 867986155@qq.com</p>  
* @author Wang&Yang 
* @date 2018-05-01 
* @version 1.0
 */
public class AuthRealm extends AuthorizingRealm {

    
    /**
     * 授权(验证权限时调用)
     */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		
		
		SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
		//info.setStringPermissions(permsSet);
		return info;
	}

	/**
	 * 认证(登录时调用)
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(
			AuthenticationToken token) throws AuthenticationException {

	
        SimpleAuthenticationInfo info = new SimpleAuthenticationInfo();
        return info;
	}

}
