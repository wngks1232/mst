package kr.seacretdirect.mst.data.repo;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import kr.seacretdirect.mst.data.vo.ProductVO;

@Repository
public class DataSelectImplements implements DataSelectRepository{
	/*
	 * @Inject private SqlSession session;
	 */
	
	@Override
	public List<ProductVO> getList() throws Exception {
		/* return session.selectList("getList"); */
		return null;
	}
	

}
