package kr.co.jhta.erp.service;

import java.util.List;

import kr.co.jhta.erp.dto.StoreFindDto;

public interface StoreService {

	List<StoreFindDto> getStoreFinds(String keyword);
}
