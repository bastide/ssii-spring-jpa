package ssii.entity;

import jakarta.persistence.*;

import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
@ToString
public class Personne {

    @Id
    private Integer matricule;

    @NonNull
    private String nom;

}
