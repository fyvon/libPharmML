//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.17 at 02:06:30 PM GMT 
//


package eu.ddmore.libpharmml.dom.modeldefn.pkmacro;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;
import eu.ddmore.libpharmml.dom.commontypes.PharmMLRootType;


/**
 * Type defines a PK macro.
 * 
 * <p>Java class for PKmacroType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PKmacroType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.pharmml.org/2013/03/CommonTypes}PharmMLRootType">
 *       &lt;sequence maxOccurs="unbounded">
 *         &lt;element name="Absorption" type="{http://www.pharmml.org/2013/03/ModelDefinition}AbsorptionOralMacroType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Compartment" type="{http://www.pharmml.org/2013/03/ModelDefinition}CompartmentMacroType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Depot" type="{http://www.pharmml.org/2013/03/ModelDefinition}DepotMacroType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Effect" type="{http://www.pharmml.org/2013/03/ModelDefinition}EffectMacroType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Elimination" type="{http://www.pharmml.org/2013/03/ModelDefinition}EliminationMacroType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="IV" type="{http://www.pharmml.org/2013/03/ModelDefinition}IVMacroType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Oral" type="{http://www.pharmml.org/2013/03/ModelDefinition}AbsorptionOralMacroType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Peripheral" type="{http://www.pharmml.org/2013/03/ModelDefinition}PeripheralMacroType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Transfer" type="{http://www.pharmml.org/2013/03/ModelDefinition}TransferMacroType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PKmacroType", propOrder = {
    "listOfMacro"
})
public class PKmacroList
    extends PharmMLRootType
{

    @XmlElements({
        @XmlElement(name = "Effect", type=EffectMacro.class, required = false),
        @XmlElement(name = "Compartment", type=CompartmentMacro.class, required = false),
        @XmlElement(name = "Transfer", type=TransferMacro.class, required = false),
        @XmlElement(name = "Oral", type=OralMacro.class, required = false),
        @XmlElement(name = "Elimination", type=EliminationMacro.class, required = false),
        @XmlElement(name = "IV", type=IVMacro.class,  required = false),
        @XmlElement(name = "Depot", type=DepotMacro.class,  required = false),
        @XmlElement(name = "Peripheral", type=PeripheralMacro.class, required = false),
        @XmlElement(name = "Absorption", type=AbsorptionMacro.class, required = false)
    })
    protected List<Macro> listOfMacro;

    /**
     * Gets the value of the absorptionAndCompartmentAndDepot property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the absorptionAndCompartmentAndDepot property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAbsorptionAndCompartmentAndDepot().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link EffectMacro }{@code >}
     * {@link JAXBElement }{@code <}{@link CompartmentMacro }{@code >}
     * {@link JAXBElement }{@code <}{@link TransferMacro }{@code >}
     * {@link JAXBElement }{@code <}{@link EliminationMacro }{@code >}
     * {@link JAXBElement }{@code <}{@link AbsorptionOralMacro }{@code >}
     * {@link JAXBElement }{@code <}{@link DepotMacro }{@code >}
     * {@link JAXBElement }{@code <}{@link IVMacro }{@code >}
     * {@link JAXBElement }{@code <}{@link PeripheralMacro }{@code >}
     * {@link JAXBElement }{@code <}{@link AbsorptionOralMacro }{@code >}
     * 
     * 
     */
    public List<Macro> getListOfMacro() {
        if (listOfMacro == null) {
            listOfMacro = new ArrayList<Macro>();
        }
        return this.listOfMacro;
    }
    
    public OralMacro createOral(){
    	OralMacro macro = new OralMacro();
    	getListOfMacro().add(macro);
    	return macro;
    }
    
    public AbsorptionMacro createAbsorption(){
    	AbsorptionMacro macro = new AbsorptionMacro();
    	getListOfMacro().add(macro);
    	return macro;
    }
    
    public CompartmentMacro createCompartment(){
    	CompartmentMacro macro = new CompartmentMacro();
    	getListOfMacro().add(macro);
    	return macro;
    }
    
    public DepotMacro createDepot(){
    	DepotMacro macro = new DepotMacro();
    	getListOfMacro().add(macro);
    	return macro;
    }
    
    public EffectMacro createEffect(){
    	EffectMacro macro = new EffectMacro();
    	getListOfMacro().add(macro);
    	return macro;
    }
    
    public EliminationMacro createElimination(){
    	EliminationMacro macro = new EliminationMacro();
    	getListOfMacro().add(macro);
    	return macro;
    }
    
    public IVMacro createIV(){
    	IVMacro macro = new IVMacro();
    	getListOfMacro().add(macro);
    	return macro;
    }
    
    public PeripheralMacro createPeripheral(){
    	PeripheralMacro macro = new PeripheralMacro();
    	getListOfMacro().add(macro);
    	return macro;
    }
    
    public TransferMacro createTransfer(){
    	TransferMacro macro = new TransferMacro();
    	getListOfMacro().add(macro);
    	return macro;
    }

}
