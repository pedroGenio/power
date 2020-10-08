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
import org.openapitools.client.model.CategoryRef;
import org.openapitools.client.model.RelatedParty;
import org.openapitools.client.model.TimePeriod;
import org.threeten.bp.OffsetDateTime;

/**
 * A collection of Product Offerings, intended for a specific DistributionChannel, enhanced with additional information such as SLA parameters, invoicing and shipping details
 */
@ApiModel(description = "A collection of Product Offerings, intended for a specific DistributionChannel, enhanced with additional information such as SLA parameters, invoicing and shipping details")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-10-08T14:44:14.902+13:00[Pacific/Auckland]")
public class Catalog {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_HREF = "href";
  @SerializedName(SERIALIZED_NAME_HREF)
  private String href;

  public static final String SERIALIZED_NAME_CATALOG_TYPE = "catalogType";
  @SerializedName(SERIALIZED_NAME_CATALOG_TYPE)
  private String catalogType;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_LAST_UPDATE = "lastUpdate";
  @SerializedName(SERIALIZED_NAME_LAST_UPDATE)
  private OffsetDateTime lastUpdate;

  public static final String SERIALIZED_NAME_LIFECYCLE_STATUS = "lifecycleStatus";
  @SerializedName(SERIALIZED_NAME_LIFECYCLE_STATUS)
  private String lifecycleStatus;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public static final String SERIALIZED_NAME_CATEGORY = "category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private List<CategoryRef> category = null;

  public static final String SERIALIZED_NAME_RELATED_PARTY = "relatedParty";
  @SerializedName(SERIALIZED_NAME_RELATED_PARTY)
  private List<RelatedParty> relatedParty = null;

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


  public Catalog id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Unique identifier of the Catalog
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unique identifier of the Catalog")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public Catalog href(String href) {
    
    this.href = href;
    return this;
  }

   /**
   * Unique reference of the catalog
   * @return href
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unique reference of the catalog")

  public String getHref() {
    return href;
  }


  public void setHref(String href) {
    this.href = href;
  }


  public Catalog catalogType(String catalogType) {
    
    this.catalogType = catalogType;
    return this;
  }

   /**
   * Indicates if the catalog is a product, service or resource catalog
   * @return catalogType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates if the catalog is a product, service or resource catalog")

  public String getCatalogType() {
    return catalogType;
  }


  public void setCatalogType(String catalogType) {
    this.catalogType = catalogType;
  }


  public Catalog description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Description of this catalog
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Description of this catalog")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public Catalog lastUpdate(OffsetDateTime lastUpdate) {
    
    this.lastUpdate = lastUpdate;
    return this;
  }

   /**
   * Date and time of the last update
   * @return lastUpdate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date and time of the last update")

  public OffsetDateTime getLastUpdate() {
    return lastUpdate;
  }


  public void setLastUpdate(OffsetDateTime lastUpdate) {
    this.lastUpdate = lastUpdate;
  }


  public Catalog lifecycleStatus(String lifecycleStatus) {
    
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


  public Catalog name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the catalog
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the catalog")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Catalog version(String version) {
    
    this.version = version;
    return this;
  }

   /**
   * Catalog version
   * @return version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Catalog version")

  public String getVersion() {
    return version;
  }


  public void setVersion(String version) {
    this.version = version;
  }


  public Catalog category(List<CategoryRef> category) {
    
    this.category = category;
    return this;
  }

  public Catalog addCategoryItem(CategoryRef categoryItem) {
    if (this.category == null) {
      this.category = new ArrayList<CategoryRef>();
    }
    this.category.add(categoryItem);
    return this;
  }

   /**
   * List of root categories contained in this catalog
   * @return category
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of root categories contained in this catalog")

  public List<CategoryRef> getCategory() {
    return category;
  }


  public void setCategory(List<CategoryRef> category) {
    this.category = category;
  }


  public Catalog relatedParty(List<RelatedParty> relatedParty) {
    
    this.relatedParty = relatedParty;
    return this;
  }

  public Catalog addRelatedPartyItem(RelatedParty relatedPartyItem) {
    if (this.relatedParty == null) {
      this.relatedParty = new ArrayList<RelatedParty>();
    }
    this.relatedParty.add(relatedPartyItem);
    return this;
  }

   /**
   * List of parties involved in this catalog
   * @return relatedParty
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of parties involved in this catalog")

  public List<RelatedParty> getRelatedParty() {
    return relatedParty;
  }


  public void setRelatedParty(List<RelatedParty> relatedParty) {
    this.relatedParty = relatedParty;
  }


  public Catalog validFor(TimePeriod validFor) {
    
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


  public Catalog atBaseType(String atBaseType) {
    
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


  public Catalog atSchemaLocation(URI atSchemaLocation) {
    
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


  public Catalog atType(String atType) {
    
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
    Catalog catalog = (Catalog) o;
    return Objects.equals(this.id, catalog.id) &&
        Objects.equals(this.href, catalog.href) &&
        Objects.equals(this.catalogType, catalog.catalogType) &&
        Objects.equals(this.description, catalog.description) &&
        Objects.equals(this.lastUpdate, catalog.lastUpdate) &&
        Objects.equals(this.lifecycleStatus, catalog.lifecycleStatus) &&
        Objects.equals(this.name, catalog.name) &&
        Objects.equals(this.version, catalog.version) &&
        Objects.equals(this.category, catalog.category) &&
        Objects.equals(this.relatedParty, catalog.relatedParty) &&
        Objects.equals(this.validFor, catalog.validFor) &&
        Objects.equals(this.atBaseType, catalog.atBaseType) &&
        Objects.equals(this.atSchemaLocation, catalog.atSchemaLocation) &&
        Objects.equals(this.atType, catalog.atType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, catalogType, description, lastUpdate, lifecycleStatus, name, version, category, relatedParty, validFor, atBaseType, atSchemaLocation, atType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Catalog {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    catalogType: ").append(toIndentedString(catalogType)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    lastUpdate: ").append(toIndentedString(lastUpdate)).append("\n");
    sb.append("    lifecycleStatus: ").append(toIndentedString(lifecycleStatus)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    relatedParty: ").append(toIndentedString(relatedParty)).append("\n");
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
