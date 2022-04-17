package it.uniroma3.siw.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Allievo {

		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private long matricola;
		private String Nome;
		private String Cognome;
		private LocalDate dataDiNascita;
		private String luogoDiNascita;
		private String email;
		
		@ManyToOne
		private Societa societa;
		
	    @ManyToMany(mappedBy = "allievi")
	    private List<Corso> corsi;

		
		public String getNome() {
			return Nome;
		}
		public void setNome(String nome) {
			Nome = nome;
		}
		public String getCognome() {
			return Cognome;
		}
		public void setCognome(String cognome) {
			Cognome = cognome;
		}
		public LocalDate getDataDiNascita() {
			return dataDiNascita;
		}
		public void setDataDiNascita(LocalDate dataDiNascita) {
			this.dataDiNascita = dataDiNascita;
		}
		public String getLuogoDiNascita() {
			return luogoDiNascita;
		}
		public void setLuogoDiNascita(String luogoDiNascita) {
			this.luogoDiNascita = luogoDiNascita;
		}
		public long getMatricola() {
			return matricola;
		}
		public void setMatricola(long matricola) {
			this.matricola = matricola;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		
}