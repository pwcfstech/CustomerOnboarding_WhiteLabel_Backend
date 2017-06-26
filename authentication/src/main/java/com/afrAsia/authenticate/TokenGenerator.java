package com.afrAsia.authenticate;

/**
 * <code>TokenGenerator</code> class generates a unique token based on the
 * following factors:
 * 
 * <ol>
 * <li>The client device identifier</li>
 * <li>The OTP for the client</li>
 * <li>The session identifier</li>
 * <li>The user's registered mobile number</li>
 * 
 * </ol>
 * 
 * @author nyalfernandes
 * 
 */
public class TokenGenerator
{

    public static String generateToken(final String deviceId, final String clientOTP, final String sessionID, final String registeredMobileNumber)
    {

        return "";
    }
}
