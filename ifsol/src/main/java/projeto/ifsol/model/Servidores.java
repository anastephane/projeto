package projeto.ifsol.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Servidores implements Serializable {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private long id;
	private String nomeServidor;
	private String matricula;
	private String senha;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNomeServidor() {
		return nomeServidor;
	}
	public void setNomeServidor(String nomeServidor) {
		this.nomeServidor = nomeServidor;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}

}
