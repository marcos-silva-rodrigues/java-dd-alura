package br.com.alura.codechella.domain.evento;

import br.com.alura.codechella.domain.ingresso.TipoIngresso;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Evento {

  private UUID uuid;
  private Categoria categoria;
  private String descricao;
  private LocalDateTime data;
  private Endereco endereco;

  private List<TipoIngresso> tipoIngressos = new ArrayList<>();

  public Evento(Categoria categoria, String descricao, LocalDateTime data, Endereco endereco) {
    this.categoria = categoria;
    this.descricao = descricao;
    this.data = data;
    this.endereco = endereco;

    createUuid();
  }

  private void createUuid() {
    this.uuid = UUID.randomUUID();
  }

  public void incluiNovoTipoDeIngresso(TipoIngresso tipoIngresso) {
    tipoIngressos.add(tipoIngresso);
  }

  public Categoria getCategoria() {
    return categoria;
  }

  public void setCategoria(Categoria categoria) {
    this.categoria = categoria;
  }

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public LocalDateTime getData() {
    return data;
  }

  public void setData(LocalDateTime data) {
    this.data = data;
  }

  public Endereco getEndereco() {
    return endereco;
  }

  public void setEndereco(Endereco endereco) {
    this.endereco = endereco;
  }

  public List<TipoIngresso> getTipoIngressos() {
    return tipoIngressos;
  }

}
