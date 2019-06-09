/**
 * 
 */
package sv.com.example.rrd.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import sv.com.example.rrd.utils.Constantes;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * @author tony
 *
 */

@Entity
@Table(name = "empleados")
public class Empleados implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4307004638330533051L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "empleado_id")
	private Long empleadoId;
	@Column(name = "empleado_primer_nombre", length = 50, nullable = false)
	private String primerNombre;
	@Column(name = "empleado_segundo_nombre", length = 50)
	private String segundoNombre;
	@Column(name = "empleado_primer_apellido", length = 50, nullable = false)
	private String primerApellido;
	@Column(name = "empleado_segundo_apellido", length = 50)
	private String segundoApellido;
	@Column(name = "empleado_apellido_casada", length = 50)
	private String apellidoCasada;
	@Column(name = "empleado_correo", length = 50)
	private String correo;
	@Column(name = "empleado_telefono", length = 8)
	private String telefono;
	@Column(name = "empleado_celular", length = 8)
	private String celular;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = Constantes.FORMAT_DD_MM_YYYY, timezone = Constantes.TIME_ZONE)
	@Column(name = "empleado_fecha_ingreso", nullable = false)
	private Date fechaIngreso;
	@Column(name = "empleado_activo", length = 1, nullable = false)
	private String activo;
	@Column(name = "empleado_comentario", length = 100)
	private String comentario;
	
	public Long getEmpleadoId() {
		return empleadoId;
	}
	public void setEmpleadoId(Long empleadoId) {
		this.empleadoId = empleadoId;
	}
	public String getPrimerNombre() {
		return primerNombre;
	}
	public void setPrimerNombre(String primerNombre) {
		this.primerNombre = primerNombre;
	}
	public String getSegundoNombre() {
		return segundoNombre;
	}
	public void setSegundoNombre(String segundoNombre) {
		this.segundoNombre = segundoNombre;
	}
	public String getPrimerApellido() {
		return primerApellido;
	}
	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}
	public String getSegundoApellido() {
		return segundoApellido;
	}
	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}
	public String getApellidoCasada() {
		return apellidoCasada;
	}
	public void setApellidoCasada(String apellidoCasada) {
		this.apellidoCasada = apellidoCasada;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public Date getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	public String getActivo() {
		return activo;
	}
	public void setActivo(String activo) {
		this.activo = activo;
	}
	public String getComentario() {
		return comentario;
	}
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	
	/*public String getNombreCompleto() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.primerNombre).append(" ").append(this.segundoNombre).append(" ").append(this.primerApellido)
		.append(", ").append(this.segundoApellido).append(" ").append(this.primerApellido).append(" ").append(this.apellidoCasada);		
		return sb.toString();			
	}*/
}
