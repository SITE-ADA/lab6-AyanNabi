package az.edu.ada.wm2.lab6.model.dto;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

public class ProductResponseDto {
    private UUID id;

    private String productName;

    private BigDecimal price;

    private LocalDate expirationDate;

    private List<String> categoryNames;
}
