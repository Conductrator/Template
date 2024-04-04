package com.conductrator.blueprint.model.entity.bus;

import com.conductrator.blueprint.model.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Table(name = "table_stop")
public class Stop extends BaseEntity {

  @Column(length = 5)
  private String code;

  @Column(length = 30)
  private String name;

  @Column(length = 100)
  private String detail;
}
