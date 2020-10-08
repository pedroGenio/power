

# ConstraintRef

Constraint reference. The Constraint resource represents a policy/rule applied to an entity or entity spec.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | reference id to the target constraint | 
**href** | **String** | Hyperlink reference to the target constraint |  [optional]
**name** | **String** | Name given to the constraint |  [optional]
**version** | **String** | constraint version |  [optional]
**atBaseType** | **String** | When sub-classing, this defines the super-class |  [optional]
**atSchemaLocation** | [**URI**](URI.md) | A URI to a JSON-Schema file that defines additional attributes and relationships |  [optional]
**atType** | **String** | When sub-classing, this defines the sub-class entity name |  [optional]
**atReferredType** | **String** | The (class) type of the referred constraint |  [optional]



