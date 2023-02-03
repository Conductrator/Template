package com.conductrator.blueprint.model.entity.trip;

import com.conductrator.blueprint.model.entity.BaseEntity;
import com.conductrator.blueprint.model.entity.user.User;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Table(name = "table_ticket")
public class Ticket extends BaseEntity {

  private int seatNumber;
  private boolean cancellable;
  private LocalDateTime tripDateTime;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "passenger_id")
  private User passenger;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "trip_schedule_id")
  private TripSchedule tripSchedule;
}
