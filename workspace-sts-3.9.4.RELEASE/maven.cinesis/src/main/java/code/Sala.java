package code;


import java.lang.reflect.Array;

//import java.util.Hashtable.Enumerator;
import code.CalidadSonidoEnum;


public class Sala {

	private Integer idSala;
	
	private Integer idPelicula;
	
	private Integer numFilas;
	
	private Integer numColumnas;
	
	private Integer numAsientosVIP;
	
	private Integer numAsientosMinusvalidos;

	private CalidadSonidoEnum calidadSonido;

	private Boolean _3D;
	
	
	public Sala(Integer id, Integer idPeli, Integer numFilas, Integer numColumnas, Integer numAsientosVip, Integer numAsienMinus, CalidadSonidoEnum calidadSonido, boolean _3D){
		this.idSala = id;
		this.idPelicula = idPeli;
		this.numFilas = numFilas;
		this.numColumnas = numColumnas;
		this.numAsientosVIP = numAsientosVip;
		this.numAsientosMinusvalidos = numAsienMinus;
		this.calidadSonido = calidadSonido;
		this._3D = _3D;
		
	}
	
	
	

	public void crearSala(String IdAdministrador, Integer numFilas,
			Integer numColumnas, Integer numAsientosVIP,
			Integer numAsientosMinusvalidos, CalidadSonidoEnum calidadSonido,
			Boolean _3D) {
		//insertar
		Sala S = new Sala(null, null, numFilas, numColumnas, numAsientosVIP, numAsientosMinusvalidos, calidadSonido, _3D);
		
	}

	public void mostrarSala(Integer idSala) {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	public void modificarSala(String IdAdministrador, Integer numFilas,
			Integer numColumnas, Integer numAsientosVIP,
			Integer numAsientosMinusvalidos, CalidadSonidoEnum calidadSonido,
			Boolean _3D, Integer nunAsientosOcupados,
			Integer numAsientosLibres, Integer idSala) {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	
	public void eliminarSala(Integer idSala) {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	public void mostrarFormulario() {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	
	public Array elegirAsientos() {
		// begin-user-code
		// TODO Auto-generated method stub
		return null;
		// end-user-code
	}




	public Integer getIdSala() {
		return idSala;
	}




	public void setIdSala(Integer idSala) {
		this.idSala = idSala;
	}




	public Integer getIdPelicula() {
		return idPelicula;
	}




	public void setIdPelicula(Integer idPelicula) {
		this.idPelicula = idPelicula;
	}




	public Integer getNumFilas() {
		return numFilas;
	}




	public void setNumFilas(Integer numFilas) {
		this.numFilas = numFilas;
	}




	public Integer getNumColumnas() {
		return numColumnas;
	}




	public void setNumColumnas(Integer numColumnas) {
		this.numColumnas = numColumnas;
	}




	public Integer getNumAsientosVIP() {
		return numAsientosVIP;
	}




	public void setNumAsientosVIP(Integer numAsientosVIP) {
		this.numAsientosVIP = numAsientosVIP;
	}




	public Integer getNumAsientosMinusvalidos() {
		return numAsientosMinusvalidos;
	}




	public void setNumAsientosMinusvalidos(Integer numAsientosMinusvalidos) {
		this.numAsientosMinusvalidos = numAsientosMinusvalidos;
	}




	public CalidadSonidoEnum getCalidadSonido() {
		return calidadSonido;
	}




	public void setCalidadSonido(CalidadSonidoEnum calidadSonido) {
		this.calidadSonido = calidadSonido;
	}




	public Boolean get_3D() {
		return _3D;
	}




	public void set_3D(Boolean _3d) {
		_3D = _3d;
	}
}