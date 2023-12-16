package com.managebeans;

import java.io.Serializable;
import java.util.List;

import com.dao.IGhostNets;
import com.entities.GhostNets;

import jakarta.ejb.EJB;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;

@Named("ghostNetsMB")
@SessionScoped
public class GhostNetsMB implements Serializable {
	
	@EJB
	IGhostNets metier ; 
	
	private GhostNets ghostNets = new GhostNets() ; 
	private List<GhostNets> ghostList  ;
	
	
	public void initData() { 
		ghostList = metier.getAll();
	}
	
	public void add(GhostNets ghostNets) {
		metier.addOne(ghostNets);
	}
	
	public void update(Long id, GhostNets ghostNets) {
		metier.updateOne(id, ghostNets);
	}
	
	public void delete(Long id) {
		metier.deleteOne(id) ; 
	}
	
	public GhostNets getGhostNets() {
		return ghostNets;
	}

	public void setGhostNets(GhostNets ghostNets) {
		this.ghostNets = ghostNets;
	}

	public List<GhostNets> getGhostList() {
		return ghostList;
	}

	public void setGhostList(List<GhostNets> ghostList) {
		this.ghostList = ghostList;
	} 
	

}
