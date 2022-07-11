package com.dt.challenge.repository;

import java.util.List;

public class DocumentRepository {

  public List<DocumentDTO> getAll() {
    return List.of(
        new DocumentDTO("Vendor 1", "123456789", "1000000257", 1, 400),
        new DocumentDTO("Vendor 1", "123456789", "1000000260", 2, 100, "1000000257"),
        new DocumentDTO("Vendor 1", "123456789", "1000000261", 3, 50, "1000000257"),
        new DocumentDTO("Vendor 1", "123456789", "1000000264", 1, 1600)
    );
  }

}
