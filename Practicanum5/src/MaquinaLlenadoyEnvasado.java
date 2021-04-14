/*******************************************************************************
 * 2021, All rights reserved.
 *******************************************************************************/

// Start of user code (user defined imports)

// End of user code

/**
 * Description of MaquinaLlenadoyEnvasado.
 * 
 * @author Alfredo Juarez
 */
public class MaquinaLlenadoyEnvasado {
	private static final float CostoLlenado = 0.83333F;;

	/**
	 * Description of the property  cantiEnvasesLlenadosMin.
	 */
	private float cantiEnvasesLlenadosMin = 0F;

	/**
	 * Description of the property listaRegulacionMililitros.
	 */
	private String listaRegulacionMililitros = "";

	/**
	 * Description of the property costoLlenadoyEnvasado.
	 */
	private float costoLlenadoyEnvasado = 0.25F;

	/**
	 * Description of the property costoBotella.
	 */
	private float costoBotella = 0F;

	// Start of user code (user defined attributes for MaquinaLlenadoyEnvasado)

	// End of user code

	/**
	 * The constructor.
	 */
	public MaquinaLlenadoyEnvasado() {
		// Start of user code constructor for MaquinaLlenadoyEnvasado)
		super();
		// End of user code
	}

	// Start of user code (user defined methods for MaquinaLlenadoyEnvasado)

	// End of user code
	/**
	 * Returns  cantiEnvasesLlenadosMin.
	 * @return  cantiEnvasesLlenadosMin 
	 */
	public float getcantiEnvasesLlenadosMin() {
		return this. cantiEnvasesLlenadosMin;
	}

	/**
	 * Sets a value to attribute  cantiEnvasesLlenadosMin. 
	 * @param new cantiEnvasesLlenadosMin 
	 */
	public void setcantiEnvasesLlenadosMin(float newcantiEnvasesLlenadosMin) {
	    this. cantiEnvasesLlenadosMin = newcantiEnvasesLlenadosMin;
	}

	/**
	 * Returns listaRegulacionMililitros.
	 * @return listaRegulacionMililitros 
	 */
	public String getListaRegulacionMililitros() {
		return this.listaRegulacionMililitros;
	}

	/**
	 * Sets a value to attribute listaRegulacionMililitros. 
	 * @param newListaRegulacionMililitros 
	 */
	public void setListaRegulacionMililitros(String newListaRegulacionMililitros) {
		this.listaRegulacionMililitros = newListaRegulacionMililitros;
	}

	/**
	 * Returns costoLlenadoyEnvasado.
	 * @return costoLlenadoyEnvasado 
	 */
	public float getCostoLlenadoyEnvasado() {
		return this.costoLlenadoyEnvasado;
	}

	/**
	 * Sets a value to attribute costoLlenadoyEnvasado. 
	 * @param newCostoLlenadoyEnvasado 
	 */
	public void CostoLlenadoyEnvasado(float porcentaje,float CostoLlenado) {
		
		float CostoMaquina=5000F;
		double CostoLlenad=CostoLlenado*CostoMaquina/15;
		CostoLlenado=0.25F;
		CostoLlenado+=costoLlenadoyEnvasado;
	}

	/**
	 * Returns costoBotella.
	 * @return costoBotella 
	 */
	public float getCostoBotella() {
		return this.costoBotella;
	}

	/**
	 * Sets a value to attribute costoBotella. 
	 * @param newCostoBotella 
	 */
	public void setCostoBotella(float newCostoBotella) {
		this.costoBotella = newCostoBotella;
	}



public static void main(String[] args) {
	
	System.out.println("El costo de llenado y envasado de una botella es: "+ CostoLlenado  );
}
}
