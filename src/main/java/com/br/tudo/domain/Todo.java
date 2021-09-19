package com.br.tudo.domain;

import java.io.Serializable;
import java.time.LocalDateTime;
import javax.persistence.*;


@Entity
@Table(name = "Todo")
public class Todo implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String titulo;
	private String descricao;
	private LocalDateTime dataParaFianalizar;
	private boolean finzlizado = false;

	public Todo() {
		super();
	}

	public Todo(Integer id, String titulo, String descricao, LocalDateTime dataParaFianalizar, boolean finzlizado) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.descricao = descricao;
		this.dataParaFianalizar = dataParaFianalizar;
		this.finzlizado = finzlizado;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public LocalDateTime getDataParaFianalizar() {
		return dataParaFianalizar;
	}

	public void setDataParaFianalizar(LocalDateTime dataParaFianalizar) {
		this.dataParaFianalizar = dataParaFianalizar;
	}

	public boolean isFinzlizado() {
		return finzlizado;
	}

	public void setFinzlizado(boolean finzlizado) {
		this.finzlizado = finzlizado;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Todo other = (Todo) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
