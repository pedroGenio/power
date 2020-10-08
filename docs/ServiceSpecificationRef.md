

# ServiceSpecificationRef

Service specification reference: ServiceSpecification(s) required to realize a ProductSpecification.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Unique identifier of the service specification | 
**href** | **String** | Reference of the serviceSpecification |  [optional]
**name** | **String** | Name of the requiredServiceSpecification |  [optional]
**version** | **String** | Service specification version |  [optional]
**targetServiceSchema** | [**TargetServiceSchema**](TargetServiceSchema.md) |  |  [optional]
**atBaseType** | **String** | When sub-classing, this defines the super-class |  [optional]
**atSchemaLocation** | [**URI**](URI.md) | A URI to a JSON-Schema file that defines additional attributes and relationships |  [optional]
**atType** | **String** | When sub-classing, this defines the sub-class entity name |  [optional]
**atReferredType** | **String** | The actual type of the target instance when needed for disambiguation. |  [optional]



