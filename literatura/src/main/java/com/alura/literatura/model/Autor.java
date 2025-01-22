package com.alura.literatura.model;



import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Autor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private LocalDate fechaNacimiento;
    private LocalDate fechaFallecimiento;

    // Getters y setters
    // Constructor vacío y parametrizado
}
