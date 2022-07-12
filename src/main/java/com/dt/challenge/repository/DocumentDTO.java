package com.dt.challenge.repository;

import java.util.Objects;

public class DocumentDTO {

  private final String customerName;
  private final String vatNumber;
  private final String documentNumber;
  private final int type;
  private final float total;

  private String parentDocument;


  public DocumentDTO(String customerName, String vatNumber, String documentNumber, int type,
      float total) {
    this.customerName = customerName;
    this.vatNumber = vatNumber;
    this.documentNumber = documentNumber;
    this.type = type;
    this.total = total;
  }

  public DocumentDTO(String customerName, String vatNumber, String documentNumber, int type,
      float total, String parentDocument) {
    this.customerName = customerName;
    this.vatNumber = vatNumber;
    this.documentNumber = documentNumber;
    this.type = type;
    this.total = total;
    this.parentDocument = parentDocument;
  }

  public String getCustomerName() {
    return customerName;
  }

  public String getVatNumber() {
    return vatNumber;
  }

  public String getDocumentNumber() {
    return documentNumber;
  }

  public int getType() {
    return type;
  }

  public float getTotal() {
    return total;
  }

  public String getParentDocument() {
    return parentDocument;
  }

  public void setParentDocument(String parentDocument) {
    this.parentDocument = parentDocument;
  }

  @Override
  public String toString() {
    return "DocumentDTO{" +
        "customerName='" + customerName + '\'' +
        ", vatNumber='" + vatNumber + '\'' +
        ", documentNumber='" + documentNumber + '\'' +
        ", type=" + type +
        ", total=" + total +
        ", parentDocument='" + parentDocument + '\'' +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentDTO that = (DocumentDTO) o;
    return type == that.type && Float.compare(that.total, total) == 0
        && customerName.equals(that.customerName) && vatNumber.equals(that.vatNumber)
        && documentNumber.equals(that.documentNumber) && Objects.equals(parentDocument,
        that.parentDocument);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerName, vatNumber, documentNumber, type, total, parentDocument);
  }
}
