package com.afrAsia.Utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AfrAsiaLogger
{

	 private static Logger LOGGER = LoggerFactory.getLogger(AfrAsiaLogger.class.getName());

    /**
     * @param strMessage
     */
    public static void debugLog(String strMessage)
    {
        
            LOGGER.debug(strMessage);
        
    }

       /**
     * @param strMessage
     * @param objException
     */
    public static void errorLog(String strMessage, Exception objException)
    {
        
            LOGGER.error(strMessage, objException);
        
    }

    
   
    /**
     * @param strMessage
     */
    public static void infoLog(String strMessage)
    {
        
            LOGGER.info(strMessage);
        
    }

    
}

