package com.conductrator.blueprint.model.entity.bus;

import com.conductrator.blueprint.model.entity.BaseEntity;
import com.conductrator.blueprint.model.entity.user.User;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "table_agency")
public class Agency extends BaseEntity {

  @Column(length = 30, unique = true, nullable = false)
  private String name;

  @Column(length = 15)
  private String phoneNumber;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "owner_id", nullable = false)
  private User owner;

  // TODO Add owned buses
}
