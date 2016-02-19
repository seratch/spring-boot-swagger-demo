package example.client.api;

import example.client.invoker.ApiException;
import example.client.invoker.ApiClient;
import example.client.invoker.Configuration;
import example.client.invoker.Pair;

import javax.ws.rs.core.GenericType;

import java.util.Map;

import java.util.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-02-19T17:37:14.988+09:00")
public class HelloApi {
  private ApiClient apiClient;

  public HelloApi() {
    this(Configuration.getDefaultApiClient());
  }

  public HelloApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Says hello to you
   * This endpoint just tells you a greeting message.&lt;br/&gt;See also: https://en.wikipedia.org/wiki/%22Hello,_World!%22_program
   * @return Map<String, String>
   */
  public Map<String, String> index() throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/hello".replaceAll("\\{format\\}","json");

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

    
    GenericType<Map<String, String>> returnType = new GenericType<Map<String, String>>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Replies to your message
   * This endpoint just replies to your message.
   * @param message message
   * @return Map<String, String>
   */
  public Map<String, String> replyTo(String message) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'message' is set
    if (message == null) {
      throw new ApiException(400, "Missing the required parameter 'message' when calling replyTo");
    }
    
    // create path and map variables
    String path = "/hello".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    if (message != null)
      formParams.put("message", message);
    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/x-www-form-urlencoded"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<Map<String, String>> returnType = new GenericType<Map<String, String>>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
}
