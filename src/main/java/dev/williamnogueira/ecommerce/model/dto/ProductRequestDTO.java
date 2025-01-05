package dev.williamnogueira.ecommerce.model.dto;

import dev.williamnogueira.ecommerce.model.CategoryEnum;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

public record ProductRequestDTO(@NotBlank
                                String sku,
                                @NotBlank
                                String name,
                                @NotBlank
                                String label,
                                @NotNull
                                CategoryEnum category,
                                @NotNull
                                BigDecimal price,
                                @NotNull
                                BigDecimal discount,
                                @NotNull
                                Byte installments) {
}
