/**
 * 
 */
package sv.com.example.rrd.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sv.com.example.rrd.entity.Empleados;
import sv.com.example.rrd.repository.EmpleadosRepo;

/**
 * @author tony
 *
 */

@Service
@Transactional
public class EmpleadosServiceImp implements EmpleadosService {
	
	@Autowired
	EmpleadosRepo repo;

	/* (non-Javadoc)
	 * @see sv.com.example.rrd.services.EmpleadosService#findAll()
	 */
	@Override
	public List<Empleados> findAll() {
		// TODO Auto-generated method stub
		return (List<Empleados>) repo.findAll();
	}

	/* (non-Javadoc)
	 * @see sv.com.example.rrd.services.EmpleadosService#empleadoById(java.lang.Long)
	 */
	@Override
	public Empleados empleadoById(Long id) {
		// TODO Auto-generated method stub
		Empleados empleado = repo.findOne(id);
		return empleado;
	}

	/* (non-Javadoc)
	 * @see sv.com.example.rrd.services.EmpleadosService#update(sv.com.example.rrd.entity.Empleados)
	 */
	@Override
	public Empleados update(Empleados obj) {
		// TODO Auto-generated method stub
		return repo.save(obj);
	}

	/* (non-Javadoc)
	 * @see sv.com.example.rrd.services.EmpleadosService#create(sv.com.example.rrd.entity.Empleados)
	 */
	@Override
	public Empleados create(Empleados obj) {
		// TODO Auto-generated method stub
		return repo.save(obj);
	}

	/* (non-Javadoc)
	 * @see sv.com.example.rrd.services.EmpleadosService#delete(sv.com.example.rrd.entity.Empleados)
	 */
	@Override
	public void delete(Empleados emp) {
		// TODO Auto-generated method stub
		repo.delete(emp);
	}

	/* (non-Javadoc)
	 * @see sv.com.example.rrd.services.EmpleadosService#findAllActivos()
	 */
	@Override
	public List<Empleados> findAllActivos() {
		// TODO Auto-generated method stub
		return (List<Empleados>) repo.findAllByActiveEmpleados("1");
	}

}
