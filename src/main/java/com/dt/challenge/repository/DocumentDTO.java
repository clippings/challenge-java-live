package com.dt.challenge.repository;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
@Builder
public class DocumentDTO {

  @NonNull
  private final String customerName;
  @NonNull
  private final String vatNumber;
  @NonNull
  private final String documentNumber;
  private final int type;
  private final float total;
  private String parentDocument;
}
