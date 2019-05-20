package kr.seacretdirect.mst.data.repo;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.seacretdirect.mst.data.vo.ProductVO;


public interface DataSelectRepository {
	public List<ProductVO> getList() throws Exception;
}
