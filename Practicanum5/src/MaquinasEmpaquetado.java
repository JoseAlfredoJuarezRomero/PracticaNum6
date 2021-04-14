/*******************************************************************************
 * 2021, All rights reserved.
 *******************************************************************************/

// Start of user code (user defined imports)

// End of user code

/**
 * Description of MaquinasEmpaquetado.
 * 
 * @author Alfredo Juarez
 */
public class MaquinasEmpaquetado {
	private static final float CostoMaquinas = 0.1888888F;

	/**
	 * Description of the property tipoEmpaques.
	 */
	private String tipoEmpaques = "";

	/**
	 * Description of the property catEmpaquesMin.
	 */
	private float catEmpaquesMin = 3;

	/**
	 * Description of the property costoEmpaquetado.
	 */
	private float costoEmpaquetado = 0.06F;

	/**
	 * Description of the property costoBotellaMin.
	 */
	private float costoBotellaMin = 0F;

	// Start of user code (user defined attributes for MaquinasEmpaquetado)

	// End of user code

	/**
	 * The constructor.
	 */
	public MaquinasEmpaquetado() {
		// Start of user code constructor for MaquinasEmpaquetado)
		super();
		// End of user code
	}

	// Start of user code (user defined methods for MaquinasEmpaquetado)
	

	// End of user code
	/**
	 * Returns tipoEmpaques.
	 * @return tipoEmpaques 
	 */
	public String getTipoEmpaques() {
		return this.tipoEmpaques;
	}

	/**
	 * Sets a value to attribute tipoEmpaques. 
	 * @param newTipoEmpaques 
	 */
	public void setTipoEmpaques(String newTipoEmpaques) {
		this.tipoEmpaques = newTipoEmpaques;
	}

	/**
	 * Returns catEmpaquesMin.
	 * @return catEmpaquesMin 
	 */
	public float getCatEmpaquesMin() {
		return this.catEmpaquesMin;
	}

	/**
	 * Sets a value to attribute catEmpaquesMin. 
	 * @param newCatEmpaquesMin 
	 */
	public void setCatEmpaquesMin(float newCatEmpaquesMin) {
		this.catEmpaquesMin = newCatEmpaquesMin;
	}

	/**
	 * Returns costoEmpaquetado.
	 * @return costoEmpaquetado 
	 */
	public float getCostoEmpaquetado() {
		return this.costoEmpaquetado;
	}

	/**
	 * Sets a value to attribute costoEmpaquetado. 
	 * @param newCostoEmpaquetado 
	 * @return 
	 */
	public float setCostoEmpaquetado(float newCostoEmpaquedado ) {

		double Costo=costoEmpaquetado*CostoMaquinas/27;
		
		costoEmpaquetado=0.06F;
		Costo+=costoEmpaquetado;

		return this.costoEmpaquetado;
	}

	/**
	 * Returns costoBotellaMin.
	 * @return costoBotellaMin 
	 */
	public float getCostoBotellaMin() {
		return this.costoBotellaMin;
	}

	/**
	 * Sets a value to attribute costoBotellaMin. 
	 * @param newCostoBotellaMin 
	 */
	public void setCostoBotellaMin(float newCostoBotellaMin) {
		this.costoBotellaMin = newCostoBotellaMin;
	}


public static void main(String[] args) {
	
	System.out.println("El costo de empaquetado es: " + CostoMaquinas );
}
}

