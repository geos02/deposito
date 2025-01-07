package cuentas;

/**
 * Clase que representa una cuenta bancaria
 * 
 */
public class CCuenta {

	/**
	 * Nombre del titular.
	 */
    private String nombre;
    /**
     * Número de la cuenta bancaria.
     */
    private String cuenta;
    /**
     * Saldo disponible.
     */
    private double saldo;
    /**
     * Tipo de interés.
     */
    private double tipoInterés; 

    /**
     * Constructor vacío.
     */
    public CCuenta() {
    }

    /**
     * Constructor con parámetros para crear una cuenta.
     * 
     * @param nom  (String) Nombre del titular.
     * @param cue  (String) Número de cuenta.
     * @param sal  (double) Saldo inicial.
     * @param tipo (double) Tipo de interés.
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }

    /**
     * Devuelve el saldo actual de la cuenta.
     * 
     * @return (double) El saldo disponible.
     */
    public double estado() {
        return getSaldo();
    }

    /**
     * Permite ingresar una cantidad de dinero.
     * 
     * @param cantidad (double) Cantidad a ingresar.
     * @throws Exception Si la cantidad es negativa.
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Permite retirar una cantidad de dinero.
     * 
     * @param cantidad (double) Cantidad a retirar.
     * @throws Exception Si la cantidad es negativa o si no hay saldo suficiente.
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0)
            throw new Exception("No se puede retirar una cantidad negativa");
        if (estado() < cantidad)
            throw new Exception("No hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

    /**
     * Obtiene el tipo de interés.
     * 
     * @return (double) El tipo de interés.
     */
    private double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Establece el tipo de interés de la cuenta.
     * 
     * @param tipoInterés (double) Nuevo tipo de interés.
     */
    private void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

    /**
     * Obtiene el saldo de la cuenta.
     * 
     * @return (double) El saldo actual de la cuenta.
     */
    private double getSaldo() {
        return saldo;
    }

    /**
     * Establece el saldo de la cuenta.
     * 
     * @param saldo (double) Nuevo saldo de la cuenta.
     */
    private void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Obtiene el número de cuenta.
     * 
     * @return (String) El número de cuenta bancaria.
     */
    private String getCuenta() {
        return cuenta;
    }

    /**
     * Establece el número de cuenta.
     * 
     * @param cuenta (String) Nuevo número de cuenta bancaria.
     */
    private void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Obtiene el nombre del titular de la cuenta.
     * 
     * @return (String) El nombre del titular de la cuenta.
     */
    private String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del titular de la cuenta.
     * 
     * @param nombre (String) Nuevo nombre del titular de la cuenta.
     */
    private void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
