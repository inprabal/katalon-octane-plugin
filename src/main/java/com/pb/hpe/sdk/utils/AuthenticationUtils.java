package com.pb.hpe.sdk.utils;

import com.hpe.adm.nga.sdk.APIMode;
import com.hpe.adm.nga.sdk.authentication.Authentication;
import com.hpe.adm.nga.sdk.authentication.SimpleClientAuthentication;

public class AuthenticationUtils {
	
	
	public static Authentication getAuthentication(String clientId, String clientSecret) {
          
        return new SimpleClientAuthentication(clientId, clientSecret,APIMode.TechnicalPreviewAPIMode);
        
    }


}
