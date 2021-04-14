/*******************************************************************************
 * 2021, All rights reserved.
 *******************************************************************************/
package Clases.ito.poo;

// Start of user code (user defined imports)

// End of user code

/**
 * Description of Compa帽iaManufacturera.
 * 
 * @author Alfredo Juarez
 */
public class Compa駃aManufacturera{
	/**
	 * Description of the property descripci贸n,.
	 */
	private String descripcion="";

	/**
	 * Description of the property fechaAquisicion.
	 */
	private String fechaAquisicion = "";

	/**
	 * Description of the property costo.
	 */
	private float costo = 0F;

	// Start of user code (user defined attributes for Compa帽iaManufacturera)

	// End of user code

	/**
	 * The constructor.
	 */
	public Compa駃aManufacturera() {
		// Start of user code constructor for Compa帽iaManufacturera)
		super();
		// End of user code
	}

	// Start of user code (user defined methods for Compa帽iaManufacturera)

	// End of user code
	/**
	 * Returns descripci贸n,.
	 * @return descripci贸n, 
	 */
	public String getDescripcion()
	{
		return this.descripcion;
	}

	/**
	 * Sets a value to attribute descripci贸n,. 
	 * @param newDescripci贸n, 
	 */
	public void setDescripcion(
	String newDescripcion)
	{
	    this.descripcion = newDescripcion;
	}

	/**
	 * Returns fechaAquisicion.
	 * @return fechaAquisicion 
	 */
	public String getFechaAquisicion() {
		return this.fechaAquisicion;
	}

	/**
	 * Sets a value to attribute fechaAquisicion. 
	 * @param newFechaAquisicion 
	 */
	public void setFechaAquisicion(String newFechaAquisicion) {
		this.fechaAquisicion = newFechaAquisicion;
	}

	/**
	 * Returns costo.
	 * @return costo 
	 */
	public float getCosto() {
		return this.costo;
	}

	/**
	 * Sets a value to attribute costo. 
	 * @param newCosto 
	 */
	public void setCosto(float newCosto) {
		this.costo = newCosto;
	}

}
