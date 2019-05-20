package kr.seacretdirect.mst.data.service;

import java.util.List;

import kr.seacretdirect.mst.data.vo.ProductVO;

public interface DataSelectService {
	public List<ProductVO>getList()throws Exception;
}
