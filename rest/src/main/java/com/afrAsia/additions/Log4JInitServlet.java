package com.afrAsia.additions;

import java.io.File;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.xml.DOMConfigurator;

public class Log4JInitServlet extends HttpServlet
{
    private static final long serialVersionUID = 1L;
    private static final String log4jProperty = "log4j-config-location";

    @Override
    public void init(ServletConfig config) throws ServletException
    {
        System.out.println("Log4j initialisation at startup.");
        String log4jLocString = config.getInitParameter(log4jProperty);
        
        ServletContext sc = config.getServletContext();
        
        if (log4jLocString == null)
        {
            System.err.println(log4jProperty + " not set. Configuring with BasicConfigurator.");
            BasicConfigurator.configure();
        }
        else
        {
            String webAppPath = sc.getRealPath("/");
            File log4jFile = new File(webAppPath + log4jLocString);
            
            if (!log4jFile.exists())
            {
                System.err.println("Set " + log4jProperty + ", but file does not exist at: " + log4jFile.getAbsolutePath());
                System.exit(0);
            }
            
            System.out.println("Initializing log4j from " + log4jFile.getAbsolutePath());
            DOMConfigurator.configureAndWatch(log4jFile.getAbsolutePath());
        }
        
        super.init(config);
    }
}