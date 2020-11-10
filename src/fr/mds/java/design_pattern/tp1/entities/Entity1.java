package fr.mds.java.design_pattern.tp1.entities;

public class Entity1 {
  private long id;
  private String data;
  
  public Entity1()
  {}

  public Entity1(long id, String data) {
	this.id = id;
	this.data = data;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }

  @Override
  public String toString() {
    return "Entity1 [id=" + id + ", data=" + data + "]";
  }
}
