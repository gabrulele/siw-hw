package it.uniroma3.siw.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Societa {

		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private String ragioneSociale;
		private String via;
		private int numeroCivico;
		private String comune;
		private long cap;
		private String provincia;
		private long numeroDiTelefono;
		
		public String getRagioneSociale() {
			return ragioneSociale;
		}
		public void setRagioneSociale(String ragioneSociale) {
			this.ragioneSociale = ragioneSociale;
		}
		public String getVia() {
			return via;
		}
		public void setVia(String via) {
			this.via = via;
		}
		public int getNumeroCivico() {
			return numeroCivico;
		}
		public void setNumeroCivico(int numeroCivico) {
			this.numeroCivico = numeroCivico;
		}
		public String getComune() {
			return comune;
		}
		public void setComune(String comune) {
			this.comune = comune;
		}
		public long getCap() {
			return cap;
		}
		public void setCap(long cap) {
			this.cap = cap;
		}
		public String getProvincia() {
			return provincia;
		}
		public void setProvincia(String provincia) {
			this.provincia = provincia;
		}
		public long getNumeroDiTelefono() {
			return numeroDiTelefono;
		}
		public void setNumeroDiTelefono(long numeroDiTelefono) {
			this.numeroDiTelefono = numeroDiTelefono;
		}
		
}