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
public class Corso {

		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private String Nome;
		private LocalDate dataDiInizio;
		private float durataMensile;
		
		/*
		 * La politica di fetch di default è già eager.
		 */
		@ManyToOne
		private Docente docente;
		
	    @ManyToMany
	    private List<Allievo> allievi;

		public String getNome() {
			return Nome;
		}
		public void setNome(String nome) {
			Nome = nome;
		}
		public LocalDate getDataDiInizio() {
			return dataDiInizio;
		}
		public void setDataDiInizio(LocalDate dataDiInizio) {
			this.dataDiInizio = dataDiInizio;
		}
		public float getDurataMensile() {
			return durataMensile;
		}
		public void setDurataMensile(float durataMensile) {
			this.durataMensile = durataMensile;
		}
		
		
		
		
}