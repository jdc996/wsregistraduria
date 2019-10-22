
package webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para cambioClaveRequest complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="cambioClaveRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="confirmarNuevaClave" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nuevaClave" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cambioClaveRequest", propOrder = {
    "confirmarNuevaClave",
    "nuevaClave"
})
public class CambioClaveRequest {

    protected String confirmarNuevaClave;
    protected String nuevaClave;

    /**
     * Obtiene el valor de la propiedad confirmarNuevaClave.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfirmarNuevaClave() {
        return confirmarNuevaClave;
    }

    /**
     * Define el valor de la propiedad confirmarNuevaClave.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfirmarNuevaClave(String value) {
        this.confirmarNuevaClave = value;
    }

    /**
     * Obtiene el valor de la propiedad nuevaClave.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNuevaClave() {
        return nuevaClave;
    }

    /**
     * Define el valor de la propiedad nuevaClave.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNuevaClave(String value) {
        this.nuevaClave = value;
    }

}
