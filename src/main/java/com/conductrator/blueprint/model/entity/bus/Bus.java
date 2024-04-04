package com.conductrator.blueprint.model.entity.bus;

import com.conductrator.blueprint.model.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "table_bus")
public class Bus extends BaseEntity {

  @Column(length = 5, unique = true, nullable = false)
  private String code;

  @Column(length = 10, nullable = false)
  private String model;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "agency_id", nullable = false)
  private Agency agency;

  private int capacity;
}
