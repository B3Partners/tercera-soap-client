
package com.microsoft.schemas.sqlserver._2004.soap.options;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.microsoft.schemas.sqlserver._2004.soap.options package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.microsoft.schemas.sqlserver._2004.soap.options
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ClientInterface }
     * 
     */
    public ClientInterface createClientInterface() {
        return new ClientInterface();
    }

    /**
     * Create an instance of {@link SqlSession }
     * 
     */
    public SqlSession createSqlSession() {
        return new SqlSession();
    }

    /**
     * Create an instance of {@link ApplicationName }
     * 
     */
    public ApplicationName createApplicationName() {
        return new ApplicationName();
    }

    /**
     * Create an instance of {@link ClientNetworkID }
     * 
     */
    public ClientNetworkID createClientNetworkID() {
        return new ClientNetworkID();
    }

    /**
     * Create an instance of {@link InitialLanguage }
     * 
     */
    public InitialLanguage createInitialLanguage() {
        return new InitialLanguage();
    }

    /**
     * Create an instance of {@link InitialDatabase }
     * 
     */
    public InitialDatabase createInitialDatabase() {
        return new InitialDatabase();
    }

    /**
     * Create an instance of {@link HostName }
     * 
     */
    public HostName createHostName() {
        return new HostName();
    }

    /**
     * Create an instance of {@link ClientPID }
     * 
     */
    public ClientPID createClientPID() {
        return new ClientPID();
    }

    /**
     * Create an instance of {@link NotificationRequest }
     * 
     */
    public NotificationRequest createNotificationRequest() {
        return new NotificationRequest();
    }

    /**
     * Create an instance of {@link EnvironmentChangeNotifications }
     * 
     */
    public EnvironmentChangeNotifications createEnvironmentChangeNotifications() {
        return new EnvironmentChangeNotifications();
    }

}
