package com.conductrator.blueprint.model.entity.user;

import com.conductrator.blueprint.model.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Getter
@Setter
@Table(name = "table_role")
public class Role extends BaseEntity {

  @ManyToMany(mappedBy = "roles")
  private Collection<User> users;

  @Enumerated(EnumType.STRING)
  private UserRoles userRole;
}
