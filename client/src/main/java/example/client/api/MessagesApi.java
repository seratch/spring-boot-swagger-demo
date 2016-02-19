package example.client.api;

import example.client.invoker.ApiException;
import example.client.invoker.ApiClient;
import example.client.invoker.Configuration;
import example.client.invoker.Pair;

import javax.ws.rs.core.GenericType;

import example.client.model.Message;

import java.util.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-02-19T17:37:14.988+09:00")
public class MessagesApi {
  private ApiClient apiClient;

  public MessagesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public MessagesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Returns stored messages
   * This endpoint just returns all stored messages.
   * @return List<Message>
   */
  public List<Message> showMessages() throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/messages".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<List<Message>> returnType = new GenericType<List<Message>>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
}
