//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-661 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.05.27 at 04:06:26 PM PDT 
//


package ebay.apis.eblbasecomponents;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Reports items that allegedly infringe your copyright, trademark, or other 
 * 				intellectual property rights. You can report one or more items at a time with this 
 * 				call. You must be a member of the Verified Rights Owner (VeRO) Program to use this 
 * 				call. 
 * 			
 * 
 * <p>Java class for VeROReportItemsRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VeROReportItemsRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="RightsOwnerID" type="{urn:ebay:apis:eBLBaseComponents}UserIDType" minOccurs="0"/>
 *         &lt;element name="ReportItems" type="{urn:ebay:apis:eBLBaseComponents}VeROReportItemsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VeROReportItemsRequestType", propOrder = {
    "rightsOwnerID",
    "reportItems"
})
public class VeROReportItemsRequestType
    extends AbstractRequestType
{

    @XmlElement(name = "RightsOwnerID")
    protected String rightsOwnerID;
    @XmlElement(name = "ReportItems")
    protected VeROReportItemsType reportItems;

    /**
     * Gets the value of the rightsOwnerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRightsOwnerID() {
        return rightsOwnerID;
    }

    /**
     * Sets the value of the rightsOwnerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRightsOwnerID(String value) {
        this.rightsOwnerID = value;
    }

    /**
     * Gets the value of the reportItems property.
     * 
     * @return
     *     possible object is
     *     {@link VeROReportItemsType }
     *     
     */
    public VeROReportItemsType getReportItems() {
        return reportItems;
    }

    /**
     * Sets the value of the reportItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link VeROReportItemsType }
     *     
     */
    public void setReportItems(VeROReportItemsType value) {
        this.reportItems = value;
    }

}
