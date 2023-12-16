package com.managebeans;

import java.io.Serializable;

import com.entities.ReporterPerson;

import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;

@Named("repMB")
@SessionScoped
public class ReportersMB implements  Serializable {
	
		private ReporterPerson reporterPerson = new ReporterPerson() ;
		
		

		public ReporterPerson getReporterPerson() {
			return reporterPerson;
		}

		public void setReporterPerson(ReporterPerson reporterPerson) {
			this.reporterPerson = reporterPerson;
		} 

}
