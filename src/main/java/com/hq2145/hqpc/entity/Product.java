package com.hq2145.hqpc.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "code", nullable = false)
    private String code;

    @Column(name = "price", nullable = false)
    private int price;

    @Column(name = "discount", nullable = false)
    private float discount;

    @Column(name = "warranty", nullable = false)
    private int warranty;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "category_code", referencedColumnName = "code",nullable = false)
    private ProductCategory category;

    @Column(name = "status", nullable = false)
    private boolean status;

    @Column(name = "detail", columnDefinition = "json")
    private String detail;

    @Column(name = "info", nullable = false)
    private String info;

    @Column(name = "avatar", nullable = true)
    private String avatar;

    @Column(name = "images", nullable = true)
    private String images;

    @OneToMany(mappedBy = "rating", fetch = FetchType.LAZY)
    @ToString.Exclude
    List<Rating> ratingList;

    @OneToMany(mappedBy = "order_detail", fetch = FetchType.LAZY)
    @ToString.Exclude
    List<OrderDetail> orderDetails;

    @Column(name = "create_by", nullable = false)
    private String createdBy;

    @Column(name = "create_date", nullable = false)
    private LocalDateTime createdDate;

    @Column(name = "modified_by", nullable = false)
    private LocalDateTime modifiedBy;

    @Column(name = "modified_date", nullable = false)
    private LocalDateTime modifiedDate;
}