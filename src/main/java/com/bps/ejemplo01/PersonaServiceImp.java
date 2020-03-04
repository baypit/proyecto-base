package com.bps.ejemplo01;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaServiceImp implements PersonaService{

	@Autowired
	private PersonaRepositorio repositorio;
	
	
	@Override
	public List<Persona> listar() {
		// TODO Auto-generated method stub
		return repositorio.findAll();
	}

	@Override
	public Persona listarId(int id) {
		// TODO Auto-generated method stub
		Persona per = repositorio.findById(id);
		
		return per;
	}

	@Override
	public Persona add(Persona p) {
		// TODO Auto-generated method stub
		return repositorio.save(p);
	}

	@Override
	public Persona edit(Persona p) {
		// TODO Auto-generated method stub
		
		
		return repositorio.save(p);
	}

	@Override
	public Persona delete(int idPersona) {
		// TODO Auto-generated method stub
		Persona p = repositorio.findById(idPersona);
		if(p!= null){
			System.out.println("Persona "+ p);
			System.out.println("Persona nombre "+ p.getName());
			System.out.println("Persona apellido "+ p.getApellido());
			repositorio.delete(p);
		}
		
		
		return p;
	}

}
