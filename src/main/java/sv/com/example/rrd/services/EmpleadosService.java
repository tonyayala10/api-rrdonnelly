/**
 * 
 */
package sv.com.example.rrd.services;

import java.util.List;

import sv.com.example.rrd.entity.Empleados;

/**
 * @author tony
 *
 */
public interface EmpleadosService {
	
	List<Empleados> findAll();
	
	Empleados empleadoById(Long id);
	
	Empleados update(Empleados obj);
	
	Empleados create(Empleados obj);
	
	void delete(Empleados emp);
	
	List<Empleados> findAllActivos();

}
