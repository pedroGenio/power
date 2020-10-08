

# ProductSpecificationRelationship

A migration, substitution, dependency or exclusivity relationship between/among product specifications.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Unique identifier of the productSpecification |  [optional]
**href** | **String** | Reference of the productSpecification |  [optional]
**relationshipType** | **String** | Type of relationship such as migration, substitution, dependency, exclusivity |  [optional]
**validFor** | [**TimePeriod**](TimePeriod.md) |  |  [optional]
**atBaseType** | **String** | When sub-classing, this defines the super-class |  [optional]
**atSchemaLocation** | [**URI**](URI.md) | A URI to a JSON-Schema file that defines additional attributes and relationships |  [optional]
**atType** | **String** | When sub-classing, this defines the sub-class entity name |  [optional]



