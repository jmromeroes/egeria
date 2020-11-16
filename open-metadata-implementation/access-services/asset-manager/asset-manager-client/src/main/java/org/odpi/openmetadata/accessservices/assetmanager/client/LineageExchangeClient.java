/* SPDX-License-Identifier: Apache 2.0 */
/* Copyright Contributors to the ODPi Egeria project. */

package org.odpi.openmetadata.accessservices.assetmanager.client;

import org.odpi.openmetadata.accessservices.assetmanager.api.LineageExchangeInterface;
import org.odpi.openmetadata.accessservices.assetmanager.client.rest.AssetManagerRESTClient;
import org.odpi.openmetadata.accessservices.assetmanager.metadataelements.*;
import org.odpi.openmetadata.accessservices.assetmanager.properties.*;
import org.odpi.openmetadata.frameworks.auditlog.AuditLog;
import org.odpi.openmetadata.frameworks.connectors.ffdc.InvalidParameterException;
import org.odpi.openmetadata.frameworks.connectors.ffdc.PropertyServerException;
import org.odpi.openmetadata.frameworks.connectors.ffdc.UserNotAuthorizedException;

import java.util.List;
import java.util.Map;


/**
 * LineageExchangeClient is the client for managing processes and lineage linkage.
 */
public class LineageExchangeClient extends SchemaExchangeClientBase implements LineageExchangeInterface
{
    /**
     * Create a new client with no authentication embedded in the HTTP request.
     *
     * @param serverName name of the server to connect to
     * @param serverPlatformURLRoot the network address of the server running the OMAS REST servers
     * @param auditLog logging destination
     * @throws InvalidParameterException there is a problem creating the client-side components to issue any
     * REST API calls.
     */
    public LineageExchangeClient(String   serverName,
                                 String   serverPlatformURLRoot,
                                 AuditLog auditLog) throws InvalidParameterException
    {
        super(serverName, serverPlatformURLRoot, auditLog);
    }


    /**
     * Create a new client with no authentication embedded in the HTTP request.
     *
     * @param serverName name of the server to connect to
     * @param serverPlatformURLRoot the network address of the server running the OMAS REST servers
     * @throws InvalidParameterException there is a problem creating the client-side components to issue any
     * REST API calls.
     */
    public LineageExchangeClient(String serverName,
                                 String serverPlatformURLRoot) throws InvalidParameterException
    {
        super(serverName, serverPlatformURLRoot);
    }


    /**
     * Create a new client that passes userId and password in each HTTP request.  This is the
     * userId/password of the calling server.  The end user's userId is sent on each request.
     *
     * @param serverName name of the server to connect to
     * @param serverPlatformURLRoot the network address of the server running the OMAS REST servers
     * @param userId caller's userId embedded in all HTTP requests
     * @param password caller's userId embedded in all HTTP requests
     * @param auditLog logging destination
     *
     * @throws InvalidParameterException there is a problem creating the client-side components to issue any
     * REST API calls.
     */
    public LineageExchangeClient(String   serverName,
                                 String   serverPlatformURLRoot,
                                 String   userId,
                                 String   password,
                                 AuditLog auditLog) throws InvalidParameterException
    {
        super(serverName, serverPlatformURLRoot, userId, password, auditLog);
    }


    /**
     * Create a new client that is going to be used in an OMAG Server.
     *
     * @param serverName name of the server to connect to
     * @param serverPlatformURLRoot the network address of the server running the OMAS REST servers
     * @param restClient client that issues the REST API calls
     * @param maxPageSize maximum number of results supported by this server
     * @param auditLog logging destination
     * @throws InvalidParameterException there is a problem creating the client-side components to issue any
     * REST API calls.
     */
    public LineageExchangeClient(String                 serverName,
                                 String                 serverPlatformURLRoot,
                                 AssetManagerRESTClient restClient,
                                 int                    maxPageSize,
                                 AuditLog               auditLog) throws InvalidParameterException
    {
        super(serverName, serverPlatformURLRoot, restClient, maxPageSize, auditLog);
    }


    /**
     * Create a new client that passes userId and password in each HTTP request.  This is the
     * userId/password of the calling server.  The end user's userId is sent on each request.
     *
     * @param serverName name of the server to connect to
     * @param serverPlatformURLRoot the network address of the server running the OMAS REST servers
     * @param userId caller's userId embedded in all HTTP requests
     * @param password caller's userId embedded in all HTTP requests
     * @throws InvalidParameterException there is a problem creating the client-side components to issue any
     * REST API calls.
     */
    public LineageExchangeClient(String serverName,
                                 String serverPlatformURLRoot,
                                 String userId,
                                 String password) throws InvalidParameterException
    {
        super(serverName, serverPlatformURLRoot, userId, password);
    }



    /* =====================================================================================================================
     * A process describes a well defined series of steps that gets something done.
     */

    /**
     * Create a new metadata element to represent a process.
     *
     * @param userId calling user
     * @param assetManagerGUID unique identifier of software server capability representing the caller
     * @param assetManagerName unique name of software server capability representing the caller
     * @param assetManagerIsHome ensure that only the asset manager can update this process
     * @param processExternalIdentifier unique identifier of the process in the external asset manager
     * @param processExternalIdentifierName name of property for the external identifier in the external asset manager
     * @param processExternalIdentifierUsage optional usage description for the external identifier when calling the external asset manager
     * @param processExternalIdentifierSource component that issuing this request.
     * @param processExternalIdentifierKeyPattern pattern for the external identifier within the external asset manager (default is LOCAL_KEY)
     * @param mappingProperties additional properties to help with the mapping of the elements in the external asset manager and open metadata
     * @param processProperties properties about the process to store
     * @param initialStatus status value for the new process (default = ACTIVE)
     *
     * @return unique identifier of the new process
     *
     * @throws InvalidParameterException  one of the parameters is invalid
     * @throws UserNotAuthorizedException the user is not authorized to issue this request
     * @throws PropertyServerException    there is a problem reported in the open metadata server(s)
     */
    public String createProcess(String              userId,
                                String              assetManagerGUID,
                                String              assetManagerName,
                                boolean             assetManagerIsHome,
                                String              processExternalIdentifier,
                                String              processExternalIdentifierName,
                                String              processExternalIdentifierUsage,
                                String              processExternalIdentifierSource,
                                KeyPattern processExternalIdentifierKeyPattern,
                                Map<String, String> mappingProperties,
                                ProcessProperties processProperties,
                                ProcessStatus initialStatus) throws InvalidParameterException,
                                                                    UserNotAuthorizedException,
                                                                    PropertyServerException
    {
        // todo
        return null;
    }


    /**
     * Create a new metadata element to represent a process using an existing metadata element as a template.
     *
     * @param userId calling user
     * @param assetManagerGUID unique identifier of software server capability representing the caller
     * @param assetManagerName unique name of software server capability representing the caller
     * @param templateGUID unique identifier of the metadata element to copy
     * @param processExternalIdentifier unique identifier of the process in the external asset manager
     * @param processExternalIdentifierName name of property for the external identifier in the external asset manager
     * @param processExternalIdentifierUsage optional usage description for the external identifier when calling the external asset manager
     * @param processExternalIdentifierSource component that issuing this request.
     * @param processExternalIdentifierKeyPattern pattern for the external identifier within the external asset manager (default is LOCAL_KEY)
     * @param mappingProperties additional properties to help with the mapping of the elements in the
     *                          external asset manager and open metadata
     * @param templateProperties properties that override the template
     *
     * @return unique identifier of the new process
     *
     * @throws InvalidParameterException  one of the parameters is invalid
     * @throws UserNotAuthorizedException the user is not authorized to issue this request
     * @throws PropertyServerException    there is a problem reported in the open metadata server(s)
     */
    public String createProcessFromTemplate(String              userId,
                                            String              assetManagerGUID,
                                            String              assetManagerName,
                                            String              templateGUID,
                                            String              processExternalIdentifier,
                                            String              processExternalIdentifierName,
                                            String              processExternalIdentifierUsage,
                                            String              processExternalIdentifierSource,
                                            KeyPattern          processExternalIdentifierKeyPattern,
                                            Map<String, String> mappingProperties,
                                            TemplateProperties templateProperties) throws InvalidParameterException,
                                                                                          UserNotAuthorizedException,
                                                                                          PropertyServerException
    {
        // todo
        return null;
    }


    /**
     * Update the metadata element representing a process.
     *
     * @param userId calling user
     * @param assetManagerGUID unique identifier of software server capability representing the caller
     * @param assetManagerName unique name of software server capability representing the caller
     * @param processGUID unique identifier of the metadata element to update
     * @param processExternalIdentifier unique identifier of the process in the external asset manager
     * @param isMergeUpdate should the new properties be merged with existing properties (true) or completely replace them (false)?
     * @param processProperties new properties for the metadata element
     *
     * @throws InvalidParameterException  one of the parameters is invalid
     * @throws UserNotAuthorizedException the user is not authorized to issue this request
     * @throws PropertyServerException    there is a problem reported in the open metadata server(s)
     */
    public void updateProcess(String            userId,
                              String            assetManagerGUID,
                              String            assetManagerName,
                              String            processGUID,
                              String            processExternalIdentifier,
                              boolean           isMergeUpdate,
                              ProcessProperties processProperties) throws InvalidParameterException,
                                                                          UserNotAuthorizedException,
                                                                          PropertyServerException
    {
        // todo
    }


    /**
     * Update the status of the metadata element representing a process.
     *
     * @param userId calling user
     * @param assetManagerGUID unique identifier of software server capability representing the caller
     * @param assetManagerName unique name of software server capability representing the caller
     * @param processGUID unique identifier of the process to update
     * @param processExternalIdentifier unique identifier of the process in the external asset manager
     * @param processStatus new status for the process
     *
     * @throws InvalidParameterException  one of the parameters is invalid
     * @throws UserNotAuthorizedException the user is not authorized to issue this request
     * @throws PropertyServerException    there is a problem reported in the open metadata server(s)
     */
    public void updateProcessStatus(String        userId,
                                    String        assetManagerGUID,
                                    String        assetManagerName,
                                    String        processGUID,
                                    String        processExternalIdentifier,
                                    ProcessStatus processStatus) throws InvalidParameterException,
                                                                        UserNotAuthorizedException,
                                                                        PropertyServerException
    {
        // todo
    }


    /**
     * Create a parent-child relationship between two processes.
     *
     * @param userId calling user
     * @param assetManagerGUID unique identifier of software server capability representing the caller
     * @param assetManagerName unique name of software server capability representing the caller
     * @param assetManagerIsHome ensure that only the asset manager can update this asset
     * @param parentProcessGUID unique identifier of the process in the external asset manager that is to be the parent process
     * @param childProcessGUID unique identifier of the process in the external asset manager that is to be the nested sub-process
     * @param containmentType describes the ownership of the sub-process
     *
     * @throws InvalidParameterException  one of the parameters is invalid
     * @throws UserNotAuthorizedException the user is not authorized to issue this request
     * @throws PropertyServerException    there is a problem reported in the open metadata server(s)
     */
    public void setupProcessParent(String                 userId,
                                   String                 assetManagerGUID,
                                   String                 assetManagerName,
                                   boolean                assetManagerIsHome,
                                   String                 parentProcessGUID,
                                   String                 childProcessGUID,
                                   ProcessContainmentType containmentType) throws InvalidParameterException,
                                                                                  UserNotAuthorizedException,
                                                                                  PropertyServerException
    {
        // todo
    }


    /**
     * Remove a parent-child relationship between two processes.
     *
     * @param userId calling user
     * @param assetManagerGUID unique identifier of software server capability representing the caller
     * @param assetManagerName unique name of software server capability representing the caller
     * @param parentProcessGUID unique identifier of the process in the external asset manager that is to be the parent process
     * @param childProcessGUID unique identifier of the process in the external asset manager that is to be the nested sub-process
     *
     * @throws InvalidParameterException  one of the parameters is invalid
     * @throws UserNotAuthorizedException the user is not authorized to issue this request
     * @throws PropertyServerException    there is a problem reported in the open metadata server(s)
     */
    public void clearProcessParent(String userId,
                                   String assetManagerGUID,
                                   String assetManagerName,
                                   String parentProcessGUID,
                                   String childProcessGUID) throws InvalidParameterException,
                                                                   UserNotAuthorizedException,
                                                                   PropertyServerException
    {
        // todo
    }


    /**
     * Remove the metadata element representing a process.
     *
     * @param userId calling user
     * @param assetManagerGUID unique identifier of software server capability representing the caller
     * @param assetManagerName unique name of software server capability representing the caller
     * @param processGUID unique identifier of the metadata element to remove
     * @param processExternalIdentifier unique identifier of the process in the external asset manager
     *
     * @throws InvalidParameterException  one of the parameters is invalid
     * @throws UserNotAuthorizedException the user is not authorized to issue this request
     * @throws PropertyServerException    there is a problem reported in the open metadata server(s)
     */
    public void removeProcess(String userId,
                              String assetManagerGUID,
                              String assetManagerName,
                              String processGUID,
                              String processExternalIdentifier) throws InvalidParameterException,
                                                                       UserNotAuthorizedException,
                                                                       PropertyServerException
    {
        // todo
    }


    /**
     * Retrieve the list of process metadata elements that contain the search string.
     * The search string is treated as a regular expression.
     *
     * @param userId calling user
     * @param assetManagerGUID unique identifier of software server capability representing the caller
     * @param assetManagerName unique name of software server capability representing the caller
     * @param searchString string to find in the properties
     * @param startFrom paging start point
     * @param pageSize maximum results that can be returned
     *
     * @return list of matching metadata elements
     *
     * @throws InvalidParameterException  one of the parameters is invalid
     * @throws UserNotAuthorizedException the user is not authorized to issue this request
     * @throws PropertyServerException    there is a problem reported in the open metadata server(s)
     */
    public List<ProcessElement> findProcesses(String userId,
                                              String assetManagerGUID,
                                              String assetManagerName,
                                              String searchString,
                                              int    startFrom,
                                              int    pageSize) throws InvalidParameterException,
                                                                      UserNotAuthorizedException,
                                                                      PropertyServerException
    {
        // todo
        return null;
    }


    /**
     * Return the list of processes associated with the asset manager.
     *
     * @param userId calling user
     * @param assetManagerGUID unique identifier of software server capability representing the caller
     * @param assetManagerName unique name of software server capability representing the caller
     * @param startFrom paging start point
     * @param pageSize maximum results that can be returned
     *
     * @return list of metadata elements describing the processes associated with the requested asset manager
     *
     * @throws InvalidParameterException  one of the parameters is invalid
     * @throws UserNotAuthorizedException the user is not authorized to issue this request
     * @throws PropertyServerException    there is a problem reported in the open metadata server(s)
     */
    public List<ProcessElement>   getProcessesForAssetManager(String userId,
                                                              String assetManagerGUID,
                                                              String assetManagerName,
                                                              int    startFrom,
                                                              int    pageSize) throws InvalidParameterException,
                                                                                      UserNotAuthorizedException,
                                                                                      PropertyServerException
    {
        // todo
        return null;
    }


    /**
     * Retrieve the list of process metadata elements with a matching qualified or display name.
     * There are no wildcards supported on this request.
     *
     * @param userId calling user
     * @param assetManagerGUID unique identifier of software server capability representing the caller
     * @param assetManagerName unique name of software server capability representing the caller
     * @param name name to search for
     * @param startFrom paging start point
     * @param pageSize maximum results that can be returned
     *
     * @return list of matching metadata elements
     *
     * @throws InvalidParameterException  one of the parameters is invalid
     * @throws UserNotAuthorizedException the user is not authorized to issue this request
     * @throws PropertyServerException    there is a problem reported in the open metadata server(s)
     */
    public List<ProcessElement>   getProcessesByName(String userId,
                                                     String assetManagerGUID,
                                                     String assetManagerName,
                                                     String name,
                                                     int    startFrom,
                                                     int    pageSize) throws InvalidParameterException,
                                                                             UserNotAuthorizedException,
                                                                             PropertyServerException
    {
        // todo
        return null;
    }


    /**
     * Retrieve the process metadata element with the supplied unique identifier.
     *
     * @param userId calling user
     * @param assetManagerGUID unique identifier of software server capability representing the caller
     * @param assetManagerName unique name of software server capability representing the caller
     * @param processGUID unique identifier of the requested metadata element
     *
     * @return requested metadata element
     *
     * @throws InvalidParameterException  one of the parameters is invalid
     * @throws UserNotAuthorizedException the user is not authorized to issue this request
     * @throws PropertyServerException    there is a problem reported in the open metadata server(s)
     */
    public ProcessElement getProcessByGUID(String userId,
                                           String assetManagerGUID,
                                           String assetManagerName,
                                           String processGUID) throws InvalidParameterException,
                                                                      UserNotAuthorizedException,
                                                                      PropertyServerException
    {
        // todo
        return null;
    }


    /**
     * Retrieve the process metadata element with the supplied unique identifier.
     *
     * @param userId calling user
     * @param assetManagerGUID unique identifier of software server capability representing the caller
     * @param assetManagerName unique name of software server capability representing the caller
     * @param processGUID unique identifier of the requested metadata element
     *
     * @return parent process element
     *
     * @throws InvalidParameterException  one of the parameters is invalid
     * @throws UserNotAuthorizedException the user is not authorized to issue this request
     * @throws PropertyServerException    there is a problem reported in the open metadata server(s)
     */
    public ProcessElement getProcessParent(String userId,
                                           String assetManagerGUID,
                                           String assetManagerName,
                                           String processGUID) throws InvalidParameterException,
                                                                      UserNotAuthorizedException,
                                                                      PropertyServerException
    {
        // todo
        return null;
    }


    /**
     * Retrieve the process metadata element with the supplied unique identifier.
     *
     * @param userId calling user
     * @param assetManagerGUID unique identifier of software server capability representing the caller
     * @param assetManagerName unique name of software server capability representing the caller
     * @param processGUID unique identifier of the requested metadata element
     * @param startFrom paging start point
     * @param pageSize maximum results that can be returned
     *
     * @return list of process element
     *
     * @throws InvalidParameterException  one of the parameters is invalid
     * @throws UserNotAuthorizedException the user is not authorized to issue this request
     * @throws PropertyServerException    there is a problem reported in the open metadata server(s)
     */
    public List<ProcessElement> getSubProcesses(String userId,
                                                String assetManagerGUID,
                                                String assetManagerName,
                                                String processGUID,
                                                int    startFrom,
                                                int    pageSize) throws InvalidParameterException,
                                                                        UserNotAuthorizedException,
                                                                        PropertyServerException
    {
        // todo
        return null;
    }


    /* ===============================================================================
     * A process typically contains ports that show the flow of data and control to and from it.
     */

    /**
     * Create a new metadata element to represent a port.
     *
     * @param userId calling user
     * @param assetManagerGUID unique identifier of software server capability representing the caller
     * @param assetManagerName unique name of software server capability representing the caller
     * @param assetManagerIsHome ensure that only the asset manager can update this port
     * @param processGUID unique identifier of the process where the port is located
     * @param portExternalIdentifier unique identifier of the port in the external asset manager
     * @param portExternalIdentifierName name of property for the external identifier in the external asset manager
     * @param portExternalIdentifierUsage optional usage description for the external identifier when calling the external asset manager
     * @param portExternalIdentifierSource component that issuing this request.
     * @param portExternalIdentifierKeyPattern pattern for the external identifier within the external asset manager (default is LOCAL_KEY)
     * @param mappingProperties additional properties to help with the mapping of the elements in the
     *                          external asset manager and open metadata
     * @param portProperties properties for the port
     *
     * @return unique identifier of the new metadata element for the port
     *
     * @throws InvalidParameterException  one of the parameters is invalid
     * @throws UserNotAuthorizedException the user is not authorized to issue this request
     * @throws PropertyServerException    there is a problem reported in the open metadata server(s)
     */
    public String createPort(String              userId,
                             String              assetManagerGUID,
                             String              assetManagerName,
                             boolean             assetManagerIsHome,
                             String              processGUID,
                             String              portExternalIdentifier,
                             String              portExternalIdentifierName,
                             String              portExternalIdentifierUsage,
                             String              portExternalIdentifierSource,
                             KeyPattern          portExternalIdentifierKeyPattern,
                             Map<String, String> mappingProperties,
                             PortProperties      portProperties) throws InvalidParameterException,
                                                                        UserNotAuthorizedException,
                                                                        PropertyServerException
    {
        // todo
        return null;
    }


    /**
     * Update the properties of the metadata element representing a port.  This call replaces
     * all existing properties with the supplied properties.
     *
     * @param userId calling user
     * @param assetManagerGUID unique identifier of software server capability representing the caller
     * @param assetManagerName unique name of software server capability representing the caller
     * @param portGUID unique identifier of the port to update
     * @param portProperties new properties for the port
     * @param portExternalIdentifier unique identifier of the port in the external asset manager
     *
     * @throws InvalidParameterException  one of the parameters is invalid
     * @throws UserNotAuthorizedException the user is not authorized to issue this request
     * @throws PropertyServerException    there is a problem reported in the open metadata server(s)
     */
    public void updatePort(String         userId,
                           String         assetManagerGUID,
                           String         assetManagerName,
                           String         portGUID,
                           String         portExternalIdentifier,
                           PortProperties portProperties) throws InvalidParameterException,
                                                                 UserNotAuthorizedException,
                                                                 PropertyServerException
    {
        // todo
    }


    /**
     * Link a port to a process.
     *
     * @param userId calling user
     * @param assetManagerGUID unique identifier of software server capability representing the caller
     * @param assetManagerName unique name of software server capability representing the caller
     * @param assetManagerIsHome ensure that only the asset manager can update this asset
     * @param processGUID unique identifier of the process
     * @param portGUID unique identifier of the port
     *
     * @throws InvalidParameterException  one of the parameters is invalid
     * @throws UserNotAuthorizedException the user is not authorized to issue this request
     * @throws PropertyServerException    there is a problem reported in the open metadata server(s)
     */
    public void setupProcessPort(String  userId,
                                 String  assetManagerGUID,
                                 String  assetManagerName,
                                 boolean assetManagerIsHome,
                                 String  processGUID,
                                 String  portGUID) throws InvalidParameterException,
                                                          UserNotAuthorizedException,
                                                          PropertyServerException
    {
        // todo
    }


    /**
     * Unlink a port from a process.
     *
     * @param userId calling user
     * @param assetManagerGUID unique identifier of software server capability representing the caller
     * @param assetManagerName unique name of software server capability representing the caller
     * @param processGUID unique identifier of the process
     * @param portGUID unique identifier of the port

     * @throws InvalidParameterException  one of the parameters is invalid
     * @throws UserNotAuthorizedException the user is not authorized to issue this request
     * @throws PropertyServerException    there is a problem reported in the open metadata server(s)
     */
    public void clearProcessPort(String userId,
                                 String assetManagerGUID,
                                 String assetManagerName,
                                 String processGUID,
                                 String portGUID) throws InvalidParameterException,
                                                         UserNotAuthorizedException,
                                                         PropertyServerException
    {
        // todo
    }


    /**
     * Link two ports together to show that portTwo is an implementation of portOne. (That is, portOne delegates to
     * portTwo.)
     *
     * @param userId calling user
     * @param assetManagerGUID unique identifier of software server capability representing the caller
     * @param assetManagerName unique name of software server capability representing the caller
     * @param assetManagerIsHome ensure that only the asset manager can update this asset
     * @param portOneGUID unique identifier of the port at end 1
     * @param portTwoGUID unique identifier of the port at end 2
     *
     * @throws InvalidParameterException  one of the parameters is invalid
     * @throws UserNotAuthorizedException the user is not authorized to issue this request
     * @throws PropertyServerException    there is a problem reported in the open metadata server(s)
     */
    public void setupPortDelegation(String  userId,
                                    String  assetManagerGUID,
                                    String  assetManagerName,
                                    boolean assetManagerIsHome,
                                    String  portOneGUID,
                                    String  portTwoGUID) throws InvalidParameterException,
                                                                UserNotAuthorizedException,
                                                                PropertyServerException
    {
        // todo
    }


    /**
     * Remove the port delegation relationship between two ports.
     *
     * @param userId calling user
     * @param assetManagerGUID unique identifier of software server capability representing the caller
     * @param assetManagerName unique name of software server capability representing the caller
     * @param portOneGUID unique identifier of the port at end 1
     * @param portTwoGUID unique identifier of the port at end 2

     * @throws InvalidParameterException  one of the parameters is invalid
     * @throws UserNotAuthorizedException the user is not authorized to issue this request
     * @throws PropertyServerException    there is a problem reported in the open metadata server(s)
     */
    public void clearPortDelegation(String userId,
                                    String assetManagerGUID,
                                    String assetManagerName,
                                    String portOneGUID,
                                    String portTwoGUID) throws InvalidParameterException,
                                                               UserNotAuthorizedException,
                                                               PropertyServerException
    {
        // todo
    }


    /**
     * Link a schema type to a port to show the structure of data it accepts.
     *
     * @param userId calling user
     * @param assetManagerGUID unique identifier of software server capability representing the caller
     * @param assetManagerName unique name of software server capability representing the caller
     * @param assetManagerIsHome ensure that only the asset manager can update this asset
     * @param portGUID unique identifier of the port
     * @param schemaTypeGUID unique identifier of the schemaType
     *
     * @throws InvalidParameterException  one of the parameters is invalid
     * @throws UserNotAuthorizedException the user is not authorized to issue this request
     * @throws PropertyServerException    there is a problem reported in the open metadata server(s)
     */
    public void setupPortSchemaType(String  userId,
                                    String  assetManagerGUID,
                                    String  assetManagerName,
                                    boolean assetManagerIsHome,
                                    String  portGUID,
                                    String  schemaTypeGUID) throws InvalidParameterException,
                                                                   UserNotAuthorizedException,
                                                                   PropertyServerException
    {
        // todo
    }


    /**
     * Remove the schema type from a port.
     *
     * @param userId calling user
     * @param assetManagerGUID unique identifier of software server capability representing the caller
     * @param assetManagerName unique name of software server capability representing the caller
     * @param portGUID unique identifier of the port
     * @param schemaTypeGUID unique identifier of the schemaType

     * @throws InvalidParameterException  one of the parameters is invalid
     * @throws UserNotAuthorizedException the user is not authorized to issue this request
     * @throws PropertyServerException    there is a problem reported in the open metadata server(s)
     */
    public void clearPortSchemaType(String userId,
                                    String assetManagerGUID,
                                    String assetManagerName,
                                    String portGUID,
                                    String schemaTypeGUID) throws InvalidParameterException,
                                                                  UserNotAuthorizedException,
                                                                  PropertyServerException
    {
        // todo
    }


    /**
     * Remove the metadata element representing a port.
     *
     * @param userId calling user
     * @param assetManagerGUID unique identifier of software server capability representing the caller
     * @param assetManagerName unique name of software server capability representing the caller
     * @param portGUID unique identifier of the metadata element to remove
     * @param portExternalIdentifier unique identifier of the port in the external asset manager
     *
     * @throws InvalidParameterException  one of the parameters is invalid
     * @throws UserNotAuthorizedException the user is not authorized to issue this request
     * @throws PropertyServerException    there is a problem reported in the open metadata server(s)
     */
    public void removePort(String userId,
                           String assetManagerGUID,
                           String assetManagerName,
                           String portGUID,
                           String portExternalIdentifier) throws InvalidParameterException,
                                                                 UserNotAuthorizedException,
                                                                 PropertyServerException
    {
        // todo
    }


    /**
     * Retrieve the list of port metadata elements that contain the search string.
     * The search string is treated as a regular expression.
     *
     * @param userId calling user
     * @param assetManagerGUID unique identifier of software server capability representing the caller
     * @param assetManagerName unique name of software server capability representing the caller
     * @param searchString string to find in the properties
     * @param startFrom paging start point
     * @param pageSize maximum results that can be returned
     *
     * @return list of matching metadata elements
     *
     * @throws InvalidParameterException  one of the parameters is invalid
     * @throws UserNotAuthorizedException the user is not authorized to issue this request
     * @throws PropertyServerException    there is a problem reported in the open metadata server(s)
     */
    public List<PortElement>   findPorts(String userId,
                                         String assetManagerGUID,
                                         String assetManagerName,
                                         String searchString,
                                         int    startFrom,
                                         int    pageSize) throws InvalidParameterException,
                                                                 UserNotAuthorizedException,
                                                                 PropertyServerException
    {
        // todo
        return null;
    }


    /**
     * Retrieve the list of ports associated with a process.
     *
     * @param userId calling user
     * @param assetManagerGUID unique identifier of software server capability representing the caller
     * @param assetManagerName unique name of software server capability representing the caller
     * @param processGUID unique identifier of the process of interest
     * @param startFrom paging start point
     * @param pageSize maximum results that can be returned
     *
     * @return list of associated metadata elements
     *
     * @throws InvalidParameterException  one of the parameters is invalid
     * @throws UserNotAuthorizedException the user is not authorized to issue this request
     * @throws PropertyServerException    there is a problem reported in the open metadata server(s)
     */
    public List<PortElement>    getPortsForProcess(String userId,
                                                   String assetManagerGUID,
                                                   String assetManagerName,
                                                   String processGUID,
                                                   int    startFrom,
                                                   int    pageSize) throws InvalidParameterException,
                                                                           UserNotAuthorizedException,
                                                                           PropertyServerException
    {
        // todo
        return null;
    }


    /**
     * Retrieve the list of ports that delegate to this port.
     *
     * @param userId calling user
     * @param assetManagerGUID unique identifier of software server capability representing the caller
     * @param assetManagerName unique name of software server capability representing the caller
     * @param portGUID unique identifier of the starting port
     * @param startFrom paging start point
     * @param pageSize maximum results that can be returned
     *
     * @return list of associated metadata elements
     *
     * @throws InvalidParameterException  one of the parameters is invalid
     * @throws UserNotAuthorizedException the user is not authorized to issue this request
     * @throws PropertyServerException    there is a problem reported in the open metadata server(s)
     */
    public List<PortElement>  getPortUse(String userId,
                                         String assetManagerGUID,
                                         String assetManagerName,
                                         String portGUID,
                                         int    startFrom,
                                         int    pageSize) throws InvalidParameterException,
                                                                 UserNotAuthorizedException,
                                                                 PropertyServerException
    {
        // todo
        return null;
    }


    /**
     * Retrieve the port that this port delegates to.
     *
     * @param userId calling user
     * @param assetManagerGUID unique identifier of software server capability representing the caller
     * @param assetManagerName unique name of software server capability representing the caller
     * @param portGUID unique identifier of the starting port alias
     *
     * @return matching metadata element
     *
     * @throws InvalidParameterException  one of the parameters is invalid
     * @throws UserNotAuthorizedException the user is not authorized to issue this request
     * @throws PropertyServerException    there is a problem reported in the open metadata server(s)
     */
    public PortElement getPortDelegation(String userId,
                                         String assetManagerGUID,
                                         String assetManagerName,
                                         String portGUID) throws InvalidParameterException,
                                                                 UserNotAuthorizedException,
                                                                 PropertyServerException
    {
        // todo
        return null;
    }


    /**
     * Retrieve the list of port metadata elements with a matching qualified or display name.
     * There are no wildcards supported on this request.
     *
     * @param userId calling user
     * @param assetManagerGUID unique identifier of software server capability representing the caller
     * @param assetManagerName unique name of software server capability representing the caller
     * @param name name to search for
     * @param startFrom paging start point
     * @param pageSize maximum results that can be returned
     *
     * @return list of matching metadata elements
     *
     * @throws InvalidParameterException  one of the parameters is invalid
     * @throws UserNotAuthorizedException the user is not authorized to issue this request
     * @throws PropertyServerException    there is a problem reported in the open metadata server(s)
     */
    public List<PortElement>   getPortsByName(String userId,
                                              String assetManagerGUID,
                                              String assetManagerName,
                                              String name,
                                              int    startFrom,
                                              int    pageSize) throws InvalidParameterException,
                                                                      UserNotAuthorizedException,
                                                                      PropertyServerException
    {
        // todo
        return null;
    }


    /**
     * Retrieve the port metadata element with the supplied unique identifier.
     *
     * @param userId calling user
     * @param assetManagerGUID unique identifier of software server capability representing the caller
     * @param assetManagerName unique name of software server capability representing the caller
     * @param portGUID unique identifier of the requested metadata element
     *
     * @return matching metadata element
     *
     * @throws InvalidParameterException  one of the parameters is invalid
     * @throws UserNotAuthorizedException the user is not authorized to issue this request
     * @throws PropertyServerException    there is a problem reported in the open metadata server(s)
     */
    public PortElement getPortByGUID(String userId,
                                     String assetManagerGUID,
                                     String assetManagerName,
                                     String portGUID) throws InvalidParameterException,
                                                             UserNotAuthorizedException,
                                                             PropertyServerException
    {
        // todo
        return null;
    }


    /* ===============================================================================
     * General linkage and classifications
     */


    /**
     * Classify a port, process or asset as "BusinessSignificant" (this may effect the way that lineage is displayed).
     *
     * @param userId calling user
     * @param assetManagerGUID unique identifier of software server capability representing the caller
     * @param assetManagerName unique name of software server capability representing the caller
     * @param elementGUID unique identifier of the metadata element to update
     * @param elementExternalIdentifier unique identifier of the port in the external asset manager
     *
     * @throws InvalidParameterException  one of the parameters is invalid
     * @throws UserNotAuthorizedException the user is not authorized to issue this request
     * @throws PropertyServerException    there is a problem reported in the open metadata server(s)
     */
    public void setBusinessSignificant(String userId,
                                       String assetManagerGUID,
                                       String assetManagerName,
                                       String elementGUID,
                                       String elementExternalIdentifier) throws InvalidParameterException,
                                                                                UserNotAuthorizedException,
                                                                                PropertyServerException
    {
        // todo
    }


    /**
     * Remove the "BusinessSignificant" designation from the element.
     *
     * @param userId calling user
     * @param assetManagerGUID unique identifier of software server capability representing the caller
     * @param assetManagerName unique name of software server capability representing the caller
     * @param elementGUID unique identifier of the metadata element to update
     * @param elementExternalIdentifier unique identifier of the element in the external asset manager (can be null)
     *
     * @throws InvalidParameterException  one of the parameters is invalid
     * @throws UserNotAuthorizedException the user is not authorized to issue this request
     * @throws PropertyServerException    there is a problem reported in the open metadata server(s)
     */
    public void clearBusinessSignificant(String userId,
                                         String assetManagerGUID,
                                         String assetManagerName,
                                         String elementGUID,
                                         String elementExternalIdentifier) throws InvalidParameterException,
                                                                                  UserNotAuthorizedException,
                                                                                  PropertyServerException
    {
        // todo
    }


    /**
     * Link two elements together to show that data flows from one to the other.
     *
     * @param userId calling user
     * @param assetManagerGUID unique identifier of software server capability representing the caller
     * @param assetManagerName unique name of software server capability representing the caller
     * @param assetManagerIsHome ensure that only the asset manager can update this asset
     * @param dataSupplierGUID unique identifier of the data supplier
     * @param dataConsumerGUID unique identifier of the data consumer
     * @param qualifiedName unique identifier for this relationship
     * @param description description and/or purpose of the data flow
     * @param formula function that determines the subset of the data that flows
     *
     * @return unique identifier of the relationship
     *
     * @throws InvalidParameterException  one of the parameters is invalid
     * @throws UserNotAuthorizedException the user is not authorized to issue this request
     * @throws PropertyServerException    there is a problem reported in the open metadata server(s)
     */
    public String setupDataFlow(String  userId,
                                String  assetManagerGUID,
                                String  assetManagerName,
                                boolean assetManagerIsHome,
                                String  dataSupplierGUID,
                                String  dataConsumerGUID,
                                String  qualifiedName,
                                String  description,
                                String  formula) throws InvalidParameterException,
                                                        UserNotAuthorizedException,
                                                        PropertyServerException
    {
        // todo
        return null;
    }


    /**
     * Retrieve the data flow relationship between two elements.  The qualifiedName is optional unless there
     * is more than one data flow relationships between these two elements since it is used to disambiguate
     * the request.
     *
     * @param userId calling user
     * @param dataSupplierGUID unique identifier of the data supplier
     * @param dataConsumerGUID unique identifier of the data consumer
     * @param qualifiedName unique identifier for this relationship
     *
     * @return unique identifier and properties of the relationship
     *
     * @throws InvalidParameterException  one of the parameters is invalid
     * @throws UserNotAuthorizedException the user is not authorized to issue this request
     * @throws PropertyServerException    there is a problem reported in the open metadata server(s)
     */
    public DataFlowElement getDataFlow(String  userId,
                                       String  dataSupplierGUID,
                                       String  dataConsumerGUID,
                                       String  qualifiedName) throws InvalidParameterException,
                                                                     UserNotAuthorizedException,
                                                                     PropertyServerException
    {
        // todo
        return null;
    }


    /**
     * Update relationship between two elements that shows that data flows from one to the other.
     *
     * @param userId calling user
     * @param assetManagerGUID unique identifier of software server capability representing the caller
     * @param assetManagerName unique name of software server capability representing the caller
     * @param dataFlowGUID unique identifier of the data flow relationship
     * @param qualifiedName unique identifier for this relationship
     * @param description description and/or purpose of the data flow
     * @param formula function that determines the subset of the data that flows
     *
     *
     * @throws InvalidParameterException  one of the parameters is invalid
     * @throws UserNotAuthorizedException the user is not authorized to issue this request
     * @throws PropertyServerException    there is a problem reported in the open metadata server(s)
     */
    public void   updateDataFlow(String userId,
                                 String assetManagerGUID,
                                 String assetManagerName,
                                 String dataFlowGUID,
                                 String qualifiedName,
                                 String description,
                                 String formula) throws InvalidParameterException,
                                                        UserNotAuthorizedException,
                                                        PropertyServerException
    {
        // todo
    }


    /**
     * Remove the data flow relationship between two elements.
     *
     * @param userId calling user
     * @param assetManagerGUID unique identifier of software server capability representing the caller
     * @param assetManagerName unique name of software server capability representing the caller
     * @param dataFlowGUID unique identifier of the data flow relationship

     * @throws InvalidParameterException  one of the parameters is invalid
     * @throws UserNotAuthorizedException the user is not authorized to issue this request
     * @throws PropertyServerException    there is a problem reported in the open metadata server(s)
     */
    public void clearDataFlow(String userId,
                              String assetManagerGUID,
                              String assetManagerName,
                              String dataFlowGUID) throws InvalidParameterException,
                                                          UserNotAuthorizedException,
                                                          PropertyServerException
    {
        // todo
    }


    /**
     * Link two elements to show that when one completes the next is started.
     *
     * @param userId calling user
     * @param assetManagerGUID unique identifier of software server capability representing the caller
     * @param assetManagerName unique name of software server capability representing the caller
     * @param assetManagerIsHome ensure that only the asset manager can update this asset
     * @param currentStepGUID unique identifier of the previous step
     * @param nextStepGUID unique identifier of the next step
     * @param qualifiedName unique identifier for this relationship
     * @param description description and/or purpose of the data flow
     * @param guard function that must be true to travel down this control flow
     *
     * @return unique identifier for the control flow relationship
     *
     * @throws InvalidParameterException  one of the parameters is invalid
     * @throws UserNotAuthorizedException the user is not authorized to issue this request
     * @throws PropertyServerException    there is a problem reported in the open metadata server(s)
     */
    public String setupControlFlow(String  userId,
                                   String  assetManagerGUID,
                                   String  assetManagerName,
                                   boolean assetManagerIsHome,
                                   String  currentStepGUID,
                                   String  nextStepGUID,
                                   String  qualifiedName,
                                   String  description,
                                   String  guard) throws InvalidParameterException,
                                                         UserNotAuthorizedException,
                                                         PropertyServerException
    {
        // todo
        return null;
    }


    /**
     * Retrieve the control flow relationship between two elements.  The qualifiedName is optional unless there
     * is more than one control flow relationships between these two elements since it is used to disambiguate
     * the request.
     *
     * @param userId calling user
     * @param currentStepGUID unique identifier of the previous step
     * @param nextStepGUID unique identifier of the next step
     * @param qualifiedName unique identifier for this relationship
     *
     * @return unique identifier and properties of the relationship
     *
     * @throws InvalidParameterException  one of the parameters is invalid
     * @throws UserNotAuthorizedException the user is not authorized to issue this request
     * @throws PropertyServerException    there is a problem reported in the open metadata server(s)
     */
    public ControlFlowElement getControlFlow(String userId,
                                             String currentStepGUID,
                                             String nextStepGUID,
                                             String qualifiedName) throws InvalidParameterException,
                                                                          UserNotAuthorizedException,
                                                                          PropertyServerException
    {
        // todo
        return null;
    }


    /**
     * Update the relationship between two elements that shows that when one completes the next is started.
     *
     * @param userId calling user
     * @param assetManagerGUID unique identifier of software server capability representing the caller
     * @param assetManagerName unique name of software server capability representing the caller
     * @param controlFlowGUID unique identifier of the  control flow relationship
     * @param qualifiedName unique identifier for this relationship
     * @param description description and/or purpose of the data flow
     * @param guard function that must be true to travel down this control flow
     *
     * @throws InvalidParameterException  one of the parameters is invalid
     * @throws UserNotAuthorizedException the user is not authorized to issue this request
     * @throws PropertyServerException    there is a problem reported in the open metadata server(s)
     */
    public void updateControlFlow(String userId,
                                  String assetManagerGUID,
                                  String assetManagerName,
                                  String controlFlowGUID,
                                  String qualifiedName,
                                  String description,
                                  String guard) throws InvalidParameterException,
                                                       UserNotAuthorizedException,
                                                       PropertyServerException
    {
        // todo
    }


    /**
     * Remove the control flow relationship between two elements.
     *
     * @param userId calling user
     * @param assetManagerGUID unique identifier of software server capability representing the caller
     * @param assetManagerName unique name of software server capability representing the caller
     * @param controlFlowGUID unique identifier of the  control flow relationship
     *
     * @throws InvalidParameterException  one of the parameters is invalid
     * @throws UserNotAuthorizedException the user is not authorized to issue this request
     * @throws PropertyServerException    there is a problem reported in the open metadata server(s)
     */
    public void clearControlFlow(String userId,
                                 String assetManagerGUID,
                                 String assetManagerName,
                                 String controlFlowGUID) throws InvalidParameterException,
                                                                UserNotAuthorizedException,
                                                                PropertyServerException
    {
        // todo
    }


    /**
     * Link two elements together to show a request-response call between them.
     *
     * @param userId calling user
     * @param assetManagerGUID unique identifier of software server capability representing the caller
     * @param assetManagerName unique name of software server capability representing the caller
     * @param assetManagerIsHome ensure that only the asset manager can update this asset
     * @param callerGUID unique identifier of the element that is making the call
     * @param calledGUID unique identifier of the element that is processing the call
     * @param qualifiedName unique identifier for this relationship
     * @param description description and/or purpose of the data flow
     * @param formula function that determines the subset of the data that flows
     *
     * @return unique identifier of the new relationship
     *
     * @throws InvalidParameterException  one of the parameters is invalid
     * @throws UserNotAuthorizedException the user is not authorized to issue this request
     * @throws PropertyServerException    there is a problem reported in the open metadata server(s)
     */
    public String setupProcessCall(String  userId,
                                   String  assetManagerGUID,
                                   String  assetManagerName,
                                   boolean assetManagerIsHome,
                                   String  callerGUID,
                                   String  calledGUID,
                                   String  qualifiedName,
                                   String  description,
                                   String  formula) throws InvalidParameterException,
                                                           UserNotAuthorizedException,
                                                           PropertyServerException
    {
        // todo
        return null;
    }


    /**
     * Retrieve the process call relationship between two elements.  The qualifiedName is optional unless there
     * is more than one process call relationships between these two elements since it is used to disambiguate
     * the request.
     *
     * @param userId calling user
     * @param callerGUID unique identifier of the element that is making the call
     * @param calledGUID unique identifier of the element that is processing the call
     * @param qualifiedName unique identifier for this relationship
     *
     * @return unique identifier and properties of the relationship
     *
     * @throws InvalidParameterException  one of the parameters is invalid
     * @throws UserNotAuthorizedException the user is not authorized to issue this request
     * @throws PropertyServerException    there is a problem reported in the open metadata server(s)
     */
    public ProcessCallElement getProcessCall(String userId,
                                             String callerGUID,
                                             String calledGUID,
                                             String qualifiedName) throws InvalidParameterException,
                                                                          UserNotAuthorizedException,
                                                                          PropertyServerException
    {
        // todo
        return null;
    }


    /**
     * Update the relationship between two elements that shows a request-response call between them.
     *
     * @param userId calling user
     * @param assetManagerGUID unique identifier of software server capability representing the caller
     * @param assetManagerName unique name of software server capability representing the caller
     * @param processCallGUID unique identifier of the process call relationship
     * @param qualifiedName unique identifier for this relationship
     * @param description description and/or purpose of the data flow
     * @param formula function that determines the subset of the data that flows
     *
     * @throws InvalidParameterException  one of the parameters is invalid
     * @throws UserNotAuthorizedException the user is not authorized to issue this request
     * @throws PropertyServerException    there is a problem reported in the open metadata server(s)
     */
    public void updateProcessCall(String userId,
                                  String assetManagerGUID,
                                  String assetManagerName,
                                  String processCallGUID,
                                  String qualifiedName,
                                  String description,
                                  String formula) throws InvalidParameterException,
                                                         UserNotAuthorizedException,
                                                         PropertyServerException
    {
        // todo
    }


    /**
     * Remove the process call relationship.
     *
     * @param userId calling user
     * @param assetManagerGUID unique identifier of software server capability representing the caller
     * @param assetManagerName unique name of software server capability representing the caller
     * @param processCallGUID unique identifier of the process call relationship

     * @throws InvalidParameterException  one of the parameters is invalid
     * @throws UserNotAuthorizedException the user is not authorized to issue this request
     * @throws PropertyServerException    there is a problem reported in the open metadata server(s)
     */
    public void clearProcessCall(String userId,
                                 String assetManagerGUID,
                                 String assetManagerName,
                                 String processCallGUID) throws InvalidParameterException,
                                                                UserNotAuthorizedException,
                                                                PropertyServerException
    {
        // todo
    }


    /**
     * Link to elements together to show that they are part of the lineage of the data that is moving
     * between the processes.  Typically the lineage relationships match the DataFlow relationships.
     * However, they may occur at less granular process definitions that the detailed data and control flows
     * that have been captured.
     *
     * @param userId calling user
     * @param assetManagerGUID unique identifier of software server capability representing the caller
     * @param assetManagerName unique name of software server capability representing the caller
     * @param assetManagerIsHome ensure that only the asset manager can update this asset
     * @param sourceElementGUID unique identifier of the source
     * @param destinationElementGUID unique identifier of the destination
     *
     * @throws InvalidParameterException  one of the parameters is invalid
     * @throws UserNotAuthorizedException the user is not authorized to issue this request
     * @throws PropertyServerException    there is a problem reported in the open metadata server(s)
     */
    public void setupLineageMapping(String  userId,
                                    String  assetManagerGUID,
                                    String  assetManagerName,
                                    boolean assetManagerIsHome,
                                    String  sourceElementGUID,
                                    String  destinationElementGUID) throws InvalidParameterException,
                                                                           UserNotAuthorizedException,
                                                                           PropertyServerException
    {
        // todo
    }


    /**
     * Remove the lineage mapping between two elements.
     *
     * @param userId calling user
     * @param assetManagerGUID unique identifier of software server capability representing the caller
     * @param assetManagerName unique name of software server capability representing the caller
     * @param sourceElementGUID unique identifier of the source
     * @param destinationElementGUID unique identifier of the destination

     * @throws InvalidParameterException  one of the parameters is invalid
     * @throws UserNotAuthorizedException the user is not authorized to issue this request
     * @throws PropertyServerException    there is a problem reported in the open metadata server(s)
     */
    public void clearLineageMapping(String userId,
                                    String assetManagerGUID,
                                    String assetManagerName,
                                    String sourceElementGUID,
                                    String destinationElementGUID) throws InvalidParameterException,
                                                                          UserNotAuthorizedException,
                                                                          PropertyServerException
    {
        // todo
    }
}
