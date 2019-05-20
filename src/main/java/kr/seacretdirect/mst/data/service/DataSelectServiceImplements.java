package kr.seacretdirect.mst.data.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import kr.seacretdirect.mst.data.repo.DataSelectRepository;
import kr.seacretdirect.mst.data.vo.ProductVO;

@Service
public class DataSelectServiceImplements {
	@Inject
	private DataSelectRepository repo;
	
	public List<ProductVO> getProduList() throws Exception{
		return repo.getList();
	}
	
}
