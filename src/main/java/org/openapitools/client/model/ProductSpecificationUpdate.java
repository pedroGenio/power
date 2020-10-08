/*
 * CoalFired product catalog
 * This API contains a catalog of CoalFired's products and pricing
 *
 * The version of the OpenAPI document: 1.0
 * Contact: support+coalfired@practiv.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.AttachmentRefOrValue;
import org.openapitools.client.model.BundledProductSpecification;
import org.openapitools.client.model.ProductSpecificationCharacteristic;
import org.openapitools.client.model.ProductSpecificationRelationship;
import org.openapitools.client.model.RelatedParty;
import org.openapitools.client.model.ResourceSpecificationRef;
import org.openapitools.client.model.ServiceSpecificationRef;
import org.openapitools.client.model.TargetProductSchema;
import org.openapitools.client.model.TimePeriod;

/**
 * Is a detailed description of a tangible or intangible object made available externally in the form of a ProductOffering to customers or other parties playing a party role. Skipped properties: id,href,lastUpdate
 */
@ApiModel(description = "Is a detailed description of a tangible or intangible object made available externally in the form of a ProductOffering to customers or other parties playing a party role. Skipped properties: id,href,lastUpdate")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-10-08T14:44:14.902+13:00[Pacific/Auckland]")
public class ProductSpecificationUpdate {
  public static final String SERIALIZED_NAME_BRAND = "brand";
  @SerializedName(SERIALIZED_NAME_BRAND)
  private String brand;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_IS_BUNDLE = "isBundle";
  @SerializedName(SERIALIZED_NAME_IS_BUNDLE)
  private Boolean isBundle;

  public static final String SERIALIZED_NAME_LIFECYCLE_STATUS = "lifecycleStatus";
  @SerializedName(SERIALIZED_NAME_LIFECYCLE_STATUS)
  private String lifecycleStatus;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PRODUCT_NUMBER = "productNumber";
  @SerializedName(SERIALIZED_NAME_PRODUCT_NUMBER)
  private String productNumber;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public static final String SERIALIZED_NAME_ATTACHMENT = "attachment";
  @SerializedName(SERIALIZED_NAME_ATTACHMENT)
  private List<AttachmentRefOrValue> attachment = null;

  public static final String SERIALIZED_NAME_BUNDLED_PRODUCT_SPECIFICATION = "bundledProductSpecification";
  @SerializedName(SERIALIZED_NAME_BUNDLED_PRODUCT_SPECIFICATION)
  private List<BundledProductSpecification> bundledProductSpecification = null;

  public static final String SERIALIZED_NAME_PRODUCT_SPEC_CHARACTERISTIC = "productSpecCharacteristic";
  @SerializedName(SERIALIZED_NAME_PRODUCT_SPEC_CHARACTERISTIC)
  private List<ProductSpecificationCharacteristic> productSpecCharacteristic = null;

  public static final String SERIALIZED_NAME_PRODUCT_SPECIFICATION_RELATIONSHIP = "productSpecificationRelationship";
  @SerializedName(SERIALIZED_NAME_PRODUCT_SPECIFICATION_RELATIONSHIP)
  private List<ProductSpecificationRelationship> productSpecificationRelationship = null;

  public static final String SERIALIZED_NAME_RELATED_PARTY = "relatedParty";
  @SerializedName(SERIALIZED_NAME_RELATED_PARTY)
  private List<RelatedParty> relatedParty = null;

  public static final String SERIALIZED_NAME_RESOURCE_SPECIFICATION = "resourceSpecification";
  @SerializedName(SERIALIZED_NAME_RESOURCE_SPECIFICATION)
  private List<ResourceSpecificationRef> resourceSpecification = null;

  public static final String SERIALIZED_NAME_SERVICE_SPECIFICATION = "serviceSpecification";
  @SerializedName(SERIALIZED_NAME_SERVICE_SPECIFICATION)
  private List<ServiceSpecificationRef> serviceSpecification = null;

  public static final String SERIALIZED_NAME_TARGET_PRODUCT_SCHEMA = "targetProductSchema";
  @SerializedName(SERIALIZED_NAME_TARGET_PRODUCT_SCHEMA)
  private TargetProductSchema targetProductSchema;

  public static final String SERIALIZED_NAME_VALID_FOR = "validFor";
  @SerializedName(SERIALIZED_NAME_VALID_FOR)
  private TimePeriod validFor;

  public static final String SERIALIZED_NAME_AT_BASE_TYPE = "@baseType";
  @SerializedName(SERIALIZED_NAME_AT_BASE_TYPE)
  private String atBaseType;

  public static final String SERIALIZED_NAME_AT_SCHEMA_LOCATION = "@schemaLocation";
  @SerializedName(SERIALIZED_NAME_AT_SCHEMA_LOCATION)
  private URI atSchemaLocation;

  public static final String SERIALIZED_NAME_AT_TYPE = "@type";
  @SerializedName(SERIALIZED_NAME_AT_TYPE)
  private String atType;


  public ProductSpecificationUpdate brand(String brand) {
    
    this.brand = brand;
    return this;
  }

   /**
   * The manufacturer or trademark of the specification
   * @return brand
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The manufacturer or trademark of the specification")

  public String getBrand() {
    return brand;
  }


  public void setBrand(String brand) {
    this.brand = brand;
  }


  public ProductSpecificationUpdate description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * A narrative that explains in detail what the product specification is
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A narrative that explains in detail what the product specification is")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public ProductSpecificationUpdate isBundle(Boolean isBundle) {
    
    this.isBundle = isBundle;
    return this;
  }

   /**
   * isBundle determines whether a productSpecification represents a single productSpecification (false), or a bundle of productSpecification (true).
   * @return isBundle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "isBundle determines whether a productSpecification represents a single productSpecification (false), or a bundle of productSpecification (true).")

  public Boolean getIsBundle() {
    return isBundle;
  }


  public void setIsBundle(Boolean isBundle) {
    this.isBundle = isBundle;
  }


  public ProductSpecificationUpdate lifecycleStatus(String lifecycleStatus) {
    
    this.lifecycleStatus = lifecycleStatus;
    return this;
  }

   /**
   * Used to indicate the current lifecycle status
   * @return lifecycleStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Used to indicate the current lifecycle status")

  public String getLifecycleStatus() {
    return lifecycleStatus;
  }


  public void setLifecycleStatus(String lifecycleStatus) {
    this.lifecycleStatus = lifecycleStatus;
  }


  public ProductSpecificationUpdate name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the product specification
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the product specification")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ProductSpecificationUpdate productNumber(String productNumber) {
    
    this.productNumber = productNumber;
    return this;
  }

   /**
   * An identification number assigned to uniquely identity the specification
   * @return productNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An identification number assigned to uniquely identity the specification")

  public String getProductNumber() {
    return productNumber;
  }


  public void setProductNumber(String productNumber) {
    this.productNumber = productNumber;
  }


  public ProductSpecificationUpdate version(String version) {
    
    this.version = version;
    return this;
  }

   /**
   * Product specification version
   * @return version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Product specification version")

  public String getVersion() {
    return version;
  }


  public void setVersion(String version) {
    this.version = version;
  }


  public ProductSpecificationUpdate attachment(List<AttachmentRefOrValue> attachment) {
    
    this.attachment = attachment;
    return this;
  }

  public ProductSpecificationUpdate addAttachmentItem(AttachmentRefOrValue attachmentItem) {
    if (this.attachment == null) {
      this.attachment = new ArrayList<AttachmentRefOrValue>();
    }
    this.attachment.add(attachmentItem);
    return this;
  }

   /**
   * Complements the description of an element (for instance a product) through video, pictures...
   * @return attachment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Complements the description of an element (for instance a product) through video, pictures...")

  public List<AttachmentRefOrValue> getAttachment() {
    return attachment;
  }


  public void setAttachment(List<AttachmentRefOrValue> attachment) {
    this.attachment = attachment;
  }


  public ProductSpecificationUpdate bundledProductSpecification(List<BundledProductSpecification> bundledProductSpecification) {
    
    this.bundledProductSpecification = bundledProductSpecification;
    return this;
  }

  public ProductSpecificationUpdate addBundledProductSpecificationItem(BundledProductSpecification bundledProductSpecificationItem) {
    if (this.bundledProductSpecification == null) {
      this.bundledProductSpecification = new ArrayList<BundledProductSpecification>();
    }
    this.bundledProductSpecification.add(bundledProductSpecificationItem);
    return this;
  }

   /**
   * A type of ProductSpecification that belongs to a grouping of ProductSpecifications made available to the market. It inherits of all attributes of ProductSpecification.
   * @return bundledProductSpecification
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A type of ProductSpecification that belongs to a grouping of ProductSpecifications made available to the market. It inherits of all attributes of ProductSpecification.")

  public List<BundledProductSpecification> getBundledProductSpecification() {
    return bundledProductSpecification;
  }


  public void setBundledProductSpecification(List<BundledProductSpecification> bundledProductSpecification) {
    this.bundledProductSpecification = bundledProductSpecification;
  }


  public ProductSpecificationUpdate productSpecCharacteristic(List<ProductSpecificationCharacteristic> productSpecCharacteristic) {
    
    this.productSpecCharacteristic = productSpecCharacteristic;
    return this;
  }

  public ProductSpecificationUpdate addProductSpecCharacteristicItem(ProductSpecificationCharacteristic productSpecCharacteristicItem) {
    if (this.productSpecCharacteristic == null) {
      this.productSpecCharacteristic = new ArrayList<ProductSpecificationCharacteristic>();
    }
    this.productSpecCharacteristic.add(productSpecCharacteristicItem);
    return this;
  }

   /**
   * A characteristic quality or distinctive feature of a ProductSpecification.  The characteristic can be take on a discrete value, such as color, can take on a range of values, (for example, sensitivity of 100-240 mV), or can be derived from a formula (for example, usage time (hrs) &#x3D; 30 - talk time *3). Certain characteristics, such as color, may be configured during the ordering or some other process.
   * @return productSpecCharacteristic
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A characteristic quality or distinctive feature of a ProductSpecification.  The characteristic can be take on a discrete value, such as color, can take on a range of values, (for example, sensitivity of 100-240 mV), or can be derived from a formula (for example, usage time (hrs) = 30 - talk time *3). Certain characteristics, such as color, may be configured during the ordering or some other process.")

  public List<ProductSpecificationCharacteristic> getProductSpecCharacteristic() {
    return productSpecCharacteristic;
  }


  public void setProductSpecCharacteristic(List<ProductSpecificationCharacteristic> productSpecCharacteristic) {
    this.productSpecCharacteristic = productSpecCharacteristic;
  }


  public ProductSpecificationUpdate productSpecificationRelationship(List<ProductSpecificationRelationship> productSpecificationRelationship) {
    
    this.productSpecificationRelationship = productSpecificationRelationship;
    return this;
  }

  public ProductSpecificationUpdate addProductSpecificationRelationshipItem(ProductSpecificationRelationship productSpecificationRelationshipItem) {
    if (this.productSpecificationRelationship == null) {
      this.productSpecificationRelationship = new ArrayList<ProductSpecificationRelationship>();
    }
    this.productSpecificationRelationship.add(productSpecificationRelationshipItem);
    return this;
  }

   /**
   * A migration, substitution, dependency or exclusivity relationship between/among product specifications.
   * @return productSpecificationRelationship
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A migration, substitution, dependency or exclusivity relationship between/among product specifications.")

  public List<ProductSpecificationRelationship> getProductSpecificationRelationship() {
    return productSpecificationRelationship;
  }


  public void setProductSpecificationRelationship(List<ProductSpecificationRelationship> productSpecificationRelationship) {
    this.productSpecificationRelationship = productSpecificationRelationship;
  }


  public ProductSpecificationUpdate relatedParty(List<RelatedParty> relatedParty) {
    
    this.relatedParty = relatedParty;
    return this;
  }

  public ProductSpecificationUpdate addRelatedPartyItem(RelatedParty relatedPartyItem) {
    if (this.relatedParty == null) {
      this.relatedParty = new ArrayList<RelatedParty>();
    }
    this.relatedParty.add(relatedPartyItem);
    return this;
  }

   /**
   * A related party defines party or party role linked to a specific entity.
   * @return relatedParty
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A related party defines party or party role linked to a specific entity.")

  public List<RelatedParty> getRelatedParty() {
    return relatedParty;
  }


  public void setRelatedParty(List<RelatedParty> relatedParty) {
    this.relatedParty = relatedParty;
  }


  public ProductSpecificationUpdate resourceSpecification(List<ResourceSpecificationRef> resourceSpecification) {
    
    this.resourceSpecification = resourceSpecification;
    return this;
  }

  public ProductSpecificationUpdate addResourceSpecificationItem(ResourceSpecificationRef resourceSpecificationItem) {
    if (this.resourceSpecification == null) {
      this.resourceSpecification = new ArrayList<ResourceSpecificationRef>();
    }
    this.resourceSpecification.add(resourceSpecificationItem);
    return this;
  }

   /**
   * The ResourceSpecification is required to realize a ProductSpecification.
   * @return resourceSpecification
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ResourceSpecification is required to realize a ProductSpecification.")

  public List<ResourceSpecificationRef> getResourceSpecification() {
    return resourceSpecification;
  }


  public void setResourceSpecification(List<ResourceSpecificationRef> resourceSpecification) {
    this.resourceSpecification = resourceSpecification;
  }


  public ProductSpecificationUpdate serviceSpecification(List<ServiceSpecificationRef> serviceSpecification) {
    
    this.serviceSpecification = serviceSpecification;
    return this;
  }

  public ProductSpecificationUpdate addServiceSpecificationItem(ServiceSpecificationRef serviceSpecificationItem) {
    if (this.serviceSpecification == null) {
      this.serviceSpecification = new ArrayList<ServiceSpecificationRef>();
    }
    this.serviceSpecification.add(serviceSpecificationItem);
    return this;
  }

   /**
   * ServiceSpecification(s) required to realize a ProductSpecification.
   * @return serviceSpecification
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ServiceSpecification(s) required to realize a ProductSpecification.")

  public List<ServiceSpecificationRef> getServiceSpecification() {
    return serviceSpecification;
  }


  public void setServiceSpecification(List<ServiceSpecificationRef> serviceSpecification) {
    this.serviceSpecification = serviceSpecification;
  }


  public ProductSpecificationUpdate targetProductSchema(TargetProductSchema targetProductSchema) {
    
    this.targetProductSchema = targetProductSchema;
    return this;
  }

   /**
   * Get targetProductSchema
   * @return targetProductSchema
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TargetProductSchema getTargetProductSchema() {
    return targetProductSchema;
  }


  public void setTargetProductSchema(TargetProductSchema targetProductSchema) {
    this.targetProductSchema = targetProductSchema;
  }


  public ProductSpecificationUpdate validFor(TimePeriod validFor) {
    
    this.validFor = validFor;
    return this;
  }

   /**
   * Get validFor
   * @return validFor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TimePeriod getValidFor() {
    return validFor;
  }


  public void setValidFor(TimePeriod validFor) {
    this.validFor = validFor;
  }


  public ProductSpecificationUpdate atBaseType(String atBaseType) {
    
    this.atBaseType = atBaseType;
    return this;
  }

   /**
   * When sub-classing, this defines the super-class
   * @return atBaseType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "When sub-classing, this defines the super-class")

  public String getAtBaseType() {
    return atBaseType;
  }


  public void setAtBaseType(String atBaseType) {
    this.atBaseType = atBaseType;
  }


  public ProductSpecificationUpdate atSchemaLocation(URI atSchemaLocation) {
    
    this.atSchemaLocation = atSchemaLocation;
    return this;
  }

   /**
   * A URI to a JSON-Schema file that defines additional attributes and relationships
   * @return atSchemaLocation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A URI to a JSON-Schema file that defines additional attributes and relationships")

  public URI getAtSchemaLocation() {
    return atSchemaLocation;
  }


  public void setAtSchemaLocation(URI atSchemaLocation) {
    this.atSchemaLocation = atSchemaLocation;
  }


  public ProductSpecificationUpdate atType(String atType) {
    
    this.atType = atType;
    return this;
  }

   /**
   * When sub-classing, this defines the sub-class entity name
   * @return atType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "When sub-classing, this defines the sub-class entity name")

  public String getAtType() {
    return atType;
  }


  public void setAtType(String atType) {
    this.atType = atType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductSpecificationUpdate productSpecificationUpdate = (ProductSpecificationUpdate) o;
    return Objects.equals(this.brand, productSpecificationUpdate.brand) &&
        Objects.equals(this.description, productSpecificationUpdate.description) &&
        Objects.equals(this.isBundle, productSpecificationUpdate.isBundle) &&
        Objects.equals(this.lifecycleStatus, productSpecificationUpdate.lifecycleStatus) &&
        Objects.equals(this.name, productSpecificationUpdate.name) &&
        Objects.equals(this.productNumber, productSpecificationUpdate.productNumber) &&
        Objects.equals(this.version, productSpecificationUpdate.version) &&
        Objects.equals(this.attachment, productSpecificationUpdate.attachment) &&
        Objects.equals(this.bundledProductSpecification, productSpecificationUpdate.bundledProductSpecification) &&
        Objects.equals(this.productSpecCharacteristic, productSpecificationUpdate.productSpecCharacteristic) &&
        Objects.equals(this.productSpecificationRelationship, productSpecificationUpdate.productSpecificationRelationship) &&
        Objects.equals(this.relatedParty, productSpecificationUpdate.relatedParty) &&
        Objects.equals(this.resourceSpecification, productSpecificationUpdate.resourceSpecification) &&
        Objects.equals(this.serviceSpecification, productSpecificationUpdate.serviceSpecification) &&
        Objects.equals(this.targetProductSchema, productSpecificationUpdate.targetProductSchema) &&
        Objects.equals(this.validFor, productSpecificationUpdate.validFor) &&
        Objects.equals(this.atBaseType, productSpecificationUpdate.atBaseType) &&
        Objects.equals(this.atSchemaLocation, productSpecificationUpdate.atSchemaLocation) &&
        Objects.equals(this.atType, productSpecificationUpdate.atType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brand, description, isBundle, lifecycleStatus, name, productNumber, version, attachment, bundledProductSpecification, productSpecCharacteristic, productSpecificationRelationship, relatedParty, resourceSpecification, serviceSpecification, targetProductSchema, validFor, atBaseType, atSchemaLocation, atType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductSpecificationUpdate {\n");
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    isBundle: ").append(toIndentedString(isBundle)).append("\n");
    sb.append("    lifecycleStatus: ").append(toIndentedString(lifecycleStatus)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    productNumber: ").append(toIndentedString(productNumber)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    attachment: ").append(toIndentedString(attachment)).append("\n");
    sb.append("    bundledProductSpecification: ").append(toIndentedString(bundledProductSpecification)).append("\n");
    sb.append("    productSpecCharacteristic: ").append(toIndentedString(productSpecCharacteristic)).append("\n");
    sb.append("    productSpecificationRelationship: ").append(toIndentedString(productSpecificationRelationship)).append("\n");
    sb.append("    relatedParty: ").append(toIndentedString(relatedParty)).append("\n");
    sb.append("    resourceSpecification: ").append(toIndentedString(resourceSpecification)).append("\n");
    sb.append("    serviceSpecification: ").append(toIndentedString(serviceSpecification)).append("\n");
    sb.append("    targetProductSchema: ").append(toIndentedString(targetProductSchema)).append("\n");
    sb.append("    validFor: ").append(toIndentedString(validFor)).append("\n");
    sb.append("    atBaseType: ").append(toIndentedString(atBaseType)).append("\n");
    sb.append("    atSchemaLocation: ").append(toIndentedString(atSchemaLocation)).append("\n");
    sb.append("    atType: ").append(toIndentedString(atType)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

