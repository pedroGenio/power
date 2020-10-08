

# ResourceCandidateRef

ResourceCandidate reference: A resource candidate is an entity that makes a ResourceSpecification available to a catalog.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Unique identifier of the resource candidate | 
**href** | **String** | Reference of the resource candidate |  [optional]
**name** | **String** | Name of the resource candidate |  [optional]
**version** | **String** | Version of the resource candidate |  [optional]
**atBaseType** | **String** | When sub-classing, this defines the super-class |  [optional]
**atSchemaLocation** | [**URI**](URI.md) | A URI to a JSON-Schema file that defines additional attributes and relationships |  [optional]
**atType** | **String** | When sub-classing, this defines the sub-class entity name |  [optional]
**atReferredType** | **String** | The actual type of the target instance when needed for disambiguation. |  [optional]



