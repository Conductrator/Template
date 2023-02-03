package com.conductrator.blueprint.model.entity.trip;

import com.conductrator.blueprint.model.entity.BaseEntity;
import com.conductrator.blueprint.model.entity.bus.Agency;
import com.conductrator.blueprint.model.entity.bus.Bus;
import com.conductrator.blueprint.model.entity.bus.Stop;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "table_trip")
public class Trip extends BaseEntity {

  private int fare;
  private int tripDuration;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "bus_id")
  private Bus bus;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "agency_id")
  private Agency agency;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "source_id")
  private Stop source;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "destination_id")
  private Stop destination;
}
