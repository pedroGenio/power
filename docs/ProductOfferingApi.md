# ProductOfferingApi

All URIs are relative to *http://localhost:3000/platform/productCatalogManagement/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listProductOffering**](ProductOfferingApi.md#listProductOffering) | **GET** /productOffering | List or find ProductOffering objects
[**retrieveProductOffering**](ProductOfferingApi.md#retrieveProductOffering) | **GET** /productOffering/{id} | Retrieves a ProductOffering by ID


<a name="listProductOffering"></a>
# **listProductOffering**
> List&lt;ProductOffering&gt; listProductOffering(fields, offset, limit)

List or find ProductOffering objects

This operation list or find ProductOffering entities

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProductOfferingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:3000/platform/productCatalogManagement/v4");

    ProductOfferingApi apiInstance = new ProductOfferingApi(defaultClient);
    String fields = "fields_example"; // String | Comma-separated properties to be provided in response
    Integer offset = 56; // Integer | Requested index for start of resources to be provided in response
    Integer limit = 56; // Integer | Requested number of resources to be provided in response
    try {
      List<ProductOffering> result = apiInstance.listProductOffering(fields, offset, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductOfferingApi#listProductOffering");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fields** | **String**| Comma-separated properties to be provided in response | [optional]
 **offset** | **Integer**| Requested index for start of resources to be provided in response | [optional]
 **limit** | **Integer**| Requested number of resources to be provided in response | [optional]

### Return type

[**List&lt;ProductOffering&gt;**](ProductOffering.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  * X-Total-Count - Total number of items matching criteria <br>  * X-Result-Count - Actual number of items returned in the response body <br>  |
**400** | Bad Request |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |
**405** | Method Not allowed |  -  |
**409** | Conflict |  -  |
**500** | Internal Server Error |  -  |

<a name="retrieveProductOffering"></a>
# **retrieveProductOffering**
> ProductOffering retrieveProductOffering(id, fields)

Retrieves a ProductOffering by ID

This operation retrieves a ProductOffering entity. Attribute selection is enabled for all first level attributes.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProductOfferingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:3000/platform/productCatalogManagement/v4");

    ProductOfferingApi apiInstance = new ProductOfferingApi(defaultClient);
    String id = "id_example"; // String | Identifier of the ProductOffering
    String fields = "fields_example"; // String | Comma-separated properties to provide in response
    try {
      ProductOffering result = apiInstance.retrieveProductOffering(id, fields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductOfferingApi#retrieveProductOffering");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Identifier of the ProductOffering |
 **fields** | **String**| Comma-separated properties to provide in response | [optional]

### Return type

[**ProductOffering**](ProductOffering.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Bad Request |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |
**405** | Method Not allowed |  -  |
**409** | Conflict |  -  |
**500** | Internal Server Error |  -  |

