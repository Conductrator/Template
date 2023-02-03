package com.conductrator.blueprint.model.entity.trip;

import com.conductrator.blueprint.model.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "table_trip_schedule")
public class TripSchedule extends BaseEntity {

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "trip_id")
  private Trip trip;
}
