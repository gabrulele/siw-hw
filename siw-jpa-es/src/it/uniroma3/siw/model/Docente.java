package it.uniroma3.siw.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import java.time.LocalDate;
import java.util.List;

@Entity
public class Docente {

		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private String Nome;
		private String Cognome;
		private LocalDate dataDiNascita;
		private String luogoDiNascita;
		private long partitaIva;
		
		/*
		 * Potrebbe aver senso avere i corsi associati ad ogni docente, passando
		 * da una politica di fetch di default lazy, ad una eager.
		 */
		@OneToMany(fetch = FetchType.EAGER, mappedBy = "docente")
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
		public long getPartitaIva() {
			return partitaIva;
		}
		public void setPartitaIva(long partitaIva) {
			this.partitaIva = partitaIva;
		}
		
}
