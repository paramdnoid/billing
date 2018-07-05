package org.aplatanao.billing.persistence;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface InvoiceRepository extends PagingAndSortingRepository<InvoiceTable, Long> {
    InvoiceTable getById(Long id);
}
