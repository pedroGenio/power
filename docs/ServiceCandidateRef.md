

# ServiceCandidateRef

ServiceCandidate reference. ServiceCandidate is an entity that makes a ServiceSpecification available to a catalog.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Unique identifier of the service candidate | 
**href** | **String** | Unique reference of the service candidate |  [optional]
**name** | **String** | Name of the service candidate |  [optional]
**version** | **String** | Version of the service candidate |  [optional]
**atBaseType** | **String** | When sub-classing, this defines the super-class |  [optional]
**atSchemaLocation** | [**URI**](URI.md) | A URI to a JSON-Schema file that defines additional attributes and relationships |  [optional]
**atType** | **String** | When sub-classing, this defines the sub-class entity name |  [optional]
**atReferredType** | **String** | The actual type of the target instance when needed for disambiguation. |  [optional]



