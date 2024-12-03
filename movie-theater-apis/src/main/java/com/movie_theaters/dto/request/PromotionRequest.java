package com.movie_theaters.dto.request;

import com.movie_theaters.entity.Bill;
import com.movie_theaters.entity.enums.StatusPromotion;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;



import java.time.LocalDateTime;
import java.util.Set;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PromotionRequest {
    private Long id;

    @NotBlank(message = "Thông tin không được để trống")
    private String info;

//    @NotNull(message = "Image file must be provided")
    private String imageUrl;

    @NotNull(message = "Giá trị khuyến mãi không được để trống")
    private Double discount;

    @NotNull(message = "Start date cannot be null")
    private LocalDateTime startDateTime;

    @NotNull(message = "End date cannot be null")
    private LocalDateTime endDateTime;

//    @NotBlank(message = "Trạng thái không được để trống")
    private StatusPromotion statusPromotion;

    private Set<Bill> bills;

}