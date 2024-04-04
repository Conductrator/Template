package com.conductrator.blueprint.model.entity.user;

import com.conductrator.blueprint.model.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Getter
@Setter
@Table(name = "table_user")
@Where(clause = "deleted = false")
@SQLDelete(sql = "UPDATE table_user SET deleted = true WHERE id = ?")
public class User extends BaseEntity {

  @Column(length = 35, unique = true, nullable = false)
  private String email;

  @Column(length = 16, nullable = false)
  private String password;

  @Column(length = 20, nullable = false)
  private String name;

  @Column(length = 20, nullable = false)
  private String surname;

  @ManyToMany(fetch = FetchType.LAZY)
  @JoinTable(
      name = "user_role",
      joinColumns = {@JoinColumn(name = "user_id")},
      inverseJoinColumns = {@JoinColumn(name = "role_id")})
  private Collection<Role> roles;

  private boolean deleted = false;
}
